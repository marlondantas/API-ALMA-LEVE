package br.com.luaazul.almaleve.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luaazul.almaleve.model.Mensagem;
import br.com.luaazul.almaleve.repository.MensagemRepository;

@Service
public class MensagemService {

	@Autowired
	MensagemRepository mensagemRepository;
	
	public MensagemService() {
	}
	
	public Mensagem salvarMensagem(Mensagem mensagem) {
		return mensagemRepository.save(mensagem);
	}
	
}
