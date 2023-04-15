package br.com.syscrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.syscrud.model.Product;
import br.com.syscrud.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public Product create(Product product) {
		return repository.save(product);
	}

	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product update(Product product) {
		//Verifica se o ID é nulo ou se não existe no banco de dados
		if(product.getId() == null || !repository.existsById(product.getId())) {
			throw new IllegalArgumentException("Esse produto não existe no nosso banco de dados!");
		}
		return repository.save(product);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
	
}
