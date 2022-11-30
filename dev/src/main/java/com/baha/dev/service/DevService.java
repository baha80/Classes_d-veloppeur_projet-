package com.baha.dev.service;
import java.util.List;

import com.baha.dev.entities.Projet;
import com.baha.dev.entities.Dev;
public interface DevService {
Dev saveDev(Dev p);
Dev updateDev(Dev p);
void deleteDev(Dev p);
void deleteDevById(Long id);
Dev getDev(Long id);
List<Dev> getAllDevs();
List<Dev> findByNomDev(String nom);
List<Dev> findByNomDevContains(String nom);
List<Dev> findByNomPrix (String nom, Double prix);
List<Dev> findByProjet (Projet projet);
List<Dev> findByProjetIdCat(Long id);
List<Dev> findByOrderByNomDevAsc();
List<Dev> trierDevsNomsPrix();
}