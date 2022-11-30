package com.baha.dev.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.baha.dev.entities.Projet;
import com.baha.dev.entities.Dev;

@RepositoryRestResource(path ="rest")

public interface DevRepository extends JpaRepository<Dev, Long> {
List<Dev> findByNomDev(String nom);
List<Dev> findByNomDevContains(String nom);

//@Query("select p from Produit p where p.nomProduit like %?1 and p.prixProduit > ?2")
//List<Produit> findByNomPrix (String nom, Double prix);


@Query("select p from Dev p where p.nomDev like %:nom and p.salaireDev > :salaire")
List<Dev> findByNomPrix (@Param("nom") String nom,@Param("salaire") Double prix);

@Query("select p from Dev p where p.projet = ?1")
List<Dev> findByProjet (Projet projet);


List<Dev> findByProjetIdPoj(Long id);

List<Dev> findByOrderByNomDevAsc();
@Query("select p from Dev p order by p.nomDev ASC, p.salaireDev DESC")
List<Dev> trierDevNomsSalaire ();
}