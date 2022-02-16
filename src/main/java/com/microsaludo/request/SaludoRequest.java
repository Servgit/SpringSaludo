package com.microsaludo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaludoRequest {
	
	@JsonProperty("tipo")
	private String tipo;
	
	private String saludo;

}
