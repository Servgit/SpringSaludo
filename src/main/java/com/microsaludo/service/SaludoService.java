package com.microsaludo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microsaludo.entity.Saludo;
import com.microsaludo.repository.SaludoRepository;

@Service
public class SaludoService {
	@Autowired
	private SaludoRepository repo;
	
	public List<Saludo> getAllSaludos(){
		return repo.findAll();
	}
	
	public Saludo guardar(Saludo saludo) {
		return repo.save(saludo);
		
	}
	
	public Saludo traerPorId(long id) {
		return repo.findById(id).get();
	}

}
