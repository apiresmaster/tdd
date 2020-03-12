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
public class TestCalculadoraDeSalarioDba
{

	@Before
	public void init() {
		
	}
	//ola pires
	//tudo bem
    @Test
    public void calculaSalarioDeDbaAbaixoDoLimite()
    {
    	Double valorSalarioBaseAbaixoDoLimite = new Double(2000.00);
    	Double salarioComDesconto = new Double(1700.00);
    	Funcionario dba = new Funcionario("João Paulo", Cargo.DBA, valorSalarioBaseAbaixoDoLimite);
    	CalculadoraDeSalario calculaSalario = new CalculadoraDeSalario(dba);
    	Double salario = calculaSalario.calcula();

        assertEquals(salarioComDesconto , salario, 0.0001);
    }

    @Test
    public void calculaSalarioDeDbaAcimaDoLimite()
    {
    	Double valorSalarioBaseAcimaDoLimite = new Double(4000.00);
    	Double valorSalarioComDesconto = new Double(3000.00);
    	Funcionario dba = new Funcionario("João Paulo", Cargo.DBA, valorSalarioBaseAcimaDoLimite);
    	CalculadoraDeSalario calculaSalario = new CalculadoraDeSalario(dba);
    	Double salario = calculaSalario.calcula();

        assertEquals(valorSalarioComDesconto , salario, 0.0001);
    }
}
