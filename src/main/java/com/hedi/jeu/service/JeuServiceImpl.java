package com.hedi.jeu.service;

import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hedi.jeu.entities.Genre;
import com.hedi.jeu.entities.Jeu;
import com.hedi.jeu.repos.JeuRepository;


@Service
public class JeuServiceImpl implements JeuService{

	//@Autowired
	private final JeuRepository jeuRepository;
	
	
	
	public JeuServiceImpl(JeuRepository jeuRepository) {
		super();
		this.jeuRepository=jeuRepository;
	}

	@Override
	public Jeu saveJeu(Jeu j) {
		// TODO Auto-generated method stub
		return jeuRepository.save(j);
	}

	@Override
	public Jeu updateJeu(Jeu j) {
		// TODO Auto-generated method stub
		return jeuRepository.save(j);
	}

	@Override
	public void deleteJeu(Jeu j) {
		jeuRepository.delete(j);
		
	}

	@Override
	public void deleteJeuById(Long id) {
		jeuRepository.deleteById(id);
	}

	@Override
	public Jeu getJeu(Long id) {
		return jeuRepository.findById(id).get();
		
	}

	@Override
	public List<Jeu> getAllJeu() {
		// TODO Auto-generated method stub
		return jeuRepository.findAll();
	}

	@Override
	public List<Jeu> findByNomJeu(String nom) {
		return jeuRepository.findByNomJeu(nom);
	}

	@Override
	public List<Jeu> findByNomJeuContains(String nom) {
		return jeuRepository.findByNomJeuContains(nom);

	}

	@Override
	public List<Jeu> findByNomPrix(String nom, Double prix) {
		return jeuRepository.findByNomPrix(nom, prix);

	}

	@Override
	public List<Jeu> findByGenre(Genre genre) {
		return jeuRepository.findByGenre(genre);

	}

	@Override
	public List<Jeu> findByGenreIdGen(Long id) {
		return jeuRepository.findByGenreIdGen(id);
	}

	@Override
	public List<Jeu> findByOrderByNomJeuAsc() {
		return jeuRepository.findByOrderByNomJeuAsc();

	}

	@Override
	public List<Jeu> trierJeuxNomsPrix() {
		return jeuRepository.trierJeuxNomsPrix();

	}

}
