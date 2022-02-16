package com.microsaludo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microsaludo.entity.Saludo;
import com.microsaludo.service.SaludoService;


@RestController
@RequestMapping("/saludos")
public class SaludoController {
	
	@Autowired
	private SaludoService miSalService;
	
	
	@GetMapping("/todos")
	public List<Saludo> getAll(){
		return miSalService.getAllSaludos();
	}
	
	@PostMapping("/guardar")
	public Saludo guardar(@RequestBody Saludo saludo) {
		return miSalService.guardar(saludo);
	}
	

}
