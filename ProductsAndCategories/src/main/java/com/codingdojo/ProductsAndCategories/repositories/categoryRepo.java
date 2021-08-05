package com.codingdojo.ProductsAndCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.ProductsAndCategories.models.categories;
import com.codingdojo.ProductsAndCategories.models.products;

public interface categoryRepo extends CrudRepository<categories, Long>{
	List<categories> findAll();
	List<categories> findAllByProducts(products product);
	List<categories> findByProductsNotContains(products product);

}
