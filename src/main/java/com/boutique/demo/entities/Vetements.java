package com.boutique.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Vetements {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType .IDENTITY)
	private Long idVetement;
	private String nomVetement;
	private String typeVetement;
	private Double prixVetement;
	private int quantiteVetement;
	@ManyToOne
	private Boutique Boutique;
	
	public Vetements() {
		super();
		
	}
	
	public Vetements(String nomVetement, String typeVetement, Double prixVetement, int quantiteVetement) {
		super();
		this.nomVetement = nomVetement;
		this.typeVetement = typeVetement;
		this.prixVetement = prixVetement;
		this.quantiteVetement = quantiteVetement;
	}

	public Long getIdVetement() {
		return idVetement;
	}
	public void setIdVetement(Long idVetement) {
		this.idVetement = idVetement;
	}
	public String getNomVetement() {
		return nomVetement;
	}
	public void setNomVetement(String nomVetement) {
		this.nomVetement = nomVetement;
	}
	public String getTypeVetement() {
		return typeVetement;
	}
	public void setTypeVetement(String typeVetement) {
		this.typeVetement = typeVetement;
	}
	public Double getPrixVetement() {
		return prixVetement;
	}
	public void setPrixVetement(Double prixVetement) {
		this.prixVetement = prixVetement;
	}
	public int getQuantiteVetement() {
		return quantiteVetement;
	}
	public void setQuantiteVetement(int quantiteVetement) {
		this.quantiteVetement = quantiteVetement;
	}

	@Override
	public String toString() {
		return "Vetements [idVetement=" + idVetement + ", nomVetement=" + nomVetement + ", typeVetement=" + typeVetement
				+ ", prixVetement=" + prixVetement + ", quantiteVetement=" + quantiteVetement + "]";
	}

	


}
