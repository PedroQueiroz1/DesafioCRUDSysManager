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

@Entity
@Table(name = "country")
public class Country implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	@Length(min = 2, max = 50, message = "Name")
	@NotBlank(message = "Name")
	private String name;
	
	@Column(name = "continent")
	@Length(min = 2, max = 20)
	@NotBlank(message = "Continent")
	private String continent;
	
	@OneToMany(mappedBy = "country")
	private List<City> cities;
	
	
	public Country() {}
	
	public Country(String name, String continent, List<City> cities) {
		this.name = name;
		this.continent = continent;
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


	public String getContinent() {
		return continent;
	}


	public void setContinent(String continent) {
		this.continent = continent;
	}


	public List<City> getCities() {
		return cities;
	}


	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
}
