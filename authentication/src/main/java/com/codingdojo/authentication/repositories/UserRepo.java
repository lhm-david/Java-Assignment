package com.codingdojo.authentication.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.authentication.models.User;

public interface UserRepo extends CrudRepository <User, Long>{
	List<User> findAll();
	User findByEmail(String email);
}
