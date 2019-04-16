package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SellerController {
	@RequestMapping("/danh-sach-nguoi-ban")
	public String listSeller(Model model) {
		return "lstSeller";
	}

}
