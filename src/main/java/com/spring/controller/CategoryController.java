package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.spring.entity.Category;
import com.spring.entity.Product;
import com.spring.service.ICategoryService;

@Controller
//Enable Hibernate Transaction.
@Transactional
//Need To use RedirectAttributes
@EnableWebMvc
@RequestMapping("/trang-quan-ly")
public class CategoryController {
	
	
	@Autowired
	private ICategoryService categoryService;
	
	//Load list danh muc
	@RequestMapping("/danh-muc")
	public String listCategory(Model model) {
		model.addAttribute("lstCategory", categoryService.getAll());
		
		return "lstCategory";
	}
	//ThÃªm sáº£n pháº©m
		@RequestMapping(value="/them-danh-muc",method=RequestMethod.GET)
		public String AddProduct(Model model)
		{
				
			model.addAttribute("Category",new Category());
			return "AddCategory";
		}
		@RequestMapping(value="/them-danh-muc",method=RequestMethod.POST)
		public String AddProduct(Model model, @ModelAttribute("Category") Category category,BindingResult bindingResult)
		{
			if(bindingResult.hasErrors()){
				return "AddCategory";
			}
			categoryService.insert(category);
			return "redirect:/trang-quan-ly/danh-muc";
			
		}
		
		//XoÃ³a danh má»¥c
		@RequestMapping(value="/xoa-danh-muc/{idCategory}",method=RequestMethod.GET)
		public String deleteCategory(Model model,@PathVariable("idCategory") int idCategory) {
			categoryService.delete(idCategory);
			return "redirect:/trang-quan-ly/danh-muc";
		}
		//Sữa danh mục
		@RequestMapping(value="/sua-danh-muc/{idCategory}",method=RequestMethod.GET)
		public String EditProduct(Model model, @PathVariable(name="idCategory")int idCategory)
		{		
		
			model.addAttribute("category", categoryService.getByid(idCategory));
			model.addAttribute("Category",new Category());
			
			return "EditCategory";	
		}
		@RequestMapping(value="/sua-danh-muc",method=RequestMethod.POST)
		public String EditProduct(Model model, @ModelAttribute("Category") Category category,BindingResult bindingResult)
		{		
	
			if(bindingResult.hasErrors())
			{
				return "EditProduct";
			}
			categoryService.update(category);
			return "redirect:/trang-quan-ly/danh-muc";	
		}
	
	

}
