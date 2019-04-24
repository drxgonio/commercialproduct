package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.spring.service.ICategoryService;
import com.spring.service.IProductService;
import com.spring.service.IUserService;

@Controller
//Cần thiết cho Hibernate Transaction.
@Transactional
//Cần thiết để sử dụng RedirectAttributes
@EnableWebMvc
@RequestMapping("/trang-quan-ly")
public class UserController {
	@Autowired
	private IUserService userService;
	@RequestMapping("/danh-sach-nguoi-dung")
	public String listSeller(Model model) {
		model.addAttribute("lstUser", userService.getAll());
		return "lstUser";
	}
	@RequestMapping("/{name}")
	public String trangadmin(Model model,@PathVariable("name") String name) {
		
		
		model.addAttribute("user", userService.getByName(name));
		return "trangAdmin";
		
	}

}
