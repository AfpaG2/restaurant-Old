/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp2.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Statut implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id    
    private int id;


    @Column(nullable = false) 
    private String nomStatut;
    @Column(nullable = false) 
    private String valeurStatut;
    
    
    
    
    @OneToMany(mappedBy = "statut")
    private Collection<LigneCommande> ligneCommandes;
    
    @OneToMany(mappedBy = "statut", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection<Commande> commandes;
    
    @OneToMany(mappedBy = "statut", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection<Emplacement> emplacements;
    
    public Statut() {
        ligneCommandes = new ArrayList<>();
        commandes = new ArrayList<>();
        emplacements = new ArrayList<>();
        
    }

    public Statut(int id, String nomStatut, String valeurStatut) {
        this();
        this.id = id;
        this.nomStatut = nomStatut;
        this.valeurStatut = valeurStatut;
    }

    public Collection<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

    public Collection<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }

    public Collection<Emplacement> getEmplacements() {
        return emplacements;
    }

    public void setEmplacements(Collection<Emplacement> emplacements) {
        this.emplacements = emplacements;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
       

    public String getNomStatut() {
        return nomStatut;
    }

    public void setNomStatut(String nomStatut) {
        this.nomStatut = nomStatut;
    }

    public String getValeurStatut() {
        return valeurStatut;
    }

    public void setValeurStatut(String valeurStatut) {
        this.valeurStatut = valeurStatut;
    }

    

    @Override
    public String toString() {
        return "com.gp2.entites.Statut[ id=" + id + " ]";
    }
    
}
