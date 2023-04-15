package br.com.syscrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.syscrud.model.Country;
import br.com.syscrud.repository.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository repository;

	public Country create(Country country) {
		return repository.save(country);
	}

	public List<Country> findAll() {
		return repository.findAll();
	}
	
	public Country update(Country country) {
		//Verifica se o ID é nulo ou se não existe no banco de dados
		if(country.getId() == null || !repository.existsById(country.getId())) {
			throw new IllegalArgumentException("Esse país não existe no nosso banco de dados!");
		}
		return repository.save(country);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
	
}
