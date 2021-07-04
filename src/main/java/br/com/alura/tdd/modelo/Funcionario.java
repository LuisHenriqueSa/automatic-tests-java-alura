package br.com.alura.tdd.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private String nome;
	private LocalDate dataAdmissao;
	private BigDecimal salario;
	private Double valorAlimentacao;

	public Double getValorAlimentacao() {
		return valorAlimentacao;
	}

	public void setValorAlimentacao(Double valorAlimentacao) {
		this.valorAlimentacao = valorAlimentacao;
	}

	public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal salario) {
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void reajustarSalario(BigDecimal reajuste) {
		this.salario = this.salario.add(reajuste);
		
	}

	public void concederAlimentacao(Double alimentacao) {
		this.valorAlimentacao = alimentacao;
	}

}
