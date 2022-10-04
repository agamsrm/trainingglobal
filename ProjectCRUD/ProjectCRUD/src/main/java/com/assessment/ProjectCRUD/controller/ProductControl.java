package com.assessment.ProjectCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.ProjectCRUD.Entity.Product;
import com.assessment.ProjectCRUD.Service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductControl {
	@Autowired
	ProductService productservice;

	@PostMapping("/createproduct")
	public String addproduct(@RequestBody Product product) {
		return productservice.createProduct(product);
	}

	@GetMapping("/retriveproduct/{id}")
	Product getProduct(@PathVariable("id") long id) {
		return productservice.getProduct(id);

	}

	@DeleteMapping("/removeproduct/{id}")
	String DeleteProduct(@PathVariable("id") long id) {
		return productservice.deleteProduct(id);
	}

	@PutMapping("/updateproduct")
	Product updateProduct(@RequestBody Product product) {
		return productservice.updateProduct(product);
	}
}
