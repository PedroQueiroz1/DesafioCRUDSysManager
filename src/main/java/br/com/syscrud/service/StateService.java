package br.com.syscrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.syscrud.model.State;
import br.com.syscrud.repository.StateRepository;

@Service
public class StateService {

	@Autowired
	private StateRepository repository;

	public State create(State state) {
		return repository.save(state);
	}

	public List<State> findAll() {
		return repository.findAll();
	}
	
	public State update(State state) {
		//Verifica se o ID é nulo ou se não existe no banco de dados
		if(state.getId() == null || !repository.existsById(state.getId())) {
			throw new IllegalArgumentException("Esse estado não existe no nosso banco de dados!");
		}
		return repository.save(state);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
}
