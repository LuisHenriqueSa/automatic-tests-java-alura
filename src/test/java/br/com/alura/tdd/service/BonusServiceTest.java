package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	private Funcionario func;
	private BonusService service;
	
//	Inicializa um funcionario e um servico
	private void inicializaFuncionarioEServico(BigDecimal salario) {
		func = new Funcionario("Luis Henrique", LocalDate.now(), salario);
		service = new BonusService();
	}
	
	@Test
	public void BonusZeroParaFuncionarioSalarioAcimaDeDezMil() {
		inicializaFuncionarioEServico(new BigDecimal("25000"));
		assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(func));
	}
	
	@Test
	public void BonusDezPorcentoParaFuncionarioSalarioAbaixoDeDezMil() {
		inicializaFuncionarioEServico(new BigDecimal("5000"));;
		BigDecimal bonus = service.calcularBonus(func);
		assertEquals(new BigDecimal("500.0"), bonus);
	}
	
	@Test
	public void BonusDezPorcentoParaFuncionarioSalario10000() {
		inicializaFuncionarioEServico(new BigDecimal("10000"));
		BigDecimal bonus = service.calcularBonus(func);
		assertEquals(new BigDecimal("1000.0"), bonus);
	}

}
