package com.lancefallon.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EntryController {

	@RequestMapping("/")
	public String index(){
		return "index.html";
	}
	
}
