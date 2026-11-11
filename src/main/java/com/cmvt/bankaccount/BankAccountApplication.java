package com.cmvt.bankaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cmvt.bankaccount.accounts.ContaBancaria;
import com.cmvt.bankaccount.accounts.ContaCorrente;
import com.cmvt.bankaccount.accounts.ContaPoupanca;

@SpringBootApplication
public class BankAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAccountApplication.class, args);
		System.out.println("Spring boot app has started...");
		
        // POLIMORFISMO DE REFERÊNCIA: Criamos variáveis do tipo genérico (ContaBancaria) 
        // apontando para objetos específicos (ContaCorrente e ContaPoupanca)
        ContaBancaria minhaCorrente = new ContaCorrente("Ciro", "111-1", 500.0, 200.0);
        ContaBancaria minhaPoupanca = new ContaPoupanca("Beatriz", "222-2", 1000.0, 0.005);
        
        // Testando a Conta Corrente (Usa o limite do cheque especial)
        minhaCorrente.exibirExtrato();
        minhaCorrente.sacar(650.0); // Saldo era 500, mas o limite cobre os 650
        minhaCorrente.exibirExtrato();
        
        // Testando a Conta Poupança (Não tem limite, gera rendimento)
        minhaPoupanca.exibirExtrato();
        minhaPoupanca.sacar(1200.0); // Vai falhar porque não tem saldo suficiente
        
        // Fazendo um cast para acessar o método exclusivo da poupança
        ((ContaPoupanca) minhaPoupanca).aplicarRendimento();
        minhaPoupanca.exibirExtrato();
		
	}

}
