package com.baha.dev.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baha.dev.entities.Projet;
import com.baha.dev.entities.Dev;
import com.baha.dev.repos.DevRepository;
@Service
public class DevServiceImpl implements DevService {
@Autowired
DevRepository devRepository;
@Override
public Dev saveDev(Dev p) {
	return devRepository.save(p);
	}
	@Override
	public Dev updateDev(Dev p) {
	return devRepository.save(p);
	}
	@Override
	public void deleteDev(Dev p) {
	devRepository.delete(p);
	}
	@Override
	public void deleteDevById(Long id) {
	devRepository.deleteById(id);
	}
	@Override
	public Dev getDev(Long id) {
	return devRepository.findById(id).get();
	}
	@Override
	public List<Dev> getAllDevs() {
	return devRepository.findAll();
	}
	@Override
	public List<Dev> findByNomDev(String nom) {
	return devRepository.findByNomDev(nom);
	}
	@Override
	public List<Dev> findByNomDevContains(String nom) {
	return devRepository.findByNomDevContains(nom);
	}
	@Override
	public List<Dev> findByNomPrix(String nom, Double prix) {
		return devRepository.findByNomPrix(nom, prix);
	}
	@Override
	public List<Dev> findByProjet(Projet projet) {
	return devRepository.findByProjet(projet);
	}
	@Override
	public List<Dev> findByProjetIdCat(Long id) {
	return devRepository.findByProjetIdPoj(id);
	}
	@Override
	public List<Dev> findByOrderByNomDevAsc() {
	return devRepository.findByOrderByNomDevAsc();
	}
	@Override
	public List<Dev> trierDevsNomsPrix() {
	return devRepository.trierDevNomsSalaire();
	}
	}
	
