package br.com.luaazul.almaleve.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luaazul.almaleve.model.Mensagem;
import br.com.luaazul.almaleve.repository.MensagemRepository;

@Controller
@RestController("/mensagens")
public class MensagemController {

	@Autowired
	MensagemRepository mensagemRepository;
	

	@GetMapping()
	public List<Mensagem> listarTodas() {
		return mensagemRepository.findAll();
	}
	
	
	
}
