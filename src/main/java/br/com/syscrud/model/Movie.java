package br.com.syscrud.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie extends Product implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "director")
	private String director;
	
	@Column(name = "duration")
	private Integer duration;
	
}
