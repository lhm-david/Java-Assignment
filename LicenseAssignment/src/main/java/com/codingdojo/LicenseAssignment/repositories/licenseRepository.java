package com.codingdojo.LicenseAssignment.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.LicenseAssignment.models.license;



@Repository
public interface licenseRepository extends CrudRepository<license, Long> {
	List<license> findAll();
	license findTopByOrderByNumberDesc();
}
