package com.codingdojo.mvc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.repositories.BookRepositories;

@Service
public class MvcServices {
	private BookRepositories repo;
	public MvcServices(BookRepositories repo) {
		this.repo = repo;
	}
	public List<Book>getAll(){
		return this.repo.findAll();
	}
	
	//create a book
	public Book create(Book book) {
		return this.repo.save(book);
	}
	
	//delete a book
	public void deleteById(Long id) {
		this.repo.deleteById(id);
	}
	
	//update a book
	public Book update(Book book) {
		return this.repo.save(book);
	}
	
	//get one book (by id)
	public Book getOne(Long id) {
		// if no books are found with provided id, return null
		return this.repo.findById(id).orElse(null);
		//Optional<Book> optionalBook = bookRepository.findById(id);
        //if(optionalBook.isPresent()) {
        //    return optionalBook.get();
        //} else {
        //    return null;
        //} 
	}
}
