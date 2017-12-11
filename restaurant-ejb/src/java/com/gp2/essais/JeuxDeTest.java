

package com.gp2.essais;

import com.gp2.entites.Employe;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * 
 * @author Ibrahim Kelani <ibrahim.kelani@gmail.com>
 */
public class JeuxDeTest {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("restaurant-ejbPU");
        
        EntityManager entityManager = emf.createEntityManager();
        
        System.out.println("1) Creation d'employes");
        
        Date dateNaissance = new GregorianCalendar(1986, 5, 23).getTime();
        Date dateEmbauche = new GregorianCalendar(2017, 9, 1).getTime();
        Date dateFin = null;
        
        // Creation d'employé 1
        Employe employe1 = new Employe();
        employe1.setNom("Deshayes");
        employe1.setPrenom("Eric");
        employe1.setPassword("1234");
        employe1.setDateNaissance(dateNaissance);
        employe1.setTelephone("0678048923");
        employe1.setAdresse("6 rue des Poriers, 75018 Paris");
        employe1.setDateEmbauche(dateEmbauche);
        employe1.setDateFin(dateFin);
        
        entityManager.persist(employe1);
        
        // Creation de la transaction
        System.out.println("\n-- Commit --");
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityTransaction.commit();
        
        // Fermeture des entites manager et manager factory
        entityManager.close();
        emf.close();
    }

}
