package com.diegacho.manager;

import java.util.List;

import com.diegacho.entity.Barra;
import com.diegacho.entity.Disco;

public interface BarraManager {
	
	Barra findBarraById(Integer id);
	
	List<Barra> findAll();
	
	Barra findBarraBySomeDisco(Disco disco);
	
	void deleteBarra(Barra barra);
	
	boolean createBarra(Barra barra);
	
}
