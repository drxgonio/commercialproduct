package com.spring.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.entity.Category;
import com.spring.entity.Invoicedetails;
import com.spring.entity.Product;
import com.spring.entity.RoleUser;
import com.spring.entity.User;
import com.spring.service.ICategoryService;
import com.spring.service.IInvoiceDetailsService;
import com.spring.service.IProductService;
import com.spring.service.IRoleUserService;
import com.spring.service.IUserService;

@Controller
public class PagesUserController {
	@Autowired
	private ICategoryService categoryService;
	@Autowired
	private IProductService productService;
	@Autowired
	private IUserService userService;
	@Autowired
	private IInvoiceDetailsService invoiceService;
	@Autowired
	private IRoleUserService roleService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
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
			model.addAttribute("message",
					"Hi " + principal.getName() + "<br> You do not have permission to access this page!");
		} else {
			model.addAttribute("msg", "You do not have permission to access this page!");
		}
		return "403Page";
	}

	@RequestMapping("/trang-chu")
	public String trangChu(Model model) {

		model.addAttribute("lstCategory", categoryService.getAll());
		return "trangchu";

	}

	@RequestMapping(value = "/trang-dat-mua-san-pham/{idProduct}", method = RequestMethod.GET)
	public String trangChiTiet(Model model, @PathVariable("idProduct") int idProduct) {

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		model.addAttribute("user", userService.getByName(authentication.getName()));
		model.addAttribute("product", productService.getByid(idProduct));
		model.addAttribute("invoiceDetails", new Invoicedetails());
		return "trangchitiet";

	}

	@RequestMapping(value = "trang-dat-mua-san-pham/trang-dat-mua-san-pham", method = RequestMethod.POST)
	public String trangChiTiet(Model model, @ModelAttribute("invoiceDetails") Invoicedetails invoiceDetails,
			BindingResult bindingResult) {
		 Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		
		if (bindingResult.hasErrors()) {
			return "redirect:/trang-chu";
		}
		
		User user=new User();
		user.setUsername(authentication.getName());
		invoiceDetails.setUser(user);
		invoiceService.insert(invoiceDetails);

		return "redirect:/trang-chu";

	}

	@RequestMapping(value = "/trang-dang-ki", method = RequestMethod.GET)
	public String trangDangKi(Model model) {

		model.addAttribute("User", new User());
		return "trangdangki";

	}

	@RequestMapping(value = "/dang-ki-tai-khoan", method = RequestMethod.POST)
	private @ResponseBody String trangDangKi(Model model, @ModelAttribute("User") User user, BindingResult bindingResult) {
		try {
			if (bindingResult.hasErrors()) {
				return "rederect:/trang-dang-ki";
			}

			userService.insert(user);
			RoleUser role = new RoleUser();
			role.setUser(user);
			role.setNameRole("USER");
			
			return "\r\n" + 
					"Sign up for a successful account. Please login to continue....";
		} catch (Exception ex) {
			return "Sorry this account is registered, please create another account";
		}
	}

	@RequestMapping(value = "/trang-dang-tin", method = RequestMethod.GET)
	public String trangDangTin(Model model) {
		model.addAttribute("lstCategory", categoryService.getAll());
		model.addAttribute("Product", new Product());

		return "trangdangtin";

	}

	@RequestMapping(value = "/trang-dang-tin", method = RequestMethod.POST)
	public String trangDangTin(Model model, @ModelAttribute("Product") Product product, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "trangdangtin";
		}
		productService.insert(product);
		return "redirect:/trang-chu";

	}

	@RequestMapping("/trang-san-pham-danh-muc/{nameCategory}")
	public String trangSanPhamDanhMuc(Model model, @PathVariable("nameCategory") String nameCategory) {
		Category category = categoryService.getByName(nameCategory);
		model.addAttribute("category", category);
		model.addAttribute("lstProductOrderBy", productService.getAllByIdCategoryOrderby(category.getIdCategory()));
		return "trangSanPhamDanhMuc";

	}
	//đỏi mật khẩu
			@RequestMapping(value="/doi-mat-khau/{username}",method=RequestMethod.GET)
			public String doiMatKhau(Model model, @PathVariable(name="username")String username)
			{		
				model.addAttribute("user",userService.getByName(username));
				System.out.println(userService.getByName(username).getPhoneNumber());
				model.addAttribute("User",new User());
				
				
				return "doimatkhau";	
			}
			@RequestMapping(value="/doi-mat-khau",method=RequestMethod.POST)
			public String doiMatKhau(Model model, @ModelAttribute("User") User user,BindingResult bindingResult)
			{		
				
				if(bindingResult.hasErrors())
				{
					
					return "doimatkhau";
				}
				userService.update(user);
				return "redirect:/logout";	
			}

}
