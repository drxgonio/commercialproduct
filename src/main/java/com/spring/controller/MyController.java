package com.spring.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
 
import com.spring.dao.ApplicantDAO;

import com.spring.service.ApplicantService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
 
@Controller
// Enable Hibernate Transaction.
@Transactional
// Need To use RedirectAttributes
@EnableWebMvc
public class MyController {
 
  
 
   @Autowired
   private ApplicantService applicantService;
 
/*   @RequestMapping("/")
   public String homePage(Model model) {
 
       return applicantList(model);
   }*/
 
   @RequestMapping("/a")
   public String applicantList(Model model) {
	   System.out.println("test:");
       model.addAttribute("a", applicantService.listApplicant());
       applicantService.listApplicant().forEach(c -> {
		      System.out.println(c.getName());
		    });
       return "NewFile";
   }
 
  
 
}