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
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author youssef
 */
@Stateless
public class GestionCatalogue implements GestionCatalogueLocal {
    @PersistenceContext(unitName = "restaurant-ejbPU")
    private EntityManager em;
    
    

    @Override
    public Carte getAllCarte(){
        return null;
    }
    
    public Collection<NatureProduit> getAllProduitsByNature(){
        return null;
    }
            
            
    public Collection<Formule>  getAllFormules(){        
        Query qr = em.createNamedQuery("com.gp2.persistence.carte.Formule.findAllFormule");
        return qr.getResultList(); 
    }
    
    public Collection<TypePlat>  getAllProduitsByTypePlat(){
        return null;
        
    }

    
    
}
