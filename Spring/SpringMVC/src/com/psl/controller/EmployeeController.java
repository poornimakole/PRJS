package com.psl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.psl.beans.Employee;
import com.psl.service.EmployeeService;

//http://localhost:8080/SpringMVC/home
@Controller
//@RequestMapping(value="/employee")
public class EmployeeController {
	
	@Autowired
	
	private EmployeeService service;
	
	@RequestMapping(value={"/","/home"},method=RequestMethod.GET)
	public String showHomePage(Model model){
		System.out.println("In Employee Controller .....showHomePage()");
		model.addAttribute("message","hiiiii");
		model.addAttribute("employee",new Employee());
		return "home";
	}
	
	@RequestMapping(value="/{empName}",method=RequestMethod.GET)
	public String showEmpPage(Model model,@PathVariable String empName,@RequestParam(required=false) String dept){
		System.out.println("In Employee Controller .....showEmpPage()  I clicked"+empName);
		System.out.println(dept);
		model.addAttribute("empName",empName);
		model.addAttribute("department",dept);
		model.addAttribute("message","hiiiii "+empName);
		return "emp";
	}
	
	@RequestMapping(value={"/","/home"},method=RequestMethod.POST)
	public String Register(Model model, @ModelAttribute Employee e){
		System.out.println("In Employee Controller .....showHomePage()"+e);
		service.createEmployee(e);
		return "home";
	}

}
