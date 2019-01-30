package com.apires.tdd.coessao;

public class CalculadoraDeSalario {

	private Funcionario funcionario;

	public CalculadoraDeSalario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Double calcula() {
		
		return funcionario.getCargo().getCalculadora().calcula(funcionario);
	}
}
