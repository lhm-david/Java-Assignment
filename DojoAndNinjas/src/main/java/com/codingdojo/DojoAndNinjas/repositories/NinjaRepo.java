package com.codingdojo.DojoAndNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.DojoAndNinjas.models.NinjaModel;

@Repository
public interface NinjaRepo extends CrudRepository<NinjaModel, Long>{
	List<NinjaModel> findAll();
}
