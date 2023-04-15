package br.com.syscrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.syscrud.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long>{

}
