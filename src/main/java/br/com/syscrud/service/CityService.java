package br.com.syscrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.syscrud.model.City;
import br.com.syscrud.repository.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository repository;

	public City create(City city) {
		return repository.save(city);
	}

	public List<City> findAll() {
		return repository.findAll();
	}
	
	public City update(City city) {
		//Verifica se o ID é nulo ou se não existe no banco de dados
		if(city.getId() == null || !repository.existsById(city.getId())) {
			throw new IllegalArgumentException("Essa cidade não existe no nosso banco de dados!");
		}
		return repository.save(city);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
}
