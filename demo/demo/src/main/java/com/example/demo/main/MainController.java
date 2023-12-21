package com.example.demo.main;

import com.example.demo.board.BoardDTO;
import com.example.demo.board.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    private final BoardService boardService;
    public MainController(BoardService boardService) {
        this.boardService = boardService;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("name", "Silver");

        return "main";
    }

    @GetMapping("/list.do")
    public String boardList(Model model) {
        List<BoardDTO> boardList = boardService.selectList();
        model.addAttribute("boardList", boardList);

        return "list";
    }
}
