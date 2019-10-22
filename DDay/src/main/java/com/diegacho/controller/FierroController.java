package com.diegacho.controller;

import javax.validation.Valid;

import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.diegacho.dto.GymRequester;
import com.diegacho.entity.Banco;
import com.diegacho.entity.Socio;
import com.diegacho.manager.SocioManager;

@RestController
@RequestMapping("/Fierros")
public class FierroController {

	@Autowired
	SocioManager socioManger;
	
	@GetMapping("/Welcome")
	public String welcome() {
		return "GymForm";
	}
	
	@PutMapping("/{userId}")
	public Banco getBanco(@PathVariable Integer id ) {
		Banco banco =  new Banco();
		banco.setId(id);
		
		return banco;
	}
	
	@PutMapping(path = "/createSocio", produces= MediaType.APPLICATION_JSON_VALUE)
	public void createSocio(@RequestBody @Valid Socio socio ) {
		
		socioManger.createSocio(socio);
	}
	
	@GetMapping("/createGym")
	public ModelAndView createGym(@ModelAttribute GymRequester gymRequester) {
		
		ModelAndView mav = new ModelAndView("GymForm");
		mav.addObject(gymRequester);
		return mav;
	} 
	
	@GetMapping("/socio/{nombre}")
	public Socio findSocioByNombre(@PathVariable String nombre) {	
		return socioManger.findSocioByNombre(nombre);
	}
}
