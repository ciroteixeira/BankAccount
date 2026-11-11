package com.cmvt.bankaccount.accounts;

//3. HERANÇA: ContaPoupanca também herda de ContaBancaria
public class ContaPoupanca extends ContaBancaria {
	
	private double taxaRendimento;
	
	public ContaPoupanca(String titular, String numeroConta, double saldoInicial, double taxaRendimento) {
		super(titular, numeroConta, saldoInicial);
		this.taxaRendimento = taxaRendimento;
	}
	
	// Método exclusivo da Conta Poupança
	public void aplicarRendimento() {
		double rendimento = saldo * taxaRendimento;
		saldo += rendimento;
		System.out.println("Rendimento de R$" + rendimento + " aplicado com sucesso!");
	}
	
	@Override
	public void sacar(double valor) {
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado com sucesso da Conta Poupança.");
		} else {
			System.out.println("Saldo insuficiente na Poupança para o saque de R$" + valor);
		}
	}
	
	@Override
	public void exibirExtrato() {
        System.out.println("\n--- EXTRATO CONTA POUPANÇA ---");
        System.out.println("Titular: " + getTitular());
        System.out.println("Conta: " + getNumeroConta());
        System.out.println("Saldo: R$" + saldo);
	}

}
