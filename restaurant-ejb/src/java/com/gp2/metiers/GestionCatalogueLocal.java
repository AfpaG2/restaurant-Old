/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp2.metiers;

import com.gp2.persistence.carte.Carte;
import com.gp2.persistence.carte.Formule;
import com.gp2.persistence.carte.NatureProduit;
import com.gp2.persistence.carte.TypePlat;
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author youssef
 */
@Local
public interface GestionCatalogueLocal {
    public Carte getAllCarte();
    public Collection<NatureProduit> getAllProduitsByNature();
     public Collection<Formule>  getAllFormules();
     public Collection<TypePlat>  getAllProduitsByTypePlat();
    
}
