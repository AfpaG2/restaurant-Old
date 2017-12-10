
package com.gp2.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author Ibrahim Kelani <ibrahim.kelani@gmail.com>
 */
@Entity
public class Promotion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String promotion;

    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    private Date dateDebut;

    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    private Date dateFin;
    
    @Column(nullable = false)
    private float pourcentageRemise;
    
    // Gestion des dependances
    @OneToMany
    private Collection<Formule> formules;

    @OneToMany
    private Collection<Produit> produits;
    
    public Promotion() {
        formules = new ArrayList<>();
        produits = new ArrayList<>();
    }

    public Promotion(String promotion, Date dateDebut, Date dateFin, float pourcentageRemise) {
        this();
        this.promotion = promotion;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.pourcentageRemise = pourcentageRemise;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public float getPourcentageRemise() {
        return pourcentageRemise;
    }

    public void setPourcentageRemise(float pourcentageRemise) {
        this.pourcentageRemise = pourcentageRemise;
    }

    @Override
    public String toString() {
        return this.promotion + "(" + this.pourcentageRemise + ")";
    }

}
