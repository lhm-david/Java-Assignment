package com.codingdojo.DojoOverflow.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.DojoOverflow.models.tags;

@Repository
public interface tagRepo extends CrudRepository <tags, Long>{
	List<tags> findAll();
	boolean existsBySubject(String subject);
	tags findBySubject(String subject);
}
