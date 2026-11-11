package com.cmvt.bankaccount.accounts;

//1. ABSTRAÇÃO: Definição de um contrato de comportamento que qualquer conta deve ter
public interface OperacoesBancarias {
	
	void depositar(double valor);
	void sacar(double valor);
	void exibirExtrato();

}
