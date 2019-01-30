package com.apires.encapsulamento;

public class Pagamento {

	private Double valor;
	private FormaPagamento formaDePagamento;

	public Pagamento(Double valor, FormaPagamento formaDePagamento) {

		this.valor = valor;
		this.formaDePagamento = formaDePagamento;
	}

	public Double getValor() {
		return valor;
	}

	public FormaPagamento getFormaDePagamento() {
		return formaDePagamento;
	}

}
