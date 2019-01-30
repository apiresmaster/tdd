package com.apires.tdd.acoplamento;

import java.util.List;

public class GeradorDeNotaFiscal {

	private List<AcaoAposGerarNF> acoesAposGeracaoNF;
	private Tabela tabela;
	
	public GeradorDeNotaFiscal(List<AcaoAposGerarNF> acoesAposGerarNF, Tabela tabela) {
		this.acoesAposGeracaoNF = acoesAposGerarNF;
		this.tabela = tabela;
	}

	public NotaFiscal gera(Pedido pedido) {		
		
		Double valorNotaFiscal = pedido.getValorTotal() * tabela.pegaValor(pedido.getValorTotal());
		NotaFiscal nf = new NotaFiscal(pedido.getCliente(), valorNotaFiscal);
		
		//tarefas obrigatórias após geração da nota
		for (AcaoAposGerarNF acaoAposGerarNF : acoesAposGeracaoNF)
			acaoAposGerarNF.executa(nf);
		
		return nf;
		
	}

}
