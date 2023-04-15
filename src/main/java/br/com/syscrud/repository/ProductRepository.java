package br.com.syscrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.syscrud.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
