package br.com.torezne.bluefood.bluefood.domain.usuario;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {

	private Integer id;
	
	private String nome;
	
	private String email;
	
	private String senha;
	
	private String telefone;
	
}
