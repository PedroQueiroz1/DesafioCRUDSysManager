package br.com.syscrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.syscrud.model.Product;
import br.com.syscrud.service.ProductService;

@RestController
@RequestMapping("api/product")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping
	public List<Product> findAll() {
		return service.findAll();
	}
	
	@PostMapping
	public Product create(Product product) {
		return service.create(product);
	}
	
	@PutMapping
	public Product update(Long id, Product product) {
		return service.update(id, product);
	}
	
	@DeleteMapping
	public void delete(Long id) {
		service.delete(id);
	}
}
