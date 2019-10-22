package com.diegacho.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "GYM")
public class Gym {

	private long id;
	private String nombre;
	private List<Socio> socios;
	private List<Maquina> manquina;
	
	@Id
	@Column(name = "ID_GYM", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@OneToMany(cascade= CascadeType.ALL, mappedBy = "gym")
	public List<Socio> getSocios() {
		return socios;
	}
	public void setSocios(List<Socio> socios) {
		this.socios = socios;
	}

	@Transient
	public List<Maquina> getManquina() {
		return manquina;
	}
	public void setManquina(List<Maquina> manquina) {
		this.manquina = manquina;
	}
}
