package com.diegacho.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegacho.entity.Disco;
import com.diegacho.entity.Peso;
import com.diegacho.manager.DiscoManager;
import com.googlecode.genericdao.dao.hibernate.GeneralDAO;

@Service
public class DiscoManagerImpl implements DiscoManager {
	
	//@Autowired
	GeneralDAO dao;

	@Override
	public Disco findDiscoById(Integer id) {
		return dao.find(Disco.class, id);

	}

	@Override
	public boolean  createDisco(Peso peso) {
		Disco discoNew = new Disco();
		discoNew.setPeso(peso);
		return dao.save(discoNew);

	}

	@Override
	public boolean deleteDisco(Disco disco) {
		return dao.remove(disco);
	}

}
