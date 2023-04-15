package br.com.syscrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.syscrud.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
