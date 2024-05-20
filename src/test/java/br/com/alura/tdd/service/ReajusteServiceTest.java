package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;


public class ReajusteServiceTest {



	@Test
	public void reajusteDeveSerDe3PorcentoQuandoADesejar(){
		ReajusteService reajusteService = new ReajusteService();
		Funcionario funcionario = new Funcionario("Jordan", LocalDate.now(), new BigDecimal(1030.00));
	
		reajusteService.caucularReajustePorDesempenho(funcionario, Desempenho.A_DESEJAR);
		Assertions.assertEquals(new BigDecimal(1030.00), funcionario.getSalario());
		
	}
}
