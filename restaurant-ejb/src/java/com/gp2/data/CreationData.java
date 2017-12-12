/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp2.data;

import com.gp2.entites.InfosProduit;
import com.gp2.entites.Ingredient;
import com.gp2.entites.NatureProduit;
import com.gp2.entites.Produit;
import com.gp2.entites.TypePlat;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author youssef
 */
@Stateless
public class CreationData implements CreationDataLocal {
    @PersistenceContext(unitName = "restaurant-ejbPU")
    private EntityManager em;

  @Override
   public void creerDonnees(){
        //==================================================================================|
        //                           Natures de produits                                    |
        //==================================================================================|              
        
        NatureProduit np1= new NatureProduit("NOS SALADES"); 
        NatureProduit np2= new NatureProduit("NOS SOUPES");
        NatureProduit np3= new NatureProduit("NOS PÂTES SAUTÉES");
        NatureProduit np4= new NatureProduit("NOS VIANDES");
        NatureProduit np5= new NatureProduit("NOS VOLAILLES");
        NatureProduit np6= new NatureProduit("NOS POISSONS");
        NatureProduit np7= new NatureProduit("NOS LEGUMES");
        NatureProduit np8= new NatureProduit("NOS FRUITS");
        NatureProduit np9=new NatureProduit("NOS FROMAGES");
        NatureProduit np10=new NatureProduit("NOS BOISSONS");
        
        
        //==================================================================================|
        //                                  Type de plats                                   |
        //==================================================================================|
        //                              COCKTAILS                                           |
        //==================================================================================| 
        TypePlat tp01 = new TypePlat("COCKTAILS");
        Produit  produit01 = new Produit("Sakejito ou mojito",8.5f);
        Produit  produit02 = new Produit("Aname mojito avec ou sans basilic",8.5f);
        Produit  produit03 = new Produit("Paris-Saigon",8.5f);
        Produit  produit04 = new Produit("Daiquiri",8.5f);
        Produit  produit05 = new Produit("Cosmopolitan",8.5f);
        Produit  produit06 = new Produit("Lychee martini",8.5f);
        Produit  produit07 = new Produit("Ginger julep",8.5f);
        
        Produit  produit08 = new Produit("Virgin ginger mojitoi",6.5f);
        InfosProduit infosPr07 = new InfosProduit("Alcool","Sans alcool");
        produit08.getInfosProduits().add(infosPr07);
        
        Produit  produit09 = new Produit("Kir aligoté",14.5f);
        InfosProduit infosPr01 = new InfosProduit("volume","50","cl");
        Ingredient ingd01 = new Ingredient("Cassis");
        Ingredient ingd02 = new Ingredient("pêche");
        produit09.getInfosProduits().add(infosPr01);
        produit09.getIngredients().add(ingd02);
        produit09.getIngredients().add(ingd01);
        
        Produit  produit10 = new Produit("Kir aligoté",4f);
        InfosProduit infosPr02 = new InfosProduit("volume","12.5","cl");
        produit10.getInfosProduits().add(infosPr02);
        produit10.getIngredients().add(ingd02);
        produit10.getIngredients().add(ingd01);
        
        Produit  produit11 = new Produit("Kir royal",36.9f);
        InfosProduit infosPr03 = new InfosProduit("volume","50","cl");
        produit11.getInfosProduits().add(infosPr03);
        produit11.getIngredients().add(ingd02);
        produit11.getIngredients().add(ingd01);
        
        Produit  produit12 = new Produit("Kir royal",9.5f);
        InfosProduit infosPr04 = new InfosProduit("volume","12.5","cl");
        produit12.getInfosProduits().add(infosPr04);
        produit12.getIngredients().add(ingd02);
        produit12.getIngredients().add(ingd01);
        
        Produit  produit13 = new Produit("Rosé pamplemousse",14f);
        InfosProduit infosPr05 = new InfosProduit("volume","50","cl");
        produit13.getInfosProduits().add(infosPr05); 
        Ingredient ingd03 = new Ingredient("Liqueur de pamplemousse");
        Ingredient ingd04 = new Ingredient("Rosé");
        produit13.getIngredients().add(ingd03);
        produit13.getIngredients().add(ingd04);
        
        Produit  produit14 = new Produit("Rosé pamplemousse",3.9f);
        InfosProduit infosPr06 = new InfosProduit("volume","12.5","cl");
        produit14.getInfosProduits().add(infosPr06);
        produit14.getIngredients().add(ingd03);
        produit14.getIngredients().add(ingd04);
        
        
        
        
        
        //==================================================================================|
        //                                        APERITIFS                                 |
        //==================================================================================|        
        TypePlat tp02 = new TypePlat("APERITIFS");
        
        //==================================================================================|
        //                                        PETIT DEJEUNER                            |
        //==================================================================================|
        TypePlat tp03 = new TypePlat("PETIT DEJEUNER");
        
        //==================================================================================|
        //                                        ENTREES                                   |
        //==================================================================================|
        TypePlat tp04 = new TypePlat("ENTREES");        
        // soupes
        Produit  prdu1 = new Produit("Phô au boeuf",12.5f);
        prdu1.getNaturePorduits().add(np4);
        tp04.getProduits().add(prdu1);
        
        
        Produit  prdu2 = new Produit("Phô au boeuf et boulettes",13.5f);
        Ingredient ing01 = new Ingredient("Boeuf");
        Ingredient ing02 = new Ingredient("Nouilles de riz");
        Ingredient ing03 = new Ingredient("Basilic");
        Ingredient ing04 = new Ingredient("Coriandre");
        Ingredient ing05 = new Ingredient("Menthe");
        Ingredient ing06 = new Ingredient("Ciboule ");
        
        
        Produit  prdu3 = new Produit("Phô aux légumes",12.5f);
        Produit  prdu4 = new Produit("Mi xa xui, porc laqué et raviolis",15.5f);
        Produit  prdu5 = new Produit("Mi xa xiu, porc laqué",13.1f);        
        // salades        
        Produit  prd1 = new Produit("Salade de boeuf à la vietnamienne",11.4f);
        Produit  prd2 = new Produit("Salade de poulet mariné au gingembre",10.8f);
        Produit  prd3 = new Produit("Salade de calamars sautés au piment et gingembre",11.9f);
        Produit  prd4 = new Produit("Salade de lotus aux crevettes sel et poivre",12.7f);
        
        //==================================================================================|
        //                                        PLATS                                     |
        //==================================================================================|
        TypePlat tp05 = new TypePlat("PLATS");
        Produit  produ1 = new Produit("Pâtes blanches de riz sautées au poulet mariné au gingembre et crevettes",16.2f);
        Produit  produ2 = new Produit("Pâtes blanches de riz sautées au poulet mariné au gingembre",13.9f);
        Produit  produ3 = new Produit("Pâtes blanches de riz sautées aux crevettes",14.9f);
        Produit  produ4 = new Produit("Pâtes blanches de riz sautées aux légumes",12.3f);
        
        //==================================================================================|
        //                                        DESSERTS                                  |
        //==================================================================================|
        TypePlat tp06 = new TypePlat("DESSERTS");
        Produit  produi1 = new Produit("Soupe de perles de tapioca au coco et à la banane",5f);
        Produit  produi2 = new Produit("Raviolis au nutella",6.1f);
        Produit  produi3 = new Produit("Flan au caramel et litchi",5f);
        Produit  produi4 = new Produit("Fondant au chocolat et glace coco",6.7f);
        Produit  produi5 = new Produit("Coupe coco, vanille, chocolat et sauce chocolat",7f);
        Produit  produi6 = new Produit("Salade de fruits frais exotiques",6.1f);
        Produit  produi7 = new Produit("Crème d'avocat doucement sucrée",7f);
        
        //==================================================================================|
        //                                        SAUCES                                    |
        //==================================================================================|
        TypePlat tp07 = new TypePlat("SAUCES");
        
        
      
        
   }
    
}
