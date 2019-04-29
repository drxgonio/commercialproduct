package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.spring.service.IInvoiceDetailsService;

@Controller
//Cần thiết cho Hibernate Transaction.
@Transactional
//Cần thiết để sử dụng RedirectAttributes
@EnableWebMvc
@RequestMapping("/trang-quan-ly")
public class InvoiceDetailsController {
	@Autowired
	private IInvoiceDetailsService invoicedetails;
	@RequestMapping(value="/danh-sach-cac-don-hang",method=RequestMethod.GET)
	private String list(Model model) {
		model.addAttribute("invoicedetails", invoicedetails.getAll());
		return "lstInvoice";
	}
	//Xoóa danh mục
			@RequestMapping(value="/xoa-don-hang/{idInvoice}",method=RequestMethod.GET)
			public String deleteCategory(Model model,@PathVariable("idInvoice") int idInvoice) {
				invoicedetails.delete(idInvoice);
				return "redirect:/trang-quan-ly/danh-sach-cac-don-hang";
			}

}
