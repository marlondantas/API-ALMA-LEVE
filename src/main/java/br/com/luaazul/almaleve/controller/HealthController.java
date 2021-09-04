package br.com.luaazul.almaleve.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/healthcheck")
public class HealthController {

	@GetMapping("/test")
	public ResponseEntity<String> testar(){
		return  ResponseEntity.ok("A API Alma leva está no ar!");
	}
	
	@GetMapping("/version")
	public ResponseEntity<String> version(){
		return  ResponseEntity.ok("A API Alma leva está no ar!");
	}
}
