package com.example.demo.board;

import com.example.demo.board.service.BoardService;
import jakarta.servlet.http.HttpServletRequest;
import org.codehaus.groovy.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import java.util.Enumeration;
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
	public String view(@RequestParam String seqNo, Model model) {
		BoardDTO selectVO = boardService.selectContent(seqNo);

		model.addAttribute("selectVO", selectVO);

		return "board/view";
	}

	@GetMapping(folderPath + "{procType}Form.do")
	public String boardForm(@RequestParam String seqNo, @PathVariable String procType, Model model) {

		// 비정상적인 접근 막기
		if("update".equals(procType) && StringUtils.isEmpty(seqNo)) {
			model.addAttribute("msg", "비정상적인 접근입니다.");
			model.addAttribute("returnUrl", "list.do");

			return "cmmn/error";
		}

		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setProcType(procType);

		// UPDATE 일 때만 DB select
		if("update".equals(procType)) {
			boardDTO = boardService.selectContent(seqNo);

			// 조회한 결과 없을 경우 '비정상적인 접근'
			if(boardDTO == null) {
				model.addAttribute("errMsg", "조회되는 데이터가 없습니다.");
				model.addAttribute("returnUrl", "list.do");

				return "cmmn/error";
			}
		}

		model.addAttribute("boardDTO", boardDTO);

		return "board/form";
	}

	@PostMapping(folderPath + "{procType}Proc.do")
	public String boardProc(@ModelAttribute("boardDTO") BoardDTO boardDTO, @PathVariable String procType, Model model) {
		LOGGER.debug("");
		LOGGER.debug(procType + "Proc.do!");
		LOGGER.debug("");
		if("insert".equals(procType)) {
			boardService.insertContents(boardDTO);
			LOGGER.info("INSERT");
			return "redirect:list.do";
		} else if("update".equals(procType)) {
			LOGGER.info("UPDATE");
		}

		return null;
	}
}
