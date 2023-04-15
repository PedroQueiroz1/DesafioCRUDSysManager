package br.com.syscrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.syscrud.model.Product;
import br.com.syscrud.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping
	public List<Product> findAll() {
		return service.findAll();
	}
	
}
