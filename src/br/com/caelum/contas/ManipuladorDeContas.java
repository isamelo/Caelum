package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	
	private Conta conta;

	public void criaConta(Evento evento) {
		this.conta = new Conta();
		this.conta.setTitular("Batman");
		this.conta.setAgencia("0124-5");
		this.conta.setNumero(4569);
	}
	
	public void deposita(Evento evento) {
		double valorDigitado = evento.getDouble("valor");
		this.conta.deposita(valorDigitado);
	}
	
	public void saca(Evento evento) {
		double valorDigitado = evento.getDouble("valor");
		this.conta.saca(valorDigitado);
	}

}
