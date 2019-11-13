package com.josevanolivera.cursomc.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private Integer cod;
	private String estado;
	
	
	private EstadoPagamento(Integer cod, String estado) {
		this.cod = cod;
		this.estado = estado;
	}
	
	
	public Integer getcod() {
		return cod;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public static EstadoPagamento toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(EstadoPagamento x : EstadoPagamento.values()) {
			if(cod.equals(x.getcod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("ID Inválido "+ cod);
	}
	
}
