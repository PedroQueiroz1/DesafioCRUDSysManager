package br.com.syscrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.syscrud.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
