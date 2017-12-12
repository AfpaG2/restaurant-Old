
package com.gp2.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Ingredient implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomIngredient;
    private float apportCalorique;

    
    //propriétés pour les associations
    @ManyToMany(mappedBy = "ingredients")
    private Collection<Produit> produits;

    public Ingredient() {
        produits = new ArrayList();
    }

    public Ingredient(String nomIngredient, float apportCalorique) {
        this();
        this.nomIngredient = nomIngredient;
        this.apportCalorique = apportCalorique;

    }

    public Ingredient(String nomIngredient) {
        this();
        this.nomIngredient = nomIngredient;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomIngredient() {
        return nomIngredient;
    }

    public void setNomIngredient(String nomIngredient) {
        this.nomIngredient = nomIngredient;
    }

    public float getApportCalorique() {
        return apportCalorique;
    }

    public void setApportCalorique(float apportCalorique) {
        this.apportCalorique = apportCalorique;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }
    
    

//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (id != null ? id.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Ingredient)) {
//            return false;
//        }
//        Ingredient other = (Ingredient) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        return "com.gp2.entites.Ingredient[ id=" + id + " ]";
    }
    
}
