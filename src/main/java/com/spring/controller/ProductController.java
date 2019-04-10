package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.entity.Category;
import com.spring.service.ICategoryService;
import com.spring.service.IProductService;

@Controller
public class ProductController {
	@Autowired
	private IProductService productService;
	@Autowired
	private ICategoryService categoryService;
	
	@RequestMapping("/listProduct")
	public String listProduct(Model model) {
		model.addAttribute("lstProduct", productService.getAll());
		model.addAttribute("lstCategory", categoryService.getAll());
		/*productService.getAllById(1).forEach(c -> {
		      System.out.println(c.getNameProduct());
		    });*/
		//System.out.println(categoryService.getByName("Do An").getIdCategory());
		return "lstProduct";
	}
	@RequestMapping(value="/lst",method=RequestMethod.POST)
	public String lst(Model model,@ModelAttribute("Category") Category category, ModelMap modelMap)
	{
		model.addAttribute("lstProduct", productService.getAllByIdCategory(categoryService.getByName(category.getNameCategory()).getIdCategory()));
		System.out.println(category.getNameCategory());
		
		return "lstProduct";
	}

}
