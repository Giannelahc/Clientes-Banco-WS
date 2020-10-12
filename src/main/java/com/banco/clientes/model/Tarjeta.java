package com.banco.clientes.model;

public class Tarjeta {

	private int idTarjeta;
	
	private String numeroTarjeta;
	
	private String banco;

	public Tarjeta() {

	}

	public Tarjeta(int idTarjeta, String numeroTarjeta, String banco) {
		this.idTarjeta = idTarjeta;
		this.numeroTarjeta = numeroTarjeta;
		this.banco = banco;
	}

	public int getIdTarjeta() {
		return idTarjeta;
	}

	public void setIdTarjeta(int idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}
}
