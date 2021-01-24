package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

public class TesteDaConta {

	public static void main(String[] args) {

		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta2.setTitular("João");
		conta1.deposita(100);

		System.out.println(conta1.getSaldo());
	}

}
