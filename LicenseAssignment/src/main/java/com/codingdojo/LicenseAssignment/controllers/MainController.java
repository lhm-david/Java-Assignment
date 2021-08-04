package com.codingdojo.LicenseAssignment.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.LicenseAssignment.models.license;
import com.codingdojo.LicenseAssignment.models.person;
import com.codingdojo.LicenseAssignment.services.dmvService;

@Controller
public class MainController {
	@Autowired
	private dmvService service;
	
	@RequestMapping("/")
	public String index(Model viewModel) {
		viewModel.addAttribute("persons", this.service.getAllpersons());
		return "index.jsp";
	}
	
	@RequestMapping("/{id}")
	public String personinfo(@PathVariable Long id, Model viewModel) {
		viewModel.addAttribute("person", this.service.getPerson(id));
		return "person.jsp";
	}
	
	@RequestMapping("/create/person")
	public String createperson(@ModelAttribute("person") person person) {
		return "newperson.jsp";
	}
	
	@RequestMapping(value="/create/newperson", method=RequestMethod.POST)
	public String newperson(@ModelAttribute("person")person person) {
		this.service.createPerson(person);
		return "redirect:/";
	}
	
	@RequestMapping("/create/license")
	public String createlicense(@ModelAttribute("license") license license, Model viewModel) {
		viewModel.addAttribute("persons", this.service.getNolicensepersons()); 
		return "newlicnese.jsp";
	}
	
	@RequestMapping(value="/create/newlicense", method=RequestMethod.POST)
	public String newlicense (@Valid @ModelAttribute("license") license license, BindingResult result, Model viewModel) {
		if (result.hasErrors()) {
			viewModel.addAttribute("persons", this.service.getNolicensepersons());
		}
		this.service.createLicense(license);
		return "redirect:/";
	}
	
	@RequestMapping("/{id}/delete")
	public String delete(@PathVariable Long id) {
		this.service.deletePerson(id);
		return "redirect:/";
	}
}
