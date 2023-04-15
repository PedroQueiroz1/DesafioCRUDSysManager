package br.com.syscrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.syscrud.model.Movie;
import br.com.syscrud.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;

	public Movie create(Movie movie) {
		return repository.save(movie);
	}

	public List<Movie> findAll() {
		return repository.findAll();
	}
	
	public Movie update(Movie movie) {
		//Verifica se o ID é nulo ou se não existe no banco de dados
		if(movie.getId() == null || !repository.existsById(movie.getId())) {
			throw new IllegalArgumentException("Esse endereço não existe no nosso banco de dados!");
		}
		return repository.save(movie);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
}
