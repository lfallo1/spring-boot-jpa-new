package com.lancefallon.modules.superhero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lancefallon.modules.superhero.model.Superhero;
import com.lancefallon.modules.superhero.service.SuperheroService;

@RestController
@RequestMapping("/api/v1/superhero")
public class SuperheroController {

	@Autowired
	private SuperheroService superheroService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Superhero>> findAll(){
		return new ResponseEntity<>(this.superheroService.findAll(), HttpStatus.OK);
	}
	
}
