package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String viewproduct(Model m)
	{
		List<Product> pl =hs.allProducts();
		m.addAttribute("data",pl);
		return "viewproduct";
	}
	
	@RequestMapping("/addproducts")
	public String addproducts(@ModelAttribute Product product,Model m)
	{	
		hs.saveProduct(product);
		List<Product> pl =hs.allProducts();
		m.addAttribute("data",pl);
		return "viewproduct";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("pid") int pid,Model m)
	{
		hs.deletedata(pid);
		List<Product> pl =hs.allProducts();
		m.addAttribute("data",pl);
		return "viewproduct";
	}
	
	@RequestMapping("/edit")
	public String edit()
	{
		return "edit";
		
	}
	
	@RequestMapping("/editdata")
	public String editdata(@ModelAttribute Product product,Model m)
	{
		hs.saveProduct(product);
		List<Product> pl =hs.allProducts();
		m.addAttribute("data",pl);
		return "viewproduct";
	}
}
