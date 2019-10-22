package com.diegacho.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.diegacho.entity.Gym;
import com.diegacho.repository.GymDao;

@Component
public class GymManager{
	
	@Autowired
	private GymDao gymDao;
	
	public void createGym(Gym gym) {
		gymDao.save(gym);	
	}
}
