package br.com.luaazul.almaleve.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.luaazul.almaleve.model.Mensagem;
import br.com.luaazul.almaleve.repository.MensagemRepository;
import br.com.luaazul.almaleve.service.MensagemService;

@Controller
@RestController()
@RequestMapping("/mensagens")
public class MensagemController {

	@Autowired
	MensagemRepository mensagemRepository;
	
	@Autowired
	MensagemService mensagemService;

	@GetMapping()
	public List<Mensagem> listarTodas() {
		return mensagemRepository.findAll();
	}
	
	@GetMapping("/{emocao}")
	public List<Mensagem> listarEmocao(){
		return mensagemRepository.findAll();
	}
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void salvarMensagem(@RequestBody Mensagem mensagem) {
		mensagemService.salvarMensagem(mensagem);
	}
	
}
