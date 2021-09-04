package br.com.luaazul.almaleve.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/healthcheck")
@Controller
public class HealthController {

	@GetMapping("/test")
	public ResponseEntity<String> testar(){
		
		return  ResponseEntity.ok("A API Alma leva está no ar!");
		
		
	}
	
}
