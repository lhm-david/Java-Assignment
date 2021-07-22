package com.codingdojo.counterAssignment.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(HttpSession session) {
        session.setAttribute("count", 0);
        return "index.jsp";
    }

	
	@RequestMapping("/counter")
	public String showCount(HttpSession session, Model model) {
        Integer currentCount = (Integer) session.getAttribute("count");
        if (session.getAttribute("count").equals(null)) {
			currentCount=1;
			}
		else {
			currentCount ++;
			session.setAttribute("count", currentCount);
		}
        model.addAttribute("countToShow", currentCount);
        System.out.println(currentCount);
        return "counter.jsp";
    }
	
	@RequestMapping("/tryagain")
		public String tryagain(HttpSession session) {
			return "index.jsp";
		}
	
}