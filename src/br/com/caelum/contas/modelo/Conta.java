package br.com.caelum.contas.modelo;

/** 
 * Metodo para construcao da conta
 * @author
 * 
 * */

public class Conta {

	private double saldo;
	private String titular;
	private int numero;
	private String agencia;
	
	
	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

		public void deposita (double valor) {
		this.saldo += valor;	
	}
	
		public void saca (double valor) {
			this.saldo -= valor;
		}
}
