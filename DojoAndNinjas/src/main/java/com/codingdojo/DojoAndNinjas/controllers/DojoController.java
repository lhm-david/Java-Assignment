package com.codingdojo.DojoAndNinjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.DojoAndNinjas.models.DojoModel;
import com.codingdojo.DojoAndNinjas.models.NinjaModel;
import com.codingdojo.DojoAndNinjas.services.DojoService;

@Controller
public class DojoController {
	@Autowired
	private DojoService dservice;
	
	@RequestMapping("/")
	public String index(Model viewModel) {
		viewModel.addAttribute("Dojos", this.dservice.getAllDojos());
		return "index.jsp";
	}
	
	@RequestMapping("/newdojo")
	public String newdojo(@ModelAttribute ("dojo")DojoModel dojo) {
		return "newdojo.jsp";
	}
	
	@RequestMapping(value="/createdojo",method=RequestMethod.POST)
	public String createdojo(@Valid @ModelAttribute ("dojo") DojoModel dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "newdojo.jsp";
		}
		this.dservice.createDojo(dojo);
		return "redirect:/";
	}
	
	@RequestMapping("/newninja")
	public String newnija(@ModelAttribute ("ninja") NinjaModel ninja, Model viewModel) {
		viewModel.addAttribute("Dojos", this.dservice.getAllDojos());
		return "newninja.jsp";
	}
	
	@RequestMapping(value="/createninja",method=RequestMethod.POST)
	public String createninja(@Valid @ModelAttribute ("ninja") NinjaModel ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "newninja.jsp";
		}
		this.dservice.createNinja(ninja);
		return "redirect:/";
	}
	
	@RequestMapping("/{id}")
	public String showdojo(@PathVariable Long id, Model viewModel) {
		viewModel.addAttribute("dojo", this.dservice.getDojo(id));
		return "show.jsp";
	}
}
