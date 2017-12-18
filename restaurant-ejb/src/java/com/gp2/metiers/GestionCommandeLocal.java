/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp2.metiers;


import com.gp2.persistence.commande.Commande;
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author cdi307
 */
@Local
public interface GestionCommandeLocal {
    public Commande createCommande(Commande uneCommande);
    public Commande getCommande(String id);
    public Commande getAllCommandes();
    public Commande changeStatutCommande(Commande commande);
    public Commande modifierCommande(Commande commande);
    
}
