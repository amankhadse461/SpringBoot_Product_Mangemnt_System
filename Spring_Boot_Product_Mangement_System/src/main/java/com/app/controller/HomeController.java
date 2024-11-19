package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Product;
import com.app.service.HomeService;

@Controller
public class HomeController {

	@Autowired HomeService hs;
	@RequestMapping("/")
	public String home()
	{
		return "login";
	}
	
	@RequestMapping("/log")
	public String login()
	{
		return "adminview";
	}
	
	@RequestMapping("/add")
	public String addproduct()
	{
		return "addproduct";
	}
	
	@RequestMapping("/view")
	public String viewproduct()
	{
		return "viewproduct";
	}
	
	@RequestMapping("/addproducts")
	public String addproducts(@ModelAttribute Product product)
	{	
		hs.saveProduct(product);
		return "viewproduct";
	}
}
