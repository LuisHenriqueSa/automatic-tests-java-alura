package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.CargoFuncionario;
import br.com.alura.tdd.modelo.Funcionario;

//Calcula o valor do mes do cartao alimentacao
public class AlimentacaoServiceTest {

	private Funcionario funcionario;
	private AlimentacaoService alimentacao;
	
//	Inicializa um funcionario e um servico de alimentacao para cada test
	@BeforeEach
	private void inicializarFuncionario() {
		funcionario = new Funcionario("Luis Henrique", LocalDate.now(), new BigDecimal("1000"));
		alimentacao = new AlimentacaoService();
	}
	
	@Test
	public void ValorAlimentacaoOperario() {
		alimentacao.calcularAlimentacao(funcionario, CargoFuncionario.OPERARIO, 22);
		assertEquals(funcionario.getValorAlimentacao(), 330);
	}
	
	@Test
	public void ValorAlimentacaoGerente() {
		alimentacao.calcularAlimentacao(funcionario, CargoFuncionario.GERENTE, 22);
		assertEquals(funcionario.getValorAlimentacao(), 550);
	}
	
	@Test
	public void ValorAlimentacaoDiretor() {
		alimentacao.calcularAlimentacao(funcionario, CargoFuncionario.DIRETOR, 22);
		assertEquals(funcionario.getValorAlimentacao(), 880);
	}
}
