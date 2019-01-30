package com.apires.tdd.coessao;

/**
 * Calculadora de salário de funcionários
 * @author apiresmaster
 *
 */
public interface RegraDeCalculo {

	/**
	 * Calcula o salário do funcionário.
	 * @param funcionario Funcionário báse.
	 * @return Valor do salário com percentual de desconto aplicado.
	 */
	public Double calcula(Funcionario funcionario);
}
