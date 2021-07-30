package com.codingdojo.Lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.Lookify.models.LookifyModel;

@Repository
public interface LookifyRepository extends CrudRepository<LookifyModel, Long>{
	List<LookifyModel> findAll();
	List<LookifyModel> findByArtistContaining(String artist);
	List<LookifyModel> findTop10ByOrderByRatingDesc();

}
