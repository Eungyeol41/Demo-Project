package com.example.demo.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

	private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

	@GetMapping("/basicTest.do")
	public String basicTest(Model model) {


		return "board/list";
	}
}
