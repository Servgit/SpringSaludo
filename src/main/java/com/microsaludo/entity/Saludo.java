package com.microsaludo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="saludo")
public class Saludo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="tipo", length=20, unique=true)
	private String tipo;
	
	@Column(name="saludo")
	private String saludo;
	
	public Saludo() {
		super();
	}
	
	public Saludo(long id, String tipo, String saludo) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.saludo = saludo;
	}
	

}
