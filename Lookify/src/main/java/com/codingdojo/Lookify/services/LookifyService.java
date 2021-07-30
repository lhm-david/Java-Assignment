package com.codingdojo.Lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.Lookify.models.LookifyModel;
import com.codingdojo.Lookify.repositories.LookifyRepository;

@Service
public class LookifyService {
	private final LookifyRepository repo;
	public LookifyService(LookifyRepository repo) {
		this.repo = repo;
	}
	
	public List<LookifyModel>getAll(){
		return this.repo.findAll();
	}
	
	public LookifyModel create(LookifyModel song) {
		return this.repo.save(song);
	}
	
	public LookifyModel update(LookifyModel song) {
		return this.repo.save(song);
	}
	
	public void songDelete(Long id) {
		this.repo.deleteById(id);
	}
	
	public LookifyModel getSong(Long id) {
		return this.repo.findById(id).orElse(null);
	}
	
	public List<LookifyModel>searchArtist(String artist) {
		return this.repo.findByArtistContaining(artist);
	}
	
	public List<LookifyModel> topTenByRating() {
		return this.repo.findTop10ByOrderByRatingDesc();
	}
}
