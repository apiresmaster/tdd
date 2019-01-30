package com.apires.tdd.acoplamento;

public class NFSap implements AcaoAposGerarNF {

	@Override
	public void executa(NotaFiscal nf) {
		
		System.out.println("Nota Fiscal enviada para SAP");				
	}

}
