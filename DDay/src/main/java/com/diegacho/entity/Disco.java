package com.diegacho.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "DISCO")
public class Disco {
	private long id;
	private Peso peso;

	
	@Id
	@Column(name = "ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column (name = "PESO")
	public Peso getPeso() {
		return peso;
	}
	public void setPeso(Peso peso) {
		this.peso = peso;
	}

}
