package com.microsaludo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microsaludo.entity.Saludo;

public interface SaludoRepository extends JpaRepository<Saludo, Long>{
	
}

