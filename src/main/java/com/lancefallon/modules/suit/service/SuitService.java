package com.lancefallon.modules.suit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lancefallon.modules.suit.model.Suit;
import com.lancefallon.modules.suit.repository.SuitRepository;

@Service
public class SuitService {

	@Autowired
	private SuitRepository suitRepository;
	
	public List<Suit> findAll(){
		return this.suitRepository.findAll();
	}
	
}
