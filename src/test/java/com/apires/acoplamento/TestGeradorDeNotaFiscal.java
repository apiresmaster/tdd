package com.apires.acoplamento;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.apires.tdd.acoplamento.AcaoAposGerarNF;
import com.apires.tdd.acoplamento.Cliente;
import com.apires.tdd.acoplamento.GeradorDeNotaFiscal;
import com.apires.tdd.acoplamento.NFDao;
import com.apires.tdd.acoplamento.NFSap;
import com.apires.tdd.acoplamento.NotaFiscal;
import com.apires.tdd.acoplamento.Pedido;
import com.apires.tdd.acoplamento.Tabela;

public class TestGeradorDeNotaFiscal {

	private AcaoAposGerarNF dao;
	private AcaoAposGerarNF sap;
	private Cliente cliente;
	private Pedido pedido;
	
	@Before
	public void init() {
		
		cliente = new Cliente("Alexandre Pires", "Endereço de Teste");
		pedido = new Pedido(cliente, new Double(1000.00), 1);
		
		
		dao = mock(NFDao.class);
		sap = mock(NFSap.class);
	}

	@Test
	public void geraNotaFiscalEVerificaSeFoiPersistido() {

		List<AcaoAposGerarNF> listaDeAcoes = Arrays.asList(dao);
		Tabela tabela = mock(Tabela.class);
		GeradorDeNotaFiscal geradorDeNota = new GeradorDeNotaFiscal(listaDeAcoes, tabela);
		NotaFiscal notaFiscal = geradorDeNota.gera(pedido);
		
		verify(dao).executa(notaFiscal);
	}
	
	@Test
	public void geraNotaFiscalEVerificaSeFoiEnviadoParaSap() {
		
		List<AcaoAposGerarNF> listaDeAcoes = Arrays.asList(sap);
		Tabela tabela = mock(Tabela.class);
		GeradorDeNotaFiscal geradorDeNota = new GeradorDeNotaFiscal(listaDeAcoes, tabela);
		NotaFiscal notaFiscal = geradorDeNota.gera(pedido);
		
		verify(sap).executa(notaFiscal);
	}
	
	@Test
	public void consultaTabelaParaGerarValorDeImpostoDescontado() {

		List<AcaoAposGerarNF> listaDeAcoes = Arrays.asList(dao, sap);
		Tabela tabela = mock(Tabela.class);
		Mockito.when(tabela.pegaValor(pedido.getValorTotal())).thenReturn(new Double(0.2));
		
		GeradorDeNotaFiscal geradorDeNota = new GeradorDeNotaFiscal(listaDeAcoes, tabela);
		NotaFiscal notaFiscal = geradorDeNota.gera(pedido);
		

		verify(dao).executa(notaFiscal);
		verify(sap).executa(notaFiscal);
		verify(tabela).pegaValor(new Double(1000.00));
		
		assertEquals(pedido.getValorTotal() * 0.2, notaFiscal.getValor(), 0.0001);
	}
}
