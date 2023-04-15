package br.com.syscrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.syscrud.model.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long>{

}
