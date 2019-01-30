package com.apires.tdd.acoplamento;

public class NFDao implements AcaoAposGerarNF {

	@Override
	public void executa(NotaFiscal nf) {
		
		System.out.println("Item persistido com sucesso");		
	}
}
