
package com.gp2.entites;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Produit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomProduit;    
    private float prix;
    private String image;
    
    // propriétés pour les associations
    @ManyToOne(cascade = CascadeType.PERSIST)
    private CodeTVA codeTVA;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private NatureProduit natureProduit;
    
    
    @OneToMany(mappedBy = "produit", cascade = CascadeType.PERSIST)
    private Collection<LigneCommande> ligneCommandes;
    
    @ManyToMany(mappedBy = "produits")
    private Collection<InfosProduit> typePlats;
    
    @ManyToMany()
    private Collection<InfosProduit> infosProduits;
    
    @ManyToMany
    private Collection<InfosCuisine> infosCuisines;
    
    @ManyToMany
    private Collection<Ingredient> ingredients;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
//        if (!(object instanceof Produit)) {
//            return false;
//        }
//        Produit other = (Produit) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        return nomProduit;
    }
    
}
