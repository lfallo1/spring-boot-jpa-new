package com.lancefallon.modules.superhero.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lancefallon.modules.superhero.model.Superhero;
import com.lancefallon.modules.superhero.repository.SuperheroRepository;

@Service
public class SuperheroService {

	@Autowired
	private SuperheroRepository superheroRepository;
	
	public List<Superhero> findAll(){
		return this.superheroRepository.findAll();
	}
	
}
