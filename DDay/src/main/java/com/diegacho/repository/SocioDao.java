package com.diegacho.repository;

import com.diegacho.entity.Socio;

public interface SocioDao extends DaoCrud<Socio, Long>{

	Socio findByNombre(String nombre);
	
}
