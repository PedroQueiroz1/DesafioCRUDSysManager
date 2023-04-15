package br.com.syscrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.syscrud.model.Author;
import br.com.syscrud.repository.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository repository;

	public Author create(Author author) {
		return repository.save(author);
	}

	public List<Author> findAll() {
		return repository.findAll();
	}
	
	public Author update(Long id, Author Author) {
		//Verifica se o ID é nulo ou se não existe no banco de dados
		if(id == null || !repository.existsById(id)) {
			throw new IllegalArgumentException("Esse autor não existe no nosso banco de dados!");
		}
		return repository.save(Author);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
	
}
