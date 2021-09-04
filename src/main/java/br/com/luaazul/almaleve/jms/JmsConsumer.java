package br.com.luaazul.almaleve.jms;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.luaazul.almaleve.model.Mensagem;
import br.com.luaazul.almaleve.service.MensagemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Component
@Slf4j
public class JmsConsumer {

	private List<Mensagem> mensagens = new ArrayList<>();

	private final MensagemService mensagemService;

	@JmsListener(destination = "${activemq.name}")
	public void listen(String mensagemFila) {
		log.info("Iniciando listening da fila de mensagens");

		ObjectMapper objectMapper = new ObjectMapper();

		try {
			Mensagem mensagem = objectMapper.readValue(mensagemFila, Mensagem.class);
			mensagemService.salvarMensagem(mensagem);
		} catch (Exception e) {
			log.error("Aconteceu um erro na leitura da fila no momento de salvar a mensagem, {}", e.getMessage());
		}
	}

}
