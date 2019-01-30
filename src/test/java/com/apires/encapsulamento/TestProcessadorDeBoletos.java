package com.apires.encapsulamento;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.apires.tdd.acoplamento.Cliente;

public class TestProcessadorDeBoletos {

	
	@Test
	public void verificaPagamentoIntegralDaFatura() {
		
		List<Pagamento> listaDePagamentos = Arrays.asList(new Pagamento(new Double(1000.00), FormaPagamento.BOLETO));
		Fatura fatura = new Fatura(new Cliente("Alexandre Pires", "endereço cliente"), new Double(1000.00), listaDePagamentos);
		
		
		assertEquals(new Double(1000.00), fatura.getListaDePagamentos().get(0).getValor(), 0.0001);
	}
}
