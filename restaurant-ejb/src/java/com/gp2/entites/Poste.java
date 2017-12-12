
package com.gp2.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 
 * @author Ibrahim Kelani <ibrahim.kelani@gmail.com>
 */
@Entity
public class Poste implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(nullable = false)
    private String nomPoste;
    
    @Column(nullable = true, length = 500)
    private String description;
    
    // Gestion des dependances
    @OneToMany(mappedBy = "poste", cascade = CascadeType.PERSIST)
    private Collection<Employe> employes;

    public Poste() {
        employes = new ArrayList<>();
    }

    public Poste(String nomPoste, String description) {
        this();
        this.nomPoste = nomPoste;
        this.description = description;
    }

    public String getNomPoste() {
        return nomPoste;
    }

    public void setNomPoste(String nomPoste) {
        this.nomPoste = nomPoste;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "(" + this.nomPoste + " )";
    }

}
