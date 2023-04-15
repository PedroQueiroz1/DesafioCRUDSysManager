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
	
	public Movie() {}

	public Movie(String director, Integer duration) {
		this.director = director;
		this.duration = duration;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
}
