package com.codingdojo.DisplayDate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;

@Controller
public class HomeController {
	private Date getDate() {
		Date date = new Date();
		return date;
	}
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		model.addAttribute("Date", getDate());
		return "date.jsp";
	}

	@RequestMapping("/time")
	public String time(Model model) {
		model.addAttribute("Date", getDate());
		return "time.jsp";
	}
}
