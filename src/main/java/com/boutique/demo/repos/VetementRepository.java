package com.boutique.demo.repos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.boutique.demo.entities.Boutique;
import com.boutique.demo.entities.Vetements;
@RepositoryRestResource(path = "rest")
public interface VetementRepository extends JpaRepository<Vetements, Long> {
	List<Vetements> findByNomVetement(String nom);
	List<Vetements> findByNomVetementContains(String nom);
	
	@Query("select v from Vetements v where v.nomVetement like %?1 and v.prixVetement > ?2")
	List<Vetements> findByNomPrix (String nom ,Double prix);
	
	/*@Query("select v from Vetements v where v.nomVetement like %:nom and v.prixVetement > :prix")
	List<Vetements> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);*/
	
	
	
	@Query("select v from Vetements v where v.Boutique = ?1")
	List<Vetements> findByBoutique (Boutique boutique);
	
	
	List<Vetements> findByOrderByNomVetementAsc();
	
	@Query("select v from Vetements v order by v.nomVetement ASC, v.prixVetement DESC")
	List<Vetements> trierVetementsNomsPrix ();
	


}
