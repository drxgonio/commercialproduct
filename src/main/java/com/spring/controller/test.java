package com.spring.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.entity.Category;
import com.spring.service.ICategoryService;
import com.spring.service.IProductService;

@Controller
public class test {
	@Autowired
	private IProductService productService;
	@Autowired
	private ICategoryService categoryService;
	@RequestMapping(value = "/search", method=RequestMethod.POST)
	public @ResponseBody String searchPerson(Model request,@RequestParam(value = "name") String name) {
		
		ObjectMapper mapper = new ObjectMapper();
		Category category=categoryService.getByName(name);
		String ajaxResponse = "";
		try {
			ajaxResponse =  mapper.writeValueAsString(category);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ajaxResponse;
		
	}

}
