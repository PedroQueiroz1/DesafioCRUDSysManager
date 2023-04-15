package br.com.syscrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.syscrud.model.Author;
import br.com.syscrud.service.AuthorService;

@RestController
@RequestMapping("/api/author")
public class AuthorController {

	@Autowired
	private AuthorService service;
	
	@GetMapping
	public List<Author> findAll() {
		return service.findAll();
	}
	
	@PostMapping
	public Author create(Author author) {
		return service.create(author);
	}
	
	@PutMapping
	public Author update(Long id, Author author) {
		return service.update(id, author);
	}
	
	@DeleteMapping
	public void delete(Long id) {
		service.delete(id);
	}
	
}
