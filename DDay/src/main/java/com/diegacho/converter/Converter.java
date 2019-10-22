package com.diegacho.converter;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Component;

import com.diegacho.dto.GymRequester;
import com.diegacho.entity.Gym;

@Component
public class Converter {
	
	public GymRequester convertGymToGymRequester(Gym gym) throws IllegalAccessException, InvocationTargetException {
		GymRequester gymRequester = new GymRequester();
		BeanUtils.copyProperties(gymRequester, gym);
		return gymRequester;
	}
	
	public Gym convertGymToGymRequester(GymRequester gymRequester) throws IllegalAccessException, InvocationTargetException {
		Gym gym = new Gym();
		BeanUtils.copyProperties(gym, gymRequester);
		return gym;
	}

}
