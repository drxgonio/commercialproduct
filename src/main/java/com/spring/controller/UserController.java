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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.spring.entity.Product;
import com.spring.entity.RoleUser;
import com.spring.entity.User;
import com.spring.service.ICategoryService;
import com.spring.service.IProductService;
import com.spring.service.IRoleUserService;
import com.spring.service.IUserService;

@Controller
//Cáº§n thiáº¿t cho Hibernate Transaction.
@Transactional
//Cáº§n thiáº¿t Ä‘á»ƒ sá»­ dá»¥ng RedirectAttributes
@EnableWebMvc
@RequestMapping("/trang-quan-ly")
public class UserController {
	@Autowired
	private IUserService userService;
	@Autowired
	private IRoleUserService roleService;
	@Autowired
	private IProductService productService;
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
	@RequestMapping(value="/them-nguoi-dung",method=RequestMethod.GET)
	private String addUser(Model model) {
		model.addAttribute("User",new User());
		return "AddUser";
	}
	@RequestMapping(value="/them-nguoi-dung",method=RequestMethod.POST)
	private String addUser(Model model,@ModelAttribute("User") User user,BindingResult bindingResult) {
		if(bindingResult.hasErrors()){
			System.out.println(bindingResult.getErrorCount());
			return "AddUser";
		}
		userService.insert(user);
		RoleUser role=new RoleUser();
		role.setUser(user);
		role.setNameRole("USER");
		roleService.insert(role);
		return "redirect:/trang-quan-ly/danh-sach-nguoi-dung";
	}
	//XoaS
	@RequestMapping(value="/xoa-nguoi-dung/{username}",method=RequestMethod.GET)
	public String DeleteProduct(Model model, @PathVariable(name="username") String username)
	{
		
		userService.delete(username);
		return "redirect:/trang-quan-ly/danh-sach-nguoi-dung";	
	}
	//SỮa
	//Sá»­a sáº£n pháº©m
		@RequestMapping(value="/sua-nguoi-dung/{username}",method=RequestMethod.GET)
		public String EditProduct(Model model, @PathVariable(name="username")String username)
		{		
			model.addAttribute("user",userService.getByName(username));
			System.out.println(userService.getByName(username).getPhoneNumber());
			model.addAttribute("User",new User());
			
			
			return "EditUser";	
		}
		@RequestMapping(value="/sua-nguoi-dung",method=RequestMethod.POST)
		public String EditProduct(Model model, @ModelAttribute("User") User user,BindingResult bindingResult)
		{		
			
			if(bindingResult.hasErrors())
			{
				System.out.println("loi");
				return "EditUser";
			}
			userService.update(user);
			return "redirect:/trang-quan-ly/danh-sach-nguoi-dung";	
		}
	

}
