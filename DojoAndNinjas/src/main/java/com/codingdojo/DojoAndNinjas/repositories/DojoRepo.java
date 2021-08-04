package com.codingdojo.DojoAndNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.DojoAndNinjas.models.DojoModel;

@Repository
public interface DojoRepo extends CrudRepository<DojoModel, Long>{
	List<DojoModel> findAll();
}
