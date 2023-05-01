package model;

import java.sql.Date;
import java.lang.String;

public class Reserva {
	
	private Integer id;
	
	private Date diaEntrada;
	private Date diaSaida;
	private String valor;
	private String formaPagamento;
//	que será calculado com base em um valor diário fixo que você mesmo pode escolher.
	
//	onde o usuário pode escolher entre:
//
//		Cartão de crédito
//	    Cartão de débito
//	    Boleto
	
	public Reserva(Integer id, Date diaEntrada, Date diaSaida, String valor, String formaPagamento) {
	
		this.id = id;
		this.diaEntrada = diaEntrada;
		this.diaSaida = diaSaida;
		this.valor = valor;
		this.formaPagamento = formaPagamento;
	}
	
	public Reserva(Date diaEntrada, Date diaSaida, String valor, String formaPagamento) {
		
		this.diaEntrada = diaEntrada;
		this.diaSaida = diaSaida;
		this.valor = valor;
		this.formaPagamento = formaPagamento;
	}
	
	

	public Reserva() {
		
	}

	public Integer getId() {
		return id;
	}

	public Date getDiaEntrada() {
		return diaEntrada;
	}

	public Date getDiaSaida() {
		return diaSaida;
	}

	public String getValor() {
		return valor;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDiaEntrada(Date diaEntrada) {
		this.diaEntrada = diaEntrada;
	}

	public void setDiaSaida(Date diaSaida) {
		this.diaSaida = diaSaida;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", diaEntrada=" + diaEntrada + ", diaSaida=" + diaSaida + ", valor=" + valor
				+ ", formaPagamento=" + formaPagamento + "]";
	}

	
	


}
