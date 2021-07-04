package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.CargoFuncionario;
import br.com.alura.tdd.modelo.Funcionario;

public class AlimentacaoService {
	
	public void calcularAlimentacao(Funcionario funcionario, CargoFuncionario cargo, int qtdDiasMes) {
		Double alimentacao = cargo.calcularAlimentacao() * qtdDiasMes;
		funcionario.concederAlimentacao(alimentacao);
	}
}
