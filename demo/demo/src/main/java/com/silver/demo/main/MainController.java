package com.silver.demo.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("name", "Silver");

        return "main";
    }

    @GetMapping("/list.do")
    public String boardList() {

        return "list";
    }
}
