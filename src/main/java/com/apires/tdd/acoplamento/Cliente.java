package com.apires.tdd.acoplamento;

public class Cliente {

	private String nome;
	private Object endereco;

	public Cliente(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public Object getEndereco() {
		return endereco;
	}

	
}
