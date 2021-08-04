package com.codingdojo.DojoAndNinjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.DojoAndNinjas.models.DojoModel;
import com.codingdojo.DojoAndNinjas.models.NinjaModel;
import com.codingdojo.DojoAndNinjas.repositories.DojoRepo;
import com.codingdojo.DojoAndNinjas.repositories.NinjaRepo;

@Service
public class DojoService {
	@Autowired
	private DojoRepo Drepo;
	@Autowired
	private NinjaRepo Nrepo;
	
	public List<DojoModel> getAllDojos(){
		return this.Drepo.findAll();
	}
	
	public List<NinjaModel> getAllNinjas(){
		return this.Nrepo.findAll();
	}
	
	public DojoModel createDojo(DojoModel newdojo) {
		return this.Drepo.save(newdojo);
	}
	
	public DojoModel getDojo(Long id) {
		return this.Drepo.findById(id).orElse(null);
	}
	
	public NinjaModel createNinja(NinjaModel newninja) {
		return this.Nrepo.save(newninja);
	}
	
	public NinjaModel getNinja(Long id) {
		return this.Nrepo.findById(id).orElse(null);
	}
}
