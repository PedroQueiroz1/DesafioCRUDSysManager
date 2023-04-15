package br.com.syscrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.syscrud.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{

}
