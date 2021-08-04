package com.codingdojo.LicenseAssignment.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.LicenseAssignment.models.person;



@Repository
public interface personRepository extends CrudRepository<person, Long> {
	List<person> findAll();
	List<person> findBylicenseIdIsNull();
}
