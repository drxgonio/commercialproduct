package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BuyerController {
	@RequestMapping("/danh-sach-nguoi-mua")
	public String listBuyer(Model model) {
		return "lstBuyer";
	}

}
