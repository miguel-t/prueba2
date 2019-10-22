package com.diegacho.manager;

import java.util.Optional;

import com.diegacho.entity.Socio;

public interface SocioManager {

	public void createSocio(Socio socio);
	
	public Optional<Socio> findById(Long id);
	
	public Socio findSocioByNombre(String nombre);
	
}
