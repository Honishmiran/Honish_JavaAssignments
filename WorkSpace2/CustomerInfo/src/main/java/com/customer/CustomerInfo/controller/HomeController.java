package com.customer.CustomerInfo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.customer.CustomerInfo.dao.*;
import com.customer.CustomerInfo.bean.*;
@Controller
public class HomeController {

	@Autowired
	CustomerDao customerdao;
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");

	}
	
	@RequestMapping(value="/customers")
	public ModelAndView getAllCustomers() throws IOException{
		ModelAndView modelAndView =new ModelAndView("customerlist");
		List<Customer> customers = customerDao.getAll();
		modelAndView.addObject("customers",customers);
		return modelAndView;
	}
	
	@RequestMapping(value="/add")
	public ModelAndView addCustomer() throws IOException{
		ModelAndView modelAndView =new ModelAndView("addCustomer");
		
		return modelAndView;
	}
	
	
}
	
		