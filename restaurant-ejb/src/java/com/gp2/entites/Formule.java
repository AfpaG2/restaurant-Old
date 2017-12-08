
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
public class Formule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomFormul;
    private float prix;
    private String image;
    
    //propriétés pour les associations
    @ManyToMany
    Collection<TypePlat> typePlats;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private CodeTVA codeTVA;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Carte carte;
    
    @OneToMany(mappedBy = "formule", cascade = CascadeType.PERSIST)
    private Collection<LigneCommande> ligneCommandes;
    
    
    
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
//        if (!(object instanceof Formule)) {
//            return false;
//        }
//        Formule other = (Formule) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        return nomFormul + " ("+ prix + " )" ;
    }
    
}
