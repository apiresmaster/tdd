package com.apires.tdd.coessao;

public abstract class RegraAplicaDesconto {

	protected abstract Double limite();
	protected abstract Float porcentagemAcimaDoLimite();
	protected abstract Float porcentagemBase(); 
	
	public Double defineDesconto(Funcionario funcionario) {
		
		if(funcionario.getSalario() >= limite())
			return funcionario.getSalario() * porcentagemAcimaDoLimite();
			
		return funcionario.getSalario() *  porcentagemBase();
	}

}