package com.codingdojo.DojoSurvey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(path="/submit", method=RequestMethod.POST)
	public String login(Model viewModel,@RequestParam(value="name") String name, @RequestParam(value="location") String location, @RequestParam(value="language") String favlanguage,@RequestParam(value="comment") String comment) {
		viewModel.addAttribute("name", name);
		viewModel.addAttribute("location", location);
		viewModel.addAttribute("language", favlanguage);
		viewModel.addAttribute("comment", comment);
		return "info.jsp";
	}
}
