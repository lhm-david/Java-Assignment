package com.codingdojo.DojoOverflow.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.DojoOverflow.models.questions;

@Repository
public interface questionRepo extends CrudRepository <questions, Long>{
	List<questions> findAll();

}
