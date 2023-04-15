package br.com.syscrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	
	private String author;
	
	private String genre;
}
