/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp2.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author cdi307
 */
@Entity
public class TypePlat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomTypePlat;
    @ManyToOne
    private Collection<Carte> cartes;
    @ManyToMany
    private Collection<Produit> produits;

    public TypePlat() {
        this.cartes = new ArrayList<>();
        this.produits = new ArrayList<>();
    }

    public TypePlat(String nomTypePlat) {
        this();
        this.nomTypePlat = nomTypePlat;
    }
    
    

    
    
    public String getnomTypePlat() {
        return nomTypePlat;
    }

    public void setnomTypePlat(String nomTypePlat) {
        this.nomTypePlat = nomTypePlat;
    }
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomTypePlat() {
        return nomTypePlat;
    }

    public void setNomTypePlat(String nomTypePlat) {
        this.nomTypePlat = nomTypePlat;
    }

    public Collection<Carte> getCartes() {
        return cartes;
    }

    public void setCartes(Collection<Carte> cartes) {
        this.cartes = cartes;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypePlat)) {
            return false;
        }
        TypePlat other = (TypePlat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gp2.entites.TypePlat[ id=" + id + " ]";
    }
    
}
