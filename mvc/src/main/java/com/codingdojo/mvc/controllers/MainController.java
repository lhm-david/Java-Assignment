package com.codingdojo.mvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.MvcServices;

@RestController
public class MainController {
	private MvcServices service;
	public MainController(MvcServices service) {
		this.service = service;
	}

	//get all books
	@GetMapping("/")
	public List<Book> index(){
		return this.service.getAll();
	}
	
	@PostMapping("/create")
	public Book create(Book book) {
		return this.service.create(book);
	}
	
	@GetMapping("/{id}")
	public Book getOneBook(@PathVariable Long id) {
		return this.service.getOne(id);
	}
	
	@DeleteMapping("/{id}/delete")
	public void delete(@PathVariable Long id) {
		this.service.deleteById(id);
	}
	
	@PutMapping("/{id}/update")
	public Book update(@PathVariable Long id, Book book) {
		return this.service.update(book);
	}
}
