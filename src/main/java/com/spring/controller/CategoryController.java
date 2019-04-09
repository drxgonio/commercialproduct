package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.spring.service.ApplicantService;
import com.spring.service.ICategoryService;

@Controller
//Enable Hibernate Transaction.
@Transactional
//Need To use RedirectAttributes
@EnableWebMvc
public class CategoryController {
	
	
	@Autowired
	private ICategoryService categoryService;
	
	
	@RequestMapping("/listCategory")
	public String listCategory(Model model) {
		model.addAttribute("lstCategory", categoryService.getAll());
		categoryService.getAll().forEach(c -> {
		      System.out.println(c.getNameCategory());
		    });
		return "lstCategory";
	}
	
	

}
