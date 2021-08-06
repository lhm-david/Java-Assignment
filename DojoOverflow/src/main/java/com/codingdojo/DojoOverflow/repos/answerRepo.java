package com.codingdojo.DojoOverflow.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.DojoOverflow.models.answers;

@Repository
public interface answerRepo extends CrudRepository <answers, Long>{
	List<answers> findAll();

}
