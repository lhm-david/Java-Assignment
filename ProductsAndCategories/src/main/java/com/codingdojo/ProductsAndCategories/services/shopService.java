package com.codingdojo.ProductsAndCategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.ProductsAndCategories.models.categories;
import com.codingdojo.ProductsAndCategories.models.products;
import com.codingdojo.ProductsAndCategories.repositories.categoryRepo;
import com.codingdojo.ProductsAndCategories.repositories.productRepo;

@Service
public class shopService {
	@Autowired
	private productRepo pRepo;
	@Autowired
	private categoryRepo cRepo;
	
	public List<products> Allproducts(){
		return this.pRepo.findAll();
	}
	
	public List<categories> Allcategories(){
		return this.cRepo.findAll();
	}
	
	public List<categories> productCategories(products product){
		return this.cRepo.findAllByProducts(product);
	}
	
	public List<categories> otherCategories(products product){
		return this.cRepo.findByProductsNotContains(product);
	}
	
	public List<products> catProduct(categories category){
		return this.pRepo.findAllByCategories(category);
	}
	
	public List<products> otherPorduct(categories category){
		return this.pRepo.findByCategoriesNotContains(category);
	}
	
	public products createProduct(products newproduct) {
		return this.pRepo.save(newproduct);
	}
	
	public categories createCategory(categories newcategory) {
		return this.cRepo.save(newcategory);
	}

	public products getOneProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	public categories getOneCategory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	public void addCattoPro(products product, categories category) {
		List<categories> thiscat = product.getCategories();
		thiscat.add(category);
		this.pRepo.save(product);
	}
	
	public void addProtoCat(categories category, products product) {
		List<products> thispro = category.getProducts();
		thispro.add(product);
		this.cRepo.save(category);
	}
}
