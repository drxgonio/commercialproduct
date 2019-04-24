package com.spring.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.entity.User;
import com.spring.service.ICategoryService;
import com.spring.service.IProductService;
import com.spring.service.IUserService;


@Controller
public class PagesUserController {
	@Autowired
	private ICategoryService categoryService;
	@Autowired
	private IProductService productService;

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(Model model) {
		
		
		
		return "login";
		
	}
	@RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
	   public String logoutSuccessfulPage(Model model) {
	       model.addAttribute("title", "Logout");
	       return "redirect:/login";
	   }
	
	  @RequestMapping(value = "/403", method = RequestMethod.GET)
	   public String accessDenied(Model model, Principal principal) {
	        
	       if (principal != null) {
	           model.addAttribute("message", "Hi " + principal.getName()
	                   + "<br> You do not have permission to access this page!");
	       } else {
	           model.addAttribute("msg",
	                   "You do not have permission to access this page!");
	       }
	       return "403Page";
	   }
	@RequestMapping("/trang-chu")
	public String trangChu(Model model) {
		
		
		model.addAttribute("lstCategory", categoryService.getAll());
		return "trangchu";
		
	}
	
	@RequestMapping("/trang-chi-tiet-san-pham")
	public String trangChiTiet(Model model) {
		
		
		
		return "trangchitiet";
		
	}
	@RequestMapping("/trang-dang-ki")
	public String trangDangKi(Model model) {
		
		
		
		return "trangdangki";
		
	}
	
	@RequestMapping("/trang-dang-tin")
	public String trangDangTin(Model model) {
		
		
		
		return "trangdangtin";
		
	}
	@RequestMapping("/trang-muc-luc")
	public String trangMucluc(Model model) {
		
		
		
		return "trangmucluc";
		
	}
	


}
