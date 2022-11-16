package com.boutique.demo.service;

import java.util.List;

import com.boutique.demo.entities.Boutique;
import com.boutique.demo.entities.Vetements;

public interface VetementService {
	Vetements saveProduit(Vetements v);
	Vetements updateProduit(Vetements v);
	void deleteProduit(Vetements v);
	 void deleteVetementsById(Long id);
	 Vetements getVetement(Long id);
	List<Vetements> getAllVetements();
	Vetements getVetements(Long id);
	
	
	List<Vetements>  findByNomVetement(String nom);
	List<Vetements> findByNomVetementContains(String nom);
	List<Vetements> findByNomPrix (String nom ,Double prix);
	List<Vetements> findByBoutique (Long idbou);
	List<Vetements> findByOrderByNomVetementAsc();
	List<Vetements> trierVetementsNomsPrix ();
	List<Vetements> findByBoutique(Boutique boutique);

}
