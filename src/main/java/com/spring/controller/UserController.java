package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/danh-sach-nguoi-dung")
	public String listSeller(Model model) {
		return "lstUser";
	}

}
