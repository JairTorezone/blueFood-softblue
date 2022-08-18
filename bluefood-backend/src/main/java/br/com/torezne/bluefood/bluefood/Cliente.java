package br.com.torezne.bluefood.bluefood;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {

	private String name;
	
	public static void main(String[] args) {
		Cliente c = new Cliente();
		
		c.getName();
		c.setName("Maria");
	}
}
