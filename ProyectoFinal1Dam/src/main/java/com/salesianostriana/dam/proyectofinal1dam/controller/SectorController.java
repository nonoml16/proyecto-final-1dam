package com.salesianostriana.dam.proyectofinal1dam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.proyectofinal1dam.service.SectorService;

@Controller
public class SectorController {

	@Autowired
	private SectorService service;
	
	@GetMapping("/sectores")
	public String controladorSectores (Model model) {
		model.addAttribute("listaSectores", service.getLista());
		return "sectores";
	}
}
