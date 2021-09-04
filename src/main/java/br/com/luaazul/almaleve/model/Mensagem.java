package br.com.luaazul.almaleve.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.luaazul.almaleve.enums.TipoEmocao;
import lombok.Data;

@Data
@Entity
@Table(name = "tbod_mensagem")
public class Mensagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_mensagem")
	private long id;
	
	@Enumerated
	@Column(name = "cd_emocao", nullable = false)
	private TipoEmocao emocao;
	
	@Column(name = "ds_mensagem", nullable = false)
	private String mensagem;
	
	@Column(name = "dt_inclusao", nullable = false)
	private Date dataInclusao;
	
	
}
