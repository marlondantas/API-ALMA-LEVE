package br.com.luaazul.almaleve.enums;

import lombok.Getter;

@Getter
public enum TipoEmocao {

	MEDO(0,"Medo"),
	RAIVA(1,"Raiva"),
	ALEGRIA(2,"Alegria"),
	NOJINHO(3,"Nojinho"),
	TRISTEZA(4,"Tristeza");
	
	private int key;
	private String descricao;
	
	TipoEmocao(int chave, String descricao){
		this.key = chave;
		this.descricao = descricao;
	}
	
}
