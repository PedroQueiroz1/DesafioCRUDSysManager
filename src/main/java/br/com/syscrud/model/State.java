package br.com.syscrud.model;

import java.io.Serializable;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "state")
public class State implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	@Length(min = 1, max = 50, message = "Name")
	@NotBlank(message = "Name")
	private String name;
	
	@Column(name = "capital")
	@Length(min = 1, max = 50, message = "Capital")
	@NotBlank(message = "Capital")
	private String capital;
	
	@Column(name = "population")
	@Length(min = 1, max = 50, message = "Population")
	@NotNull(message = "Population")
	private Integer population;
	
	@OneToMany
	private List<City> cities;

	public State() {}

	public State(String name, String capital, Integer population, List<City> cities) {
		this.name = name;
		this.capital = capital;
		this.population = population;
		this.cities = cities;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
}
