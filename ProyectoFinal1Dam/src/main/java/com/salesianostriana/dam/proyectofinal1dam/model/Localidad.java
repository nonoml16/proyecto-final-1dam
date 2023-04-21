package com.salesianostriana.dam.proyectofinal1dam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Localidad {

	@Id
	@GeneratedValue
	private Long id;
	
	private int fila, numLocalidad;
	
	private Sector sector;
	
	private Propietario propietario;
}
