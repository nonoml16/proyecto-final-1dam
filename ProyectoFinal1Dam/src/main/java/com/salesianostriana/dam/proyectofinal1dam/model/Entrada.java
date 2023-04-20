package com.salesianostriana.dam.proyectofinal1dam.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Entrada {

	@Id
	@GeneratedValue
	private Long id;
	
	private int fila, asiento;
	
	/*
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_entrada_propietario"))
	private Propietario propietario;
	*/
}
