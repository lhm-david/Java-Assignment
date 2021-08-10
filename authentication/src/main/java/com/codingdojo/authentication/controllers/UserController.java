package com.codingdojo.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.authentication.models.User;
import com.codingdojo.authentication.services.UserService;

@Controller
public class UserController {
	private final UserService uService;
	
	public UserController (UserService uService) {
		this.uService = uService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/regi")
	public String registration(@ModelAttribute("user")User user) {
		return "registration.jsp";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@Valid @RequestParam("email") String email, @RequestParam("password") String password, HttpSession session, Model model) {
		boolean isAuthenticated = uService.authenticateUser(email, password);
		if(isAuthenticated) {
			User thisUser = uService.findByEmail(email);
			session.setAttribute("userId", thisUser.getId());
			return "redirect:/success";
		}else {
			model.addAttribute("error", "Invalid Credentials");
			return "index.jsp";
		}
	}
	
	@RequestMapping(value="/registration", method=RequestMethod.POST)
		public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		if (result.hasErrors()) {
			return "registration.jsp";
		}else {
			User thisUser = uService.registerUser(user);
			session.setAttribute("userId", thisUser.getId());
			return "redirect:/success";
		}
	}
	
	@RequestMapping("/success")
	public String home(HttpSession session, Model model) {
		Long userId = (Long) session.getAttribute("userId");
		User thisUser = uService.findUserById(userId);
		model.addAttribute("user", thisUser);
		return "home.jsp";
		
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
