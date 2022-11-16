package com.boutique.demo.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomVet", types = { Vetements.class })
public interface VetementProjection {
	public String getNomVetement();

}
