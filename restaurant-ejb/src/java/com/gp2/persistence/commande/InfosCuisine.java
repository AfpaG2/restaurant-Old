
package com.gp2.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class InfosCuisine implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String exigence;
    private String valeurExigence;
    
    //propriétés pour les associations
    @ManyToMany(mappedBy = "infosCuisines")
    private Collection<Produit> produits;

    public InfosCuisine() {
        produits = new ArrayList();
    }

    public InfosCuisine(String exigence, String valeurExigence) {
        this();
        this.exigence = exigence;
        this.valeurExigence = valeurExigence;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExigence() {
        return exigence;
    }

    public void setExigence(String exigence) {
        this.exigence = exigence;
    }

    public String getValeurExigence() {
        return valeurExigence;
    }

    public void setValeurExigence(String valeurExigence) {
        this.valeurExigence = valeurExigence;
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
//        if (!(object instanceof InfosCuisine)) {
//            return false;
//        }
//        InfosCuisine other = (InfosCuisine) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        return "com.gp2.entites.InfosCuisine[ id=" + id + " ]";
    }
    
}
