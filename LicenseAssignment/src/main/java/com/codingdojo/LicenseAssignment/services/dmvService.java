package com.codingdojo.LicenseAssignment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.LicenseAssignment.models.license;
import com.codingdojo.LicenseAssignment.models.person;
import com.codingdojo.LicenseAssignment.repositories.licenseRepository;
import com.codingdojo.LicenseAssignment.repositories.personRepository;

@Service
public class dmvService {
	@Autowired
	private personRepository pRepo;
	@Autowired
	private licenseRepository lRepo;
	
	public person createPerson(person newperson) {
		return this.pRepo.save(newperson);
	}
	
	public person getPerson (Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	public void deletePerson (Long id) {
		this.pRepo.deleteById(id);
	}
	
	public List<person> getAllpersons(){
		return this.pRepo.findAll();
	}
	
	public List<person> getNolicensepersons(){
		return this.pRepo.findBylicenseIdIsNull();
	}
	
	public license createLicense(license newlicense) {
		newlicense.setNumber(this.generatelicenseNumber());
		return this.lRepo.save(newlicense);
	}
	
	
	
	public int generatelicenseNumber() {
		license dI = this.lRepo.findTopByOrderByNumberDesc();
		if(dI == null) {
			return 1;
		}
		int previousLicenseNumber = dI.getNumber();
		previousLicenseNumber ++;
		return (previousLicenseNumber);
	}
}
