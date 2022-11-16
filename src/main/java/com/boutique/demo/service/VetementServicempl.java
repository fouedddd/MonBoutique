package com.boutique.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boutique.demo.entities.Boutique;
import com.boutique.demo.entities.Vetements;
import com.boutique.demo.repos.VetementRepository;

@Service
public class VetementServicempl	 implements VetementService{
	
	@Autowired
	VetementRepository VetementRepository ;


	@Override
	public Vetements saveProduit(Vetements v) {
		return VetementRepository.save(v);
		
	}

	@Override
	public Vetements updateProduit(Vetements v) {
		return VetementRepository.save(v);
	
	}

	@Override
	public void deleteProduit(Vetements v) {
		VetementRepository.delete(v);
		
	}

	@Override
	public void deleteVetementsById(Long id) {
	    VetementRepository.deleteById(id);
		
	}

	@Override
	public Vetements getVetements(Long id)  {
		return  VetementRepository.findById(id).get();
	}

	@Override
	public List<Vetements> getAllVetements() {
		
		return  VetementRepository.findAll();
	}

	@Override
	public Vetements getVetement(Long id) {
	
		return null;
	}

	@Override
	public List<Vetements> findByNomVetement(String nom) {
		
		return VetementRepository.findByNomVetement(nom) ;
	}

	@Override
	public List<Vetements> findByNomVetementContains(String nom) {
		
		return VetementRepository.findByNomVetementContains( nom);
	}

	@Override
	public List<Vetements> findByNomPrix(String nom, Double prix) {
		
		return VetementRepository.findByNomPrix(nom,prix);
	}

	@Override
	public List<Vetements> findByBoutique(Boutique boutique) {
		
		return VetementRepository.findByBoutique(boutique);
	}

	@Override
	public List<Vetements> findByOrderByNomVetementAsc() {
		
		return VetementRepository.findByOrderByNomVetementAsc();
	}

	@Override
	public List<Vetements> trierVetementsNomsPrix() {
		
		return VetementRepository.trierVetementsNomsPrix() ;
	}

	@Override
	public List<Vetements> findByBoutique(Long idbou) {
		// TODO Auto-generated method stub
		return null;
	}

}
