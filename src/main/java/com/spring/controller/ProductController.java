package com.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.spring.entity.Category;
import com.spring.entity.Product;
import com.spring.service.ICategoryService;
import com.spring.service.IProductService;

@Controller
//Cần thiết cho Hibernate Transaction.
@Transactional
//Cần thiết để sử dụng RedirectAttributes
@EnableWebMvc
@RequestMapping("/trang-quan-ly")
public class ProductController {
	@Autowired
	private IProductService productService;
	@Autowired
	private ICategoryService categoryService;
	
	@RequestMapping("/danh-sach-san-pham")
	public String listProduct(Model model) {
		String name="All";
		model.addAttribute("nameCategory", name );
		model.addAttribute("lstProduct", productService.getAll());
		model.addAttribute("lstCategory", categoryService.getAll());
		return "lstProduct";
	}
	@RequestMapping("/danh-sach-san-pham-danh-muc")
	public String listProduct1(Model model, @RequestParam(value = "nameCategory") String nameCategory) {
		try {
			model.addAttribute("lstCategory", categoryService.getAll());
			model.addAttribute("nameCategory", nameCategory);
			Category category=categoryService.getByName(nameCategory);
			List<Product> product=productService.getAllByIdCategory(category.getIdCategory());
			model.addAttribute("lstProduct", product);
		
		}
		catch(Exception e) {
			
		}
		return "lstProduct";
	}
	//Thêm sản phẩm
	@RequestMapping(value="/them-san-pham",method=RequestMethod.GET)
	public String AddProduct(Model model)
	{
		model.addAttribute("lstCategory", categoryService.getAll());	
		model.addAttribute("Product",new Product());
		return "AddProduct";
	}
	@RequestMapping(value="/them-san-pham",method=RequestMethod.POST)
	public String AddProduct(Model model, @ModelAttribute("Product") Product product,BindingResult bindingResult)
	{
		if(bindingResult.hasErrors()){
			return "AddProduct";
		}
		productService.insert(product);
		return "redirect:/trang-quan-ly/danh-sach-san-pham";
		
	}
	//Xóa sản phẩm
	@RequestMapping(value="/xoa-san-pham/{idProduct}",method=RequestMethod.GET)
	public String DeleteProduct(Model model, @PathVariable(name="idProduct") int idProduct)
	{		
		productService.delete(idProduct);
		return "redirect:/trang-quan-ly/danh-sach-san-pham";	
	}
	//Sửa sản phẩm
	@RequestMapping(value="/sua-san-pham/{idProduct}",method=RequestMethod.GET)
	public String EditProduct(Model model, @PathVariable(name="idProduct")int idProduct)
	{		
		model.addAttribute("lstCategory", categoryService.getAll());
		model.addAttribute("product", productService.getByid(idProduct));
		model.addAttribute("Product",new Product());
		
		return "EditProduct";	
	}
	@RequestMapping(value="/sua-san-pham",method=RequestMethod.POST)
	public String EditProduct(Model model, @ModelAttribute("Product") Product product,BindingResult bindingResult)
	{		
		System.out.println("ok");
		if(bindingResult.hasErrors())
		{
			return "EditProduct";
		}
		productService.update(product);
		return "redirect:/trang-quan-ly/danh-sach-san-pham";	
	}
	
	

}
