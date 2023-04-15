package br.com.syscrud.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address extends City implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	
}
