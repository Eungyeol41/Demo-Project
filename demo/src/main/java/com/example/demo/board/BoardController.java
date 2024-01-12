package com.example.demo.board;

import com.example.demo.board.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BoardController {

	private final BoardService boardService;
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}

	private static final String folderPath = "/board/";

	private static final Logger LOGGER = LoggerFactory.getLogger(BoardController.class);


	@GetMapping(folderPath + "list.do")
	public String boardList(Model model) {
		List<BoardDTO> boardList = boardService.selectList();

		model.addAttribute("size", boardList.size());
		model.addAttribute("boardList", boardList);

		return "board/list";
	}

	@GetMapping(folderPath + "view.do")
	public String view(@ModelAttribute("boardDTO") BoardDTO boardDTO, Model model) {
		BoardDTO selectVO = boardService.selectContent(boardDTO);

		model.addAttribute("selectVO", selectVO);

		return "board/list";
	}

	@GetMapping(folderPath + "{procType}Form.do")
	public String boardForm(@ModelAttribute("boardDTO") BoardDTO boardDTO, @PathVariable String procType, Model model) {
		// 비정상적인 접근 막기

//		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setProcType(procType);

		// UPDATE 일 때만 DB select
		if("update".equals(procType)) {
			boardDTO = boardService.selectContent(boardDTO); // SEQ_NO 보내야 함.

			// 조회한 결과 없을 경우 '비정상적인 접근'
			if(boardDTO != null) {
				model.addAttribute("msg", "조회되는 데이터가 없습니다.");
			}
		}

		model.addAttribute("boardDTO", boardDTO);

		return "board/form";
	}

	@PostMapping(folderPath + "{procType}Proc.do")
	public String boardProc(@PathVariable String procType, Model model) {

		if("insert".equals(procType)) {
			boardService.insertContents();
			LOGGER.info("INSERT");
		} else if("update".equals(procType)) {
			LOGGER.info("UPDATE");
		}

		return null;
	}
}
