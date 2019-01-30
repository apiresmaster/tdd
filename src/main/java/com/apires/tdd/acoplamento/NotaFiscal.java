package com.apires.tdd.acoplamento;

import java.util.Calendar;

import com.apires.tdd.acoplamento.Cliente;

public class NotaFiscal {

	private Cliente cliente;
	private Double valor;
	private Calendar data;

	public NotaFiscal(Cliente cliente, Double valor) {
		this.cliente = cliente;
		this.valor = valor;
		data = Calendar.getInstance();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Double getValor() {
		return valor;
	}

	public Calendar getData() {
		return data;
	}

	
}
