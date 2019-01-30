package com.apires.tdd.acoplamento;

public class Pedido {

	private Cliente cliente;
	private Double valorTotal;
	private int quantidade;

	public Pedido(Cliente cliente, Double valorTotal, int quantidade) {
		this.cliente = cliente;
		this.valorTotal = valorTotal;
		this.quantidade = quantidade;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	

}
