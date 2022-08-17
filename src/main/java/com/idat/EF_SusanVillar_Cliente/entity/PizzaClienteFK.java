package com.idat.EF_SusanVillar_Cliente.entity;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.Data;

@Data
public class PizzaClienteFK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4417214286334278899L;

	@Column(name="id_cliente", nullable = false, unique = true)
	private Integer idCliente;
	
	@Column(name="id_pizza", nullable = false, unique = true)
	private Integer idPizza;
		
}
