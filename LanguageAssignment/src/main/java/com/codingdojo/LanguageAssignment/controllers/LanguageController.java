package com.codingdojo.LanguageAssignment.controllers;

//import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.LanguageAssignment.models.Language;
import com.codingdojo.LanguageAssignment.services.LanguageService;

@Controller
public class LanguageController {
	private LanguageService service;
	public LanguageController(LanguageService service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public String index (Model viewModel, @ModelAttribute("language") Language language) {
//		List<Language> languages = service.getAll();
		viewModel.addAttribute("Languages", this.service.getAll());
		return "index.jsp";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String newLanguage (@Valid @ModelAttribute ("language")Language language, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		}
		else {
			service.create(language);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model viewModel, @ModelAttribute("language") Language language) {
//		Language language = service.getLanguage(id);
		viewModel.addAttribute("Language", service.getLanguage(id));
		return "languageinfo.jsp";
	}
	
	@RequestMapping(value="/{id}/update", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "languageinfo.jsp";
        } else {
            service.update(language);
            return "redirect:/";
        }
	}
	
	@RequestMapping("/{id}/delete")
	public String deletelanguage(@PathVariable Long id) {
		service.LanguageDelete(id);
		return "redirect:/";
	}
	
	@RequestMapping("/{id}")
	public String getLanguage(@PathVariable Long id, Model viewModel) {
		Language language = service.getLanguage(id);
		viewModel.addAttribute("Language", language);
		return "language.jsp";
	}
}
