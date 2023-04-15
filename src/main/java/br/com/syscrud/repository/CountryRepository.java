package br.com.syscrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.syscrud.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{

}
