package com.diegacho.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegacho.entity.Barra;
import com.diegacho.entity.Disco;
import com.diegacho.manager.BarraManager;
import com.diegacho.manager.DiscoManager;
import com.googlecode.genericdao.dao.hibernate.GeneralDAO;

@Service
public class BarraManagerImpl implements BarraManager {

	//@Autowired
	GeneralDAO dao;
	@Autowired
	DiscoManager discoManager;
	
	@Override
	public Barra findBarraById(Integer id) {
		
		return dao.find(Barra.class, id);
	}

	@Override
	public Barra findBarraBySomeDisco(Disco disco) {
		 
		return null;
	}

	@Override
	public void deleteBarra(Barra barra) {
		dao.remove(barra);

	}

	@Override
	public boolean createBarra(Barra barra) {
		dao.save(barra);
		return false;
	}

	@Override
	public List<Barra> findAll() {
		
		return dao.findAll(Barra.class);
	}

}
