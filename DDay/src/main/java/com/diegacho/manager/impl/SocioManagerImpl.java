package com.diegacho.manager.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.diegacho.entity.Socio;
import com.diegacho.manager.SocioManager;
import com.diegacho.repository.SocioDao;

@Component
public class SocioManagerImpl implements SocioManager{
	
	@Autowired
	SocioDao dao;

	@Override
	public void createSocio(Socio socio) {
		dao.save(socio);		
	}

	@Override
	public Optional<Socio> findById(Long id) {
		return dao.findById(id);
	}
	
	public Socio findByNombre(String nombre) {
		return dao.findByNombre(nombre);
	}

	@Override
	public Socio findSocioByNombre(String nombre) {
		return dao.findByNombre(nombre);
	}

}
