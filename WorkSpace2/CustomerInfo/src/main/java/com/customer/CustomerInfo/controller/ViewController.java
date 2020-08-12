package com.customer.CustomerInfo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.customer.CustomerInfo.bean.*;
import com.customer.CustomerInfo.dao.*;

@Controller
public class ViewController {

	
 
	@RequestMapping(value="/listCustomer",method=RequestMethod.POST)
	public ModelAndView getOnelCustomer() throws IOException{
		ModelAndView modelAndView =new ModelAndView("ViewCustomer");
		List<Customer> customerr = customerDao.getOne();
		modelAndView.addObject("customerr",customerr);
		return modelAndView;
	}
}