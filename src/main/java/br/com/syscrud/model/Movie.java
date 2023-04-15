package br.com.syscrud.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie extends Product implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@ManyToMany
	@JoinTable(name = "movie_author",
			joinColumns = @JoinColumn(name = "movie_id"),
			inverseJoinColumns = @JoinColumn(name = "author_id"))
	private List<Author> directors;
	
	@Column(name = "duration")
	private Integer duration;
	
	public Movie() {}

	public Movie(List<Author> director, Integer duration) {
		this.directors = director;
		this.duration = duration;
	}

	public List<Author> getDirector() {
		return directors;
	}

	public void setDirector(List<Author> director) {
		this.directors = director;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
}
