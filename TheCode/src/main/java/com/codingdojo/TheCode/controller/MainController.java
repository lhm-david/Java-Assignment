package com.codingdojo.TheCode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index(@ModelAttribute("errors") String errors) {
		return "index.jsp";
	}
	
	@RequestMapping("/errors")
	public String errors(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("errors", "You must train Harder!");
		return "redirect:/";
	}
	
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String login(@RequestParam(value="code") int code) {
		if (code == 1234) {
			return "redirect:/dashboard";
		}
		else {
			return "redirect:/errors";
		}
	}
	
	@RequestMapping("/dashboard")
	public String dashboard() {
		return "secretCode.jsp";
	}
}
