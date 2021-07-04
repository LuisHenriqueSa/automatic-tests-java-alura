package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
	
	private Funcionario funcionario;
	private ReajusteService service;
	
	/* Inicializando um servico e um funcionario antes de cada teste */
	@BeforeEach
	private void inicializarFuncionario() {
		service = new ReajusteService();
		funcionario = new Funcionario("Luis Henrique", LocalDate.now(), new BigDecimal("1000"));
	}
	
	@Test
	public void ReajusteTresPorcentoADesejar() {
		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		assertEquals(funcionario.getSalario(), new BigDecimal("1030.00"));
	}
	
	@Test
	public void ReajusteQuinzePorcentoBom() {
		service.concederReajuste(funcionario, Desempenho.BOM);
		assertEquals(funcionario.getSalario(), new BigDecimal("1150.00"));
	}
	
	@Test
	public void ReajusteVintePorcentoOtimo() {
		service.concederReajuste(funcionario, Desempenho.OTIMO);
		assertEquals(funcionario.getSalario(), new BigDecimal("1200.00"));
	}
	
	@Test
	public void ReajusteQuarentaPorcentoExcelente() {
		service.concederReajuste(funcionario, Desempenho.EXCELENTE);
		assertEquals(funcionario.getSalario(), new BigDecimal("1400.00"));
	}
}
