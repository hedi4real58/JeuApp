package com.hedi.jeu;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hedi.jeu.entities.Genre;
import com.hedi.jeu.entities.Jeu;
import com.hedi.jeu.repos.JeuRepository;

@SpringBootTest
class JeuApplicationTests {
	@Autowired
	private JeuRepository jeuRepository;
	@Test
	public void testCreateProduit() {
	Jeu j = new Jeu("chivalry 2 ",25.00,new Date());
	jeuRepository.save(j);
	}
	 @Test
	 public void testFindJeu()
	 {
	 Jeu j = jeuRepository.findById(1L).get();
	 System.out.println(j);
	 }
	 
	 @Test
	 public void testUpdateJeu()
	 {
	 Jeu j = jeuRepository.findById(1L).get();
	 j.setPrixJeu(20.00);
	 jeuRepository.save(j);
	 System.out.println(j);
	 }
	 
	 @Test
	 public void testDeleteJeu()
	 {
		 jeuRepository.deleteById(1L);
	 }
	 
	 @Test
	 public void testFindAllJeu()
	 {
		 List<Jeu> jeux = jeuRepository.findAll();
		 for (Jeu j:jeux)
			 System.out.println(j);
	 }
	 
	 
	 @Test
	 public void testFindJeuByNom()
	 {
	 List <Jeu> jeux= jeuRepository.findByNomJeu("Battlefield V");
			 for (Jeu j:jeux)
				 System.out.println(j);
		 }
	 
	 
	 @Test
	 public void testFindJeuByNomContains()
	 {
	 List <Jeu> jeux= jeuRepository.findByNomJeuContains("B");
			 for (Jeu j:jeux)
				 System.out.println(j);
		 }
	 
	 @Test
	 public void testfindByNomPrix()
	 {
	 List<Jeu> jeux = jeuRepository.findByNomPrix("chivalry 2", 20.00);
	 for (Jeu j : jeux)
	 {
	 System.out.println(j);
	 }
	 }
	 
	 @Test
	 public void testfindByGenre()
	 {
	 Genre gen = new Genre();
	 gen.setIdGen(1L);
	 List<Jeu> jeux = jeuRepository.findByGenre(gen);
	 for (Jeu j : jeux)
	 {
	 System.out.println(j);
	 }
	 }
	 
	 @Test
	 public void findByGenreIdGen()
	 {
	 List<Jeu> jeux = jeuRepository.findByGenreIdGen(1L);
	 for (Jeu j : jeux)
	 {
	 System.out.println(j);
	 }
	 }
	 @Test
	 public void testfindByOrderByNomJeuAsc()
	 {
	 List<Jeu> jeux = jeuRepository.findByOrderByNomJeuAsc();
	 for (Jeu j : jeux)
	 {
	 System.out.println(j);
	 }
	  }
	 @Test
	 public void testTrierJeuxNomsPrix()
	 {
	 List<Jeu> jeux = jeuRepository.trierJeuxNomsPrix();
	 for (Jeu j : jeux)
	 {
	 System.out.println(j);
	 }
	 }
	 

}
