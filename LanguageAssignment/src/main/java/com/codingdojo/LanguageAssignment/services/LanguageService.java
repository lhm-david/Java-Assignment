package com.codingdojo.LanguageAssignment.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.LanguageAssignment.models.Language;
import com.codingdojo.LanguageAssignment.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository repo;
	public LanguageService(LanguageRepository repo) {
		this.repo = repo;
	}
	
	public List<Language>getAll(){
		return this.repo.findAll();
	}
	
	//create a language
	public Language create(Language language) {
		return this.repo.save(language);
	}
	
	//update a language
	public Language update(Language language) {
		return this.repo.save(language);
	}
	
	//delete a language
	public void LanguageDelete(Long id) {
		this.repo.deleteById(id);
	}
	
	//get a language info
	public Language getLanguage(Long id) {
		return this.repo.findById(id).orElse(null);
	}
}
