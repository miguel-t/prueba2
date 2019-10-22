package com.diegacho.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name= "BARRA")
public class Barra {
	
	private long id;
	private List<Disco> discos;

	@Transient
	public List<Disco> getDiscos() {
		return discos;
	}

	
	public void setDiscos(List<Disco> discos) {
		this.discos = discos;
	}
	
	public void agregarDisco (Disco disco) {
		discos.add(disco);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
