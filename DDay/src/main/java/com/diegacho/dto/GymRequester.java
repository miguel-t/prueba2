package com.diegacho.dto;

import java.util.List;

import com.diegacho.entity.Socio;

public class GymRequester {

	private String nombre;
	private List<Socio> socios;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Socio> getSocios() {
		return socios;
	}
	public void setSocios(List<Socio> socios) {
		this.socios = socios;
	}


}
