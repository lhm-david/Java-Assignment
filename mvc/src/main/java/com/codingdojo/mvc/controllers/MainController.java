package com.codingdojo.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.MvcServices;

@Controller
public class MainController {
	private MvcServices service;
	public MainController(MvcServices service) {
		this.service = service;
	}

	//get all books
	@RequestMapping("/")
	public String index(Model viewModel){
		List<Book> books = service.getAll();
		viewModel.addAttribute("book", books);
		return "index.jsp";
	}
	
	@RequestMapping("/newbook")
	public String newBook(@ModelAttribute("book") Book book) {
		return "newbook.jsp";
	}
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute ("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "newbook.jsp";
		}
		else {
			service.create(book);
			return "redirect:/";
		}
		
	}
	
	@GetMapping("/{id}")
	public Book getOneBook(@PathVariable Long id) {
		return this.service.getOne(id);
	}
	
	@RequestMapping(value="/{id}/delete", method=RequestMethod.DELETE)
	public String delete(@PathVariable("id") Long id) {
		service.deleteById(id);
		return "redirect:/";
	}
	
	@PutMapping("/{id}/update")
	public Book update(@PathVariable Long id, Book book) {
		return this.service.update(book);
	}
}
