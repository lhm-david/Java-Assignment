package com.codingdojo.ProductsAndCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.ProductsAndCategories.models.categories;
import com.codingdojo.ProductsAndCategories.models.products;

@Repository
public interface productRepo extends CrudRepository <products, Long>{
	List<products> findAll();
	List<products> findAllByCategories(categories category);
	List<products> findByCategoriesNotContains(categories category);

}
