package br.com.syscrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.syscrud.model.Review;
import br.com.syscrud.service.ReviewService;

@RestController
@RequestMapping("/api/review")
public class ReviewController {

	@Autowired
	private ReviewService service;
	
	@GetMapping
	public List<Review> findAll() {
		return service.findAll();
	}
	
	@PostMapping
	public Review create(Review review) {
		return service.create(review);
	}
	
	@PutMapping
	public Review update(Long id, Review review) {
		return service.update(id, review);
	}
	
	@DeleteMapping
	public void delete(Long id) {
		service.delete(id);
	}
}
