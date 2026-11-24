package com.hedi.jeu.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@JsonPropertyOrder({"idGen", "nomGen", "descriptionGen"})
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGen;
    private String nomGen;
    private String descriptionGen;

    @JsonIgnore
    @OneToMany(mappedBy = "genre")
    private List<Jeu> jeux;

    public List<Jeu> getJeux() {
        return jeux;
    }

    public void setJeux(List<Jeu> jeux) {
        this.jeux = jeux;
    }

    public Genre() {
        super();
    }

    public Long getIdGen() {
        return idGen;
    }

    public void setIdGen(Long idGen) {
        this.idGen = idGen;
    }

    public String getNomGen() {
        return nomGen;
    }

    public void setNomGen(String nomGen) {
        this.nomGen = nomGen;
    }

    public String getDescriptionGen() {
        return descriptionGen;
    }

    public void setDescriptionGen(String descriptionGen) {
        this.descriptionGen = descriptionGen;
    }

    @Override
    public String toString() {
        return "Genre [idGen=" + idGen + ", nomGen=" + nomGen + ", descriptionGen=" + descriptionGen
                + ", jeux=" + jeux + "]";
    }

}