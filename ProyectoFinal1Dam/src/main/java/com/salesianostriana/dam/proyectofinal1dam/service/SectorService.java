package com.salesianostriana.dam.proyectofinal1dam.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectofinal1dam.model.Sector;

@Service
public class SectorService {

	public List<Sector> getLista(){
		return Arrays.asList(
				new Sector (1L, "Campana", 299),
				new Sector (2L, "Sierpes", 149),
				new Sector (3L, "Plaza San Francisco", 999),
				new Sector (4L, "Avenida", 199),
				new Sector (5L, "Catedral", 189),
				new Sector (1L, "Plaza Virgen de los Reyes", 199));
	}
	
}
