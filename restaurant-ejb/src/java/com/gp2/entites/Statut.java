/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp2.entites;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author cdi307
 */
@Entity
public class Statut implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false) 
    private String nomStatut;
    @Column(nullable = false) 
    private String valeurStatut;
    
    @OneToMany(mappedBy = "statut")
    private Collection<LigneCommande> ligneCommandes;
    @OneToMany(mappedBy = "statut")
    private Collection<Commande> commandes;
    
    
    public Statut() {
        
    }

    public Statut(String nomStatut, String valeurStatut) {
        this.nomStatut = nomStatut;
        this.valeurStatut = valeurStatut;
    }
    
    
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Statut)) {
            return false;
        }
        Statut other = (Statut) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gp2.entites.Statut[ id=" + id + " ]";
    }
    
}
