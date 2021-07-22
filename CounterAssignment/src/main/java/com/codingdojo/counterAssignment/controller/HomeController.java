package com.codingdojo.counterAssignment.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(HttpSession session) {
		Integer counter = (Integer) session.getAttribute("count");
		if (counter == null) {
			counter = 0;
			}
		else {
			counter ++;
			session.setAttribute("count", counter);
		}
		
        return "index.jsp";
    }

	
	@RequestMapping("/counter")
	public String showCount(HttpSession session, Model model) {
        model.addAttribute("countToShow", session.getAttribute("count"));
        return "counter.jsp";
    }
	
	@RequestMapping("/counter2")
	public String showCount2(HttpSession session, Model model) {
		Integer counter = (Integer) session.getAttribute("count");
		if (counter == null) {
			counter = 0;
			}
		else {
			counter ++;
			session.setAttribute("count", counter);
		}
        model.addAttribute("countToShow", session.getAttribute("count"));
        return "counter.jsp";
	}
	
	
	@RequestMapping("/reset")
	public String reset(HttpSession session, Model model) {
		session.setAttribute("count", 0);
		model.addAttribute("countToShow", session.getAttribute("count"));
		return "counter.jsp";
	}
}