package com.lancefallon.modules.suit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lancefallon.modules.suit.model.Suit;
import com.lancefallon.modules.suit.service.SuitService;

@RestController
@RequestMapping("/api/v1/suit")
public class SuitController {

	@Autowired
	private SuitService suitService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Suit>> findAll(){
		return new ResponseEntity<>(this.suitService.findAll(), HttpStatus.OK);
	}
	
}
