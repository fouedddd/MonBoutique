package com.boutique.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Boutique {
	@Id
	@GeneratedValue(strategy = GenerationType .IDENTITY)
	private Long idBoutique;
	private String nomBout;
	private String adresse;
	@OneToMany(mappedBy = "Boutique")
	private List<Vetements> Vetements ;
	public Boutique() {
		super();
	
	}
	
	public Boutique(String nomBout, String adresse, List<com.boutique.demo.entities.Vetements> vetements) {
		super();
		this.nomBout = nomBout;
		this.adresse = adresse;
		Vetements = vetements;
	}

	public Long getIdBoutique() {
		return idBoutique;
	}
	public void setIdBoutique(Long idBoutique) {
		this.idBoutique = idBoutique;
	}
	public String getNomBout() {
		return nomBout;
	}
	public void setNomBout(String nomBout) {
		this.nomBout = nomBout;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public List<Vetements> getVetements() {
		return Vetements;
	}
	public void setVetements(List<Vetements> vetements) {
		Vetements = vetements;
	}
	


}
