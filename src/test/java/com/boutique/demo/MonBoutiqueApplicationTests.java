package com.boutique.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.boutique.demo.entities.Boutique;
import com.boutique.demo.entities.Vetements;

@SpringBootTest
class MonBoutiqueApplicationTests {

	@Autowired
	private com.boutique.demo.repos.VetementRepository VetementRepository;
	@Test
	public void testCreateProduit() {
	Vetements vet = new Vetements("Pantalon","enfant",620.500,2);
	VetementRepository.save(vet);
	}
	 @Test
	 public void testFindVetement()
	 {
	 Vetements v = VetementRepository.findById(1L).get(); 
	 System.out.println(v);
	 }
	 @Test
	 public void testUpdateVetement()
	 {
	 Vetements v = VetementRepository.findById(1L).get();
	 v.setPrixVetement(1000.0);
	 VetementRepository.save(v);
	 }
	 @Test
	 public void testDeleteVetement()
	 {
		 VetementRepository.deleteById(3L);;
	 }
	 @Test
	 public void testListerTousProduits()
	 {
	 List<Vetements> vets = VetementRepository.findAll();
	 for (Vetements v : vets)
	 {
	 System.out.println(v);
	 }
	 }
	 @Test
	 public void testFindByNomVetement()
	 {
	 List<Vetements> vets = VetementRepository.findByNomVetement("chemise");

	 for (Vetements v : vets)
	 {
	 System.out.println(v);
	 }

	 }
	 @Test
	 public void findByNomVetementContains()
	 {
	 List<Vetements> vets=VetementRepository.findByNomVetementContains("c");

	 for (Vetements v : vets)
	 {
	 System.out.println(v);
	 } }
	 @Test
	 public void testfindByNomPrix()
	 {
	
	 List<Vetements> vets = VetementRepository.findByNomPrix("chemise",200.5);
	 for (Vetements v : vets)
	 {
	 System.out.println(v);
	 }

	 }
	 @Test
	 public void testfindByCategorie()
	 {
	 Boutique bou = new Boutique();
	 bou.setIdBoutique(1L);
	 List<Vetements> vets = VetementRepository.findByBoutique(bou);
	 for (Vetements v : vets)
	 {
	 System.out.println(v);
	 }

	 }
	 @Test
	 public void testfindByOrderByNomVetementAsc()
	 {
	 List<Vetements> vets =
	 VetementRepository.findByOrderByNomVetementAsc();
	 for (Vetements v : vets)
	 {
	 System.out.println(v);
	 }
	 }
	 
	 @Test
	 public void testtrierVetementsNomsPrix()
	 {
	 List<Vetements> vets = VetementRepository.trierVetementsNomsPrix();
	 for (Vetements v : vets)
	 {
	 System.out.println(v);
	 }
	 }


}


