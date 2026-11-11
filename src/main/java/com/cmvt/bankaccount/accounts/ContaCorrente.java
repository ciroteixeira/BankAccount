package com.cmvt.bankaccount.accounts;

//3. HERANÇA: ContaCorrente herda (extends) os atributos e métodos de ContaBancaria
public class ContaCorrente extends ContaBancaria {
	
	private double limiteChequeEspecial;
	
	public ContaCorrente(String titular, String numeroConta, double saldoInicial, 
			double limiteChequeEspecial) {
		super(titular, numeroConta, saldoInicial);
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	// 4. POLIMORFISMO (Sobrescrita / @Override): Modifica o comportamento do saque para considerar o cheque especial
	@Override
	public void sacar (double valor) {
		if (valor > 0 && (saldo + limiteChequeEspecial) >= valor) {
			saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado com sucesso da Conta Corrente.");
		} else {
			System.out.println("Saldo e limite insuficientes para o saque de R$" + valor);
		}
	}
	
	@Override
	public void exibirExtrato() {
        System.out.println("\n--- EXTRATO CONTA CORRENTE ---");
        System.out.println("Titular: " + getTitular());
        System.out.println("Conta: " + getNumeroConta());
        System.out.println("Saldo Disponível: R$" + saldo);
        System.out.println("Limite Cheque Especial: R$" + limiteChequeEspecial);
	}

}
