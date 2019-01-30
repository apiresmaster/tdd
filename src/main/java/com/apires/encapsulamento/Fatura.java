package com.apires.encapsulamento;

import java.util.List;

import com.apires.tdd.acoplamento.Cliente;

public class Fatura {

	private Cliente cliente;
	private Double valor;
	private List<Pagamento> listaDePagamentos;

	public Fatura(Cliente cliente, Double valor, List<Pagamento> listaDePagamentos) {
		
		this.cliente = cliente;
		this.valor = valor;
		this.listaDePagamentos = listaDePagamentos;
	}

	public Double getValor() {
		return valor;
	}

	public List<Pagamento> getListaDePagamentos() {
		return listaDePagamentos;
	}
}
