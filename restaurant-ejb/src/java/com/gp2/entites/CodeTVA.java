
package com.gp2.entites;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class CodeTVA implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String type;
    private float tauxTVA;

    // propriétés pour les associations
    @OneToMany(mappedBy = "codeTVA")
    List<Produit> produits;
    
    // propriétés pour les associations
    @OneToMany(mappedBy = "formule")
    List<Formule> formules;
    
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
//        if (!(object instanceof CodeTVA)) {
//            return false;
//        }
//        CodeTVA other = (CodeTVA) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        return type + " ("+ tauxTVA +" )";
    }
    
}
