package br.com.syscrud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "genre")
	private String genre;
	
	public Book(String author, String genre) {
		this.author = author;
		this.genre = genre;
	}

	public Book() {}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}

