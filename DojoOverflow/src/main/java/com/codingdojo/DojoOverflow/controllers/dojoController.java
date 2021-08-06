package com.codingdojo.DojoOverflow.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.codingdojo.DojoOverflow.models.answers;
import com.codingdojo.DojoOverflow.models.questions;
import com.codingdojo.DojoOverflow.services.DojoService;
import com.codingdojo.DojoOverflow.validator.TagValidation;

@Controller
public class dojoController {
	@Autowired
	private DojoService dservice;
	@Autowired
	private TagValidation validator;
	
	@RequestMapping("/")
	public String index(Model viewModel) {
		viewModel.addAttribute("Q", this.dservice.Allquestions());
		return "index.jsp";
	}
	
	@RequestMapping("/newquestion")
	public String newquestion(Model viewModel, @ModelAttribute("Qs") questions question ) {
		viewModel.addAttribute("Q", this.dservice.Allquestions());
		
		return "new.jsp";
	}
	
	@RequestMapping(value="/addquestion", method=RequestMethod.POST)
	public String addQuestion(@Valid Model viewModel, @ModelAttribute("Qs") questions question, BindingResult result) {
		validator.validate(question, result);
		if (result.hasErrors()) {
			return "new.jsp";
		}
		this.dservice.createQuestion(question);
		return "redirect:/";
	}
	
	@RequestMapping("/{id}")
	public String showQuestion(@PathVariable("id") Long id, Model viewModel, @ModelAttribute("A") answers answer) {
		viewModel.addAttribute("Q", this.dservice.getOneQuestion(id));
		return "question.jsp";
	}
	
	@RequestMapping(value="/addanswer", method=RequestMethod.POST)
	public String addAnswer(@Valid @ModelAttribute("A") answers answer, BindingResult result, Model viewModel) {
		if(result.hasErrors()) {
			questions thisQuestion = this.dservice.getOneQuestion(answer.getQuestion().getId());
			viewModel.addAttribute("Q", thisQuestion);
			return "question.jsp";
		}
		
		this.dservice.createAnswer(answer);
		return "redirect:/" + answer.getQuestion().getId();
	}
}
