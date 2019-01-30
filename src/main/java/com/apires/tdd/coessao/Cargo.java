package com.apires.tdd.coessao;

public enum Cargo {
	
	DESENVOLVEDOR(new RegraDeCalculoDesenvolvedor()), 
	DBA(new RegraDeCalculoDba());

	private final RegraDeCalculo regraDeCalculo;
	
	Cargo(RegraDeCalculo regraDeCalculo) {
		this.regraDeCalculo = regraDeCalculo;
	}
	
	public RegraDeCalculo getCalculadora() {
		return regraDeCalculo;
	}
	
}
