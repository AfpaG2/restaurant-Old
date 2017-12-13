
package com.gp2.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
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
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private CodeTVA codeTVA;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Statut statut;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Promotion promotion;
    
    
    @ManyToMany(mappedBy = "produits")
    private Collection<NatureProduit> natureProduits;
    
    @ManyToMany(mappedBy = "produits")
    private Collection<TypePlat> typePlats;
    
    @OneToMany(mappedBy = "produit")
    private Collection<LigneCommande> ligneCommandes;
    
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection<InfosProduit> infosProduits;
    
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection<InfosCuisine> infosCuisines;
    
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection<Ingredient> ingredients;
    
    

    public Produit() {
        ingredients = new ArrayList();
        infosCuisines = new ArrayList();
        infosProduits = new ArrayList();
        typePlats = new ArrayList();
        ligneCommandes = new ArrayList();
        natureProduits = new ArrayList();

    }

    public Produit(String nomProduit) {
        this();
        this.nomProduit = nomProduit;
    }

    public Produit(String nomProduit, float prix, String image) {
        this();
        this.nomProduit = nomProduit;
        this.prix = prix;
        this.image = image;
    }

    public Produit(String nomProduit, float prix) {
        this();
        this.nomProduit = nomProduit;
        this.prix = prix;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public CodeTVA getCodeTVA() {
        return codeTVA;
    }

    public void setCodeTVA(CodeTVA codeTVA) {
        this.codeTVA = codeTVA;
    }

    public Collection<NatureProduit> getNatureProduits() {
        return natureProduits;
    }

    public void setNatureProduits(Collection<NatureProduit> natureProduits) {
        this.natureProduits = natureProduits;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    

    public Collection<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

    public Collection<TypePlat> getTypePlats() {
        return typePlats;
    }

    public void setTypePlats(Collection<TypePlat> typePlats) {
        this.typePlats = typePlats;
    }

    public Collection<InfosProduit> getInfosProduits() {
        return infosProduits;
    }

    public void setInfosProduits(Collection<InfosProduit> infosProduits) {
        this.infosProduits = infosProduits;
    }

    public Collection<InfosCuisine> getInfosCuisines() {
        return infosCuisines;
    }

    public void setInfosCuisines(Collection<InfosCuisine> infosCuisines) {
        this.infosCuisines = infosCuisines;
    }

    public Collection<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Collection<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
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
