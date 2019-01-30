package com.apires.tdd.coessao;

/**
 * Calculadora de desconto para o cargo de DBA
 *
 */
public class RegraDeCalculoDba extends RegraAplicaDesconto implements RegraDeCalculo
{
	
	/**
	 * Calcula o salário do DBA
	 */
	public Double calcula(Funcionario funcionario) {
		
		return defineDesconto(funcionario);
	}

	@Override
	protected Double limite() {
		
		return new Double(2500.00);
	}

	@Override
	protected Float porcentagemAcimaDoLimite() {

		return 0.75f;
	}

	@Override
	protected Float porcentagemBase() {

		return 0.85f;
	}
}
