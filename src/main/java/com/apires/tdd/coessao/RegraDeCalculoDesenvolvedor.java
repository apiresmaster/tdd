package com.apires.tdd.coessao;

/**
 * Regra de calculo de salário de desenvolvedor, tem como báse a faixa salarial para 
 * realização do calculo do desconto
 * @author apiresmaster
 * @version 1.0
 */
public class RegraDeCalculoDesenvolvedor extends RegraAplicaDesconto implements RegraDeCalculo
{
	
	public Double calcula(Funcionario funcionario) {
		
		return defineDesconto(funcionario);
	}

	@Override
	protected Double limite() {
		
		return new Double(3000.00);
	}

	@Override
	protected Float porcentagemAcimaDoLimite() {
		
		return 0.80f;
	}

	@Override
	protected Float porcentagemBase() {
		
		return 0.90f;
	}
}
