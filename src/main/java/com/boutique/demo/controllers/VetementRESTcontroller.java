package com.boutique.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boutique.demo.entities.Vetements;
import com.boutique.demo.service.VetementService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class VetementRESTcontroller {
	
	@Autowired
	VetementService VetementsService;
	@RequestMapping(method=RequestMethod.GET)
	 public List<Vetements> getAllVetements(){
		
		return VetementsService.getAllVetements();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Vetements getVetementbyId(@PathVariable("id") Long id) {
	return VetementsService.getVetements(id);

	}
	@RequestMapping(method = RequestMethod.POST)
	public Vetements createVetement(@RequestBody Vetements vetement) {
	return VetementsService.saveProduit(vetement);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Vetements updateVetement(@RequestBody Vetements vetement) {
	return VetementsService.updateProduit(vetement);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteVetement(@PathVariable("id") Long id)
	{
		VetementsService.deleteVetementsById(id);
	}
	@RequestMapping(value="/vetbou/{idBoutique}",method = RequestMethod.GET)
	public List<Vetements> getVetementBybouId(@PathVariable("idBoutique") Long idBou) {
	return VetementsService.findByBoutique(idBou);
	}
	
	

}
