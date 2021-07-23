package com.codingdojo.NinjaGold.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	private Date getDate() {
		Date date = new Date();
		return date;
	}
	
	@RequestMapping("/")
	public String index(HttpSession session, Model viewModel) {
		ArrayList<String> activities = new ArrayList<String>();
		if (session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}
		if (session.getAttribute("Activites") == null) {
			session.setAttribute("Activites", activities);
		}
		
		viewModel.addAttribute("score", session.getAttribute("gold"));
		viewModel.addAttribute("ActivityList", session.getAttribute("Activites"));
		viewModel.addAttribute("Date", getDate());
		return "index.jsp";
	}
	
	@RequestMapping("/clear")
		public String clear(HttpSession session) {
		session.invalidate();
		return "redirect:/";
		}
	
	
	
	@RequestMapping(path="/findGold", method=RequestMethod.POST)

	public String findGold(HttpSession session, @RequestParam("location") String location) {
		
		ArrayList<String> activity = (ArrayList<String>)session.getAttribute("Activites");
		
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd Y h:mm a");
//		System.out.println(formatter.format(now));
		Random r = new Random();
		
		int gold = (int)session.getAttribute("gold");
		int goldeachtime;
		
		if(location.equals("farm")) {
			goldeachtime = r.nextInt(11)+10;
			activity.add(String.format("You entered a %s and earned %d gold %s \n", location, goldeachtime, formatter.format(now)));
		}
		else if(location.equals("cave")) {
			goldeachtime = r.nextInt(6)+5;
			activity.add(String.format("You entered a %s and earned %d gold %s \n", location, goldeachtime, formatter.format(now)));
		}
		else if(location.equals("house")) {
			goldeachtime = r.nextInt(4)+2;
			activity.add(String.format("You entered a %s and earned %d gold %s \n", location, goldeachtime, formatter.format(now)));
		}
		else if(location.equals("casino")) {
			goldeachtime = r.nextInt(101)-50;
			if (goldeachtime > 0) {
				activity.add(String.format("You entered %s and earned %d gold %s \n", location, goldeachtime, formatter.format(now)));
			}
			else {
				activity.add(String.format("You entered a %s and lost %d gold Ouch! %s \n", location, goldeachtime, formatter.format(now)));
			}
		}
		else if(location.equals("spa")) {
			goldeachtime = r.nextInt(16)-20;
			activity.add(String.format("You entered a %s and lost %d gold Ouch!\n", location, goldeachtime));
		}
		else {
			return "redirect:/";
		}
		int totalGold = gold + goldeachtime;
		if (totalGold < -100) {
			return "jail.jsp";
		}
		session.setAttribute("gold", totalGold);
		return "redirect:/";
	}
}
