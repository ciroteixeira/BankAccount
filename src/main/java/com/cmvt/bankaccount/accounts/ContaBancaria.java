package com.cmvt.bankaccount.accounts;

//1. ABSTRAÇÃO: Classe abstrata que serve de molde geral, mas não pode ser instanciada diretamente
public abstract class ContaBancaria implements OperacoesBancarias {
	
	// 2. ENCAPSULAMENTO: Atributos privados e protegidos para proteger os dados
	private String titular;
	private String numeroConta;
	protected double saldo; // 'protected' permite que as classes filhas acessem diretamente
	
	// Construtor da classe base
	public ContaBancaria(String titular, String numeroConta, double saldo) {
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	// 2. ENCAPSULAMENTO: Métodos públicos (Getters) para permitir leitura controlada dos dados
	public String getTitular() {
		return titular;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	// Implementação padrão de um método da interface
	@Override
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("Depósito de R$: " + valor + " realizado na conta " + numeroConta);
		}
	}
	
	

}
