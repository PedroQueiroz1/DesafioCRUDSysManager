package br.com.syscrud.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie extends Product implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	
}
