package com.codingdojo.ProductsAndCategories.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.ProductsAndCategories.models.categories;
import com.codingdojo.ProductsAndCategories.models.products;
import com.codingdojo.ProductsAndCategories.services.shopService;

@Controller
public class shopController {
	@Autowired
	private shopService service;
	
	@RequestMapping("/")
	public String index(Model viewModel) {
		viewModel.addAttribute("products", this.service.Allproducts());
		viewModel.addAttribute("categories", this.service.Allcategories());
		return "index.jsp";
	}
	
	@RequestMapping("/products/new")
	public String newproduct(@ModelAttribute("product") products product) {
		return "newproduct.jsp";
	}
	
	@RequestMapping(value="/products/create", method=RequestMethod.POST)
	public String createproduct(@Valid @ModelAttribute("product") products product, BindingResult result) {
		if(result.hasErrors()) {
			return "newproduct.jsp";
		}
		this.service.createProduct(product);
		return "redirect:/";
	}
	
	@RequestMapping("/categories/new")
	public String newcategory(@ModelAttribute("category") categories category) {
		return "newcategory.jsp";
	}
	
	@RequestMapping(value="/categories/create", method=RequestMethod.POST)
	public String createcategory(@Valid @ModelAttribute("category") categories category, BindingResult result) {
		if (result.hasErrors()) {
			return "newcategory.jsp";
		}
		this.service.createCategory(category);
		return "redirect:/";
	}
		
	
	@RequestMapping("/products/{id}")
	public String showproduct(Model viewModel, @PathVariable Long id) {
		products thisproduct = this.service.getOneProduct(id);
		List<categories> catnotinproduct = this.service.otherCategories(thisproduct);
		List<categories> productcat = this.service.productCategories(thisproduct);
		viewModel.addAttribute("product", thisproduct);
		viewModel.addAttribute("categories", catnotinproduct);
		viewModel.addAttribute("productcategories", productcat);
		return "showproduct.jsp";
	}
	
	@RequestMapping(value="/products/{id}/addcategory", method=RequestMethod.POST)
	public String addcategory(@RequestParam("categories") Long id, Model viewModel, @PathVariable("id") Long productId) {
		products productaddcat = this.service.getOneProduct(productId);
		categories cattoadd = this.service.getOneCategory(id);
		this.service.addCattoPro(productaddcat, cattoadd);
		return "redirect:/products/{id}";
	}
	
	@RequestMapping("/categories/{id}")
	public String showcategory(Model viewModel, @PathVariable Long id) {
		categories thiscat = this.service.getOneCategory(id);
		List<products> pronotincat = this.service.otherPorduct(thiscat);
		List<products> catproducts = this.service.catProduct(thiscat);
		viewModel.addAttribute("category", thiscat);
		viewModel.addAttribute("products", catproducts);
		viewModel.addAttribute("otherproducts", pronotincat);
		return "showcategory.jsp";
	}
	
	@RequestMapping(value="/categories/{id}/addproduct", method=RequestMethod.POST)
	public String addproduct(@RequestParam("products") Long id, Model viewModel, @PathVariable("id") Long catId) {
		products protoadd = this.service.getOneProduct(id);
		categories cataddpro = this.service.getOneCategory(catId);
		this.service.addProtoCat(cataddpro, protoadd);
		return "redirect:/categories/{id}";
	}
}
