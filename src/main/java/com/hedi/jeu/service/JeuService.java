package com.hedi.jeu.service;

import java.util.List;

import com.hedi.jeu.entities.Genre;
import com.hedi.jeu.entities.Jeu;

public interface JeuService {
	Jeu saveJeu(Jeu j);
	Jeu updateJeu(Jeu j);
	void deleteJeu(Jeu j);
	void deleteJeuById(Long id);
	Jeu getJeu(Long id);
	List<Jeu> getAllJeu();
	List<Jeu> findByNomJeu(String nom);
	List<Jeu> findByNomJeuContains(String nom);
	List<Jeu> findByNomPrix (String nom, Double prix);
	List<Jeu> findByGenre (Genre genre);
	List<Jeu> findByGenreIdGen(Long id);
	List<Jeu> findByOrderByNomJeuAsc();
	List<Jeu> trierJeuxNomsPrix();
}
