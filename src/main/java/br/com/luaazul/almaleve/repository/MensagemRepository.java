package br.com.luaazul.almaleve.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.luaazul.almaleve.model.Mensagem;

@Repository
public interface MensagemRepository extends JpaRepository<Mensagem, Long>{

}
