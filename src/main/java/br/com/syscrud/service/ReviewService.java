package br.com.syscrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.syscrud.model.Review;
import br.com.syscrud.repository.ReviewRepository;

@Service
public class ReviewService {

	@Autowired
	private ReviewRepository repository;

	public Review create(Review review) {
		return repository.save(review);
	}

	public List<Review> findAll() {
		return repository.findAll();
	}
	
	public Review update(Review review) {
		//Verifica se o ID é nulo ou se não existe no banco de dados
		if(review.getId() == null || !repository.existsById(review.getId())) {
			throw new IllegalArgumentException("Esse review não existe no nosso banco de dados!");
		}
		return repository.save(review);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
}
