package com.hedi.jeu.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hedi.jeu.entities.Jeu;
import com.hedi.jeu.service.JeuService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class JeuRESTController {

    @Autowired
    JeuService jeuService;

    @GetMapping
    public List<Jeu> getAllJeux() {
        return jeuService.getAllJeu();
    }

    @GetMapping("/{id}")
    public Jeu getJeuById(@PathVariable("id") Long idJeu) {
        return jeuService.getJeu(idJeu);
    }

    @PostMapping
    public Jeu createProduit(@RequestBody Jeu jeu) {
        return jeuService.saveJeu(jeu);
    }

    @PutMapping
    public Jeu updateJeu(@RequestBody Jeu jeu) {
        return jeuService.updateJeu(jeu);
    }

    @DeleteMapping("/{id}")
    public void deleteJeu(@PathVariable("id") Long idJeu) {
        jeuService.deleteJeuById(idJeu);
    }

    @GetMapping("/jeuxgen/{idGen}")
    public List<Jeu> getJeuxByGenId(@PathVariable("idGen") Long idGen) {
        return jeuService.findByGenreIdGen(idGen);
    }
}