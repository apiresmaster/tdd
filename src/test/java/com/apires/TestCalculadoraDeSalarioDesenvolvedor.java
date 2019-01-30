package com.apires;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.apires.tdd.coessao.CalculadoraDeSalario;
import com.apires.tdd.coessao.Cargo;
import com.apires.tdd.coessao.Funcionario;

/**
 * Unit test for simple App.
 */
public class TestCalculadoraDeSalarioDesenvolvedor
{

	@Before
	public void init() {
		
	}
	
    @Test
    public void calculaSalarioDeDesenvolvedorAbaixoDoLimite()
    {
    	Double valorSalarioBaseAbaixoDoLimite = new Double(2000.00);
    	Double salarioComDesconto = new Double(1800.00);
    	Funcionario desenvolvedor = new Funcionario("João Paulo", Cargo.DESENVOLVEDOR, valorSalarioBaseAbaixoDoLimite);
    	CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario(desenvolvedor);
    	Double salario = calculadoraDeSalario.calcula();
    	
        assertEquals(salarioComDesconto , salario, 0.0001);
    }
	
    @Test
    public void calculaSalarioDeDesenvolvedorAcimaDoLimite()
    {
    	Double valorSalarioBaseAcimaDoLimite = new Double(4000.00);
    	Double valorSalarioComDesconto = new Double(3200.00);
    	Funcionario desenvolvedor = new Funcionario("João Paulo", Cargo.DESENVOLVEDOR, valorSalarioBaseAcimaDoLimite);
    	CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario(desenvolvedor);
    	Double salario = calculadoraDeSalario.calcula();
    	
        assertEquals(valorSalarioComDesconto , salario, 0.0001);
    }
}
