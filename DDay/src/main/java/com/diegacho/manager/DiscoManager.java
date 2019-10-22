package com.diegacho.manager;

import com.diegacho.entity.Disco;
import com.diegacho.entity.Peso;

public interface DiscoManager {

	Disco findDiscoById(Integer id);
	
	boolean createDisco(Peso peso);
	
	boolean deleteDisco(Disco disco);
}
