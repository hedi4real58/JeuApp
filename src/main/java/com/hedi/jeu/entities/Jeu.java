package com.hedi.jeu.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
@JsonPropertyOrder({"idJeu", "nomJeu", "prixJeu", "dateCreation", "genre"})
public class Jeu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idJeu;
    private String nomJeu;
    private Double prixJeu;
    private Date dateCreation;
    @ManyToOne
    private Genre genre;

    public Jeu() {
        super();
    }

    public Jeu(String nomJeu, Double prixJeu, Date dateCreation) {
        super();
        this.nomJeu = nomJeu;
        this.prixJeu = prixJeu;
        this.dateCreation = dateCreation;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Long getIdJeu() {
        return idJeu;
    }

    public void setIdJeu(Long idJeu) {
        this.idJeu = idJeu;
    }

    public String getNomJeu() {
        return nomJeu;
    }

    public void setNomJeu(String nomJeu) {
        this.nomJeu = nomJeu;
    }

    public Double getPrixJeu() {
        return prixJeu;
    }

    public void setPrixJeu(Double prixJeu) {
        this.prixJeu = prixJeu;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "Jeu [idJeu=" + idJeu + ", nomJeu=" + nomJeu + ", prixJeu=" + prixJeu
                + ", dateCreation=" + dateCreation + "]";
    }

}