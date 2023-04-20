package com.salesianostriana.dam.proyectofinal1dam.model;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Propietario {

	@Id
	private String dni;
	
	private String nombre, apellidos;
	private LocalDate fechaAlta;
	
	/*
	@OneToMany(mappedBy = "propietario", fetch = FetchType.EAGER)
	@Builder.Default
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	private List<Entrada> entradas = new ArrayList<>();
	
	
	@OneToMany(mappedBy = "propietario", fetch = FetchType.EAGER)
	@Builder.Default
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	private List<Silla> sillas = new ArrayList<>();
	
	
	
	@OneToMany(mappedBy = "propietario", fetch = FetchType.EAGER)
	@Builder.Default
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	private List<Palco> palcos = new ArrayList<>();
	*/
}
