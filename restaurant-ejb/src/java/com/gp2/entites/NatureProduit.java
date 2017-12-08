/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp2.entites;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author cdi314
 */
@Entity
public class NatureProduit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id   
    private String nomNatureProduit;
    
    
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Carte carte;

    public String getNomNatureProduit() {
        return nomNatureProduit;
    }

    public void setNomNatureProduit(String nomNatureProduit) {
        this.nomNatureProduit = nomNatureProduit;
    }
    
   

//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (nomNatureProduit != null ? nomNatureProduit.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof NatureProduit)) {
//            return false;
//        }
//        NatureProduit other = (NatureProduit) object;
//        if ((this.nomNatureProduit == null && other.nomNatureProduit != null) || (this.nomNatureProduit != null && !this.nomNatureProduit.equals(other.nomNatureProduit))) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        return "com.gp2.entites.NatureProduit[ id=" + nomNatureProduit + " ]";
    }
    
}
