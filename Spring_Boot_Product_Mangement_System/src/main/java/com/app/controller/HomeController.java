package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

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
}
