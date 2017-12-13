package com.gp2.data;

import com.gp2.entites.Formule;
import com.gp2.entites.InfosProduit;
import com.gp2.entites.Ingredient;
import com.gp2.entites.NatureProduit;
import com.gp2.entites.Produit;
import com.gp2.entites.Statut;
import com.gp2.entites.TypePlat;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CreationData implements CreationDataLocal {

    @PersistenceContext(unitName = "restaurant-ejbPU")
    private EntityManager em;

    @Override
    public void creerDonnees() {
       
        Ingredient ing01 = new Ingredient("Boeuf");
        Ingredient ing02 = new Ingredient("Nouilles de riz");
        Ingredient ing03 = new Ingredient("Basilic");
        Ingredient ing04 = new Ingredient("Coriandre");
        Ingredient ing05 = new Ingredient("Menthe");
        Ingredient ing06 = new Ingredient("Ciboule ");
        Ingredient ing07 = new Ingredient("Citron vert");
        Ingredient ing08 = new Ingredient("Glaçons");
        Ingredient ing09 = new Ingredient("Rhum blanc");
        Ingredient ing10 = new Ingredient("Sirop de sucre de canne");
        Ingredient ing11 = new Ingredient("Eau gazeuse");
        Ingredient ing12 = new Ingredient("Liqueur d'oranges"); 
        Ingredient ing13 = new Ingredient("Jus de canneberge"); 
        Ingredient ing14 = new Ingredient("Vodka");
        Ingredient ing15 = new Ingredient("Martini");   
        Ingredient ing16 = new Ingredient("Jus de litchi");  
        Ingredient ing17 = new Ingredient("Litchi");         
        Ingredient ingd01 = new Ingredient("Cassis");
        Ingredient ingd02 = new Ingredient("pêche");        
        Ingredient ingd03 = new Ingredient("Liqueur de pamplemousse");
        Ingredient ingd04 = new Ingredient("Rosé");                
        
        Ingredient ing001 = new Ingredient("Echine de porc");
        Ingredient ing002 = new Ingredient("Ails");
        Ingredient ing003 = new Ingredient("Sauce d'huître");
        Ingredient ing004 = new Ingredient("Concombre");
        Ingredient ing005 = new Ingredient("Carottes");
        Ingredient ing006 = new Ingredient("Vinaigre d'alcool blanc au citron");
        Ingredient ing007 = new Ingredient("Vermicelles de soja");
        Ingredient ing008 = new Ingredient("Steak");
        Ingredient ing009 = new Ingredient("Carottes râpées");
        Ingredient ing010 = new Ingredient("Soja frais");
        Ingredient ing011 = new Ingredient("Salades sucrines");
        Ingredient ing012 = new Ingredient("Cacahuètes");
        Ingredient ing013 = new Ingredient("Echalote");                      
        Ingredient ing014 = new Ingredient("Citrons");      
        Ingredient ing017 = new Ingredient("Sauce Nuoc Mam");
        Ingredient ing018 = new Ingredient("Tabasco");
        Ingredient ing019 = new Ingredient("Blancs de poulet");
        Ingredient ing020 = new Ingredient("Tomates");
        Ingredient ing021 = new Ingredient("Oignon rouge");                     
        Ingredient ing022 = new Ingredient("Curry");
        Ingredient ing023 = new Ingredient("Gingembre");
        Ingredient ing025 = new Ingredient("Huile d'olive");
        Ingredient ing026 = new Ingredient("Poivre");
        Ingredient ing027 = new Ingredient("Sel");
        Ingredient ing028 = new Ingredient("Calamars en anneaux");                 
        Ingredient ing029 = new Ingredient("Morceau de gingembre");
        Ingredient ing030 = new Ingredient("Poivron jaune");
        Ingredient ing031 = new Ingredient("Poivron vert");
        Ingredient ing032 = new Ingredient("Oignon");
        Ingredient ing033 = new Ingredient("Huile d'olive");
        Ingredient ing034 = new Ingredient("Piment");
        Ingredient ing036 = new Ingredient("Crevette");
        Ingredient ing037 = new Ingredient("Cacine de lotus");
        Ingredient ing039 = new Ingredient("Poivron rouge");                       
        Ingredient ing040 = new Ingredient("vinaigre blanc de riz");
        Ingredient ing041 = new Ingredient("sucre"); 
        
        // Ingredients rajoutés par Ibrahim
        Ingredient ing150 = new Ingredient("Pates de riz");     
        Ingredient ing151 = new Ingredient("Filet de Boeuf");
        Ingredient ing152 = new Ingredient("Pousse de Haricot Mungo");
        Ingredient ing153 = new Ingredient("Ciboulettes");
        Ingredient ing154 = new Ingredient("Sauce de Soja");
        Ingredient ing155 = new Ingredient("Huile");
        Ingredient ing156 = new Ingredient("Sésame");

        Ingredient ing157 = new Ingredient("Oeufs");
        Ingredient ing158 = new Ingredient("Huile Tournesol");
        Ingredient ing159 = new Ingredient("Sauce Maggi");
        Ingredient ing160 = new Ingredient("Jambon en dés");
        Ingredient ing161 = new Ingredient("Petits Pois");
        Ingredient ing162 = new Ingredient("Gros Oignon");
        Ingredient ing163 = new Ingredient("riz");

        Ingredient ing164 = new Ingredient("Poivre Noir");
        Ingredient ing165 = new Ingredient("Batavia");
        Ingredient ing166 = new Ingredient("Tige Menthe");
        Ingredient ing167 = new Ingredient("Petits Nems");
        Ingredient ing168 = new Ingredient("Boeuf Tendre");
        Ingredient ing169 = new Ingredient("Tige de Coriandre");
        Ingredient ing170 = new Ingredient("Vermicelles de riz");

        Ingredient ing171 = new Ingredient("Caramel Maison");
        Ingredient ing172 = new Ingredient("Poitrine de Porc");
        Ingredient ing173 = new Ingredient("Champignons noirs réhydratés");
        Ingredient ing174 = new Ingredient("Courgette");
        Ingredient ing175 = new Ingredient("Vermicelles chinois");
        Ingredient ing176 = new Ingredient("Feuilles de riz");
        Ingredient ing177 = new Ingredient("Huile d'arachide");
        Ingredient ing178 = new Ingredient("Poivron Vert");
        Ingredient ing179 = new Ingredient("RumSteack ou Noix de Basse Côte");

        Ingredient ing180 = new Ingredient("Haut de cuisse (paquet de trois)");
        Ingredient ing181 = new Ingredient("Echalotes coupées finement");
        Ingredient ing182 = new Ingredient("Boite de pâte Wong ton");
        Ingredient ing183 = new Ingredient("Porc haché maigre cru");
        Ingredient ing184 = new Ingredient("Bouillon de poulet fait maison");

        Ingredient ing185 = new Ingredient("Oignon Blanc");
        Ingredient ing186 = new Ingredient("Purée de Tamarin");
        Ingredient ing187 = new Ingredient("Cacahuètes concassées");
        Ingredient ing188 = new Ingredient("Nouilles de Riz");
        Ingredient ing189 = new Ingredient("Filet de Poulet");
        Ingredient ing190 = new Ingredient("Pousse d'épinards fraiches");
        Ingredient ing191 = new Ingredient("Gingembre en poudre");
        Ingredient ing192 = new Ingredient("Curcumin");
        Ingredient ing193 = new Ingredient("Ail écrasé");
        
        Ingredient ing194 = new Ingredient("Nouilles aux oeufs Suzi Wan");
        Ingredient ing195 = new Ingredient("blanc de poulet");
        Ingredient ing196 = new Ingredient("Vinaigre Balsamique");
        Ingredient ing197 = new Ingredient("Légumes shop suey");
        Ingredient ing198 = new Ingredient("Germes de soja ");
        Ingredient ing199 = new Ingredient("Huile végétale");
        Ingredient ing200 = new Ingredient("Bouillon de poulet fait maison");
        Ingredient ing201 = new Ingredient("Bouillon de poulet fait maison");
        Ingredient ing202 = new Ingredient("Bouillon de poulet fait maison");   
        
        
        
        InfosProduit infosPr01 = new InfosProduit("volume","50","cl");
        InfosProduit infosPr02 = new InfosProduit("volume","12.5","cl");
        InfosProduit infosPr03 = new InfosProduit("volume","50","cl");
        InfosProduit infosPr04 = new InfosProduit("volume","12.5","cl");
        InfosProduit infosPr05 = new InfosProduit("volume","50","cl");
        InfosProduit infosPr06 = new InfosProduit("volume","12.5","cl");
        InfosProduit infosPr07 = new InfosProduit("Alcool","Sans alcool");
       

        //==================================================================================|
        //                           Natures de produits                                    |
        //==================================================================================|              

        NatureProduit np1 = new NatureProduit("NOS SALADES");
        NatureProduit np2 = new NatureProduit("NOS SOUPES");
        NatureProduit np3 = new NatureProduit("NOS PÂTES SAUTÉES");
        NatureProduit np4 = new NatureProduit("NOS VIANDES");
        NatureProduit np5 = new NatureProduit("NOS VOLAILLES");
        NatureProduit np6 = new NatureProduit("NOS POISSONS");
        NatureProduit np7 = new NatureProduit("NOS LEGUMES");
        NatureProduit np8 = new NatureProduit("NOS FRUITS");
        NatureProduit np9 = new NatureProduit("NOS FROMAGES");
        NatureProduit np10 = new NatureProduit("NOS BOISSONS");
        NatureProduit np11 = new NatureProduit("APERITIFS");

        //==================================================================================|
        //                                  Type de plats                                   |
        //==================================================================================|
        //                              COCKTAILS                                           |
        //==================================================================================| 

        TypePlat tp01 = new TypePlat("COCKTAILS");
        
        Produit  produit01 = new Produit("Mojito",8.5f);
        produit01.getIngredients().add(ing05);
        produit01.getIngredients().add(ing07);
        produit01.getIngredients().add(ing08);
        produit01.getIngredients().add(ing09);
        produit01.getIngredients().add(ing10);
        produit01.getIngredients().add(ing11);        
        tp01.getProduits().add(produit01);
        
        
        
        Produit  produit02 = new Produit("Daiquiri",8.5f);
        produit02.getIngredients().add(ing09);
        produit02.getIngredients().add(ing07);
        produit02.getIngredients().add(ing10);
        produit02.getIngredients().add(ing08);        
        tp01.getProduits().add(produit02);
        
        
        Produit  produit03 = new Produit("Cosmopolitan",8.5f);
        produit03.getIngredients().add(ing07);           
        produit03.getIngredients().add(ing12);             
        produit03.getIngredients().add(ing13);              
        produit03.getIngredients().add(ing14);
        tp01.getProduits().add(produit03);
        
        
        Produit  produit04 = new Produit("Lychee martini",8.5f);        
        produit04.getIngredients().add(ing07);
        produit04.getIngredients().add(ing15);
        produit04.getIngredients().add(ing16);
        produit04.getIngredients().add(ing17);
        tp01.getProduits().add(produit04);
        
        
        
        Produit  produit06 = new Produit("Ginger julep",8.5f);
        tp01.getProduits().add(produit06);
        
        
        Produit  produit08 = new Produit("Virgin ginger mojitoi",6.5f);
        produit08.getInfosProduits().add(infosPr07);
        tp01.getProduits().add(produit08);
        
        Produit  produit09 = new Produit("Kir aligoté",14.5f);
        produit09.getInfosProduits().add(infosPr01);
        produit09.getIngredients().add(ingd02);
        produit09.getIngredients().add(ingd01);
        tp01.getProduits().add(produit09);
        
        Produit  produit10 = new Produit("Kir aligoté",4f);
        produit10.getInfosProduits().add(infosPr02);
        produit10.getIngredients().add(ingd02);
        produit10.getIngredients().add(ingd01);
        tp01.getProduits().add(produit10);
        
        Produit  produit11 = new Produit("Kir royal",36.9f);
        produit11.getInfosProduits().add(infosPr03);
        produit11.getIngredients().add(ingd02);
        produit11.getIngredients().add(ingd01);
        tp01.getProduits().add(produit11);
        
        Produit  produit12 = new Produit("Kir royal",9.5f);
        produit12.getInfosProduits().add(infosPr04);
        produit12.getIngredients().add(ingd02);
        produit12.getIngredients().add(ingd01);
        tp01.getProduits().add(produit12);
        
        Produit  produit13 = new Produit("Rosé pamplemousse",14f);
        produit13.getInfosProduits().add(infosPr05);
        produit13.getIngredients().add(ingd03);
        produit13.getIngredients().add(ingd04);
        tp01.getProduits().add(produit13);
        
        Produit  produit14 = new Produit("Rosé pamplemousse",3.9f);
        produit14.getInfosProduits().add(infosPr06);
        produit14.getIngredients().add(ingd03);
        produit14.getIngredients().add(ingd04);
        tp01.getProduits().add(produit14);

        //==================================================================================|
        //                                        ENTREES                                   |
        //==================================================================================|
        TypePlat tp02 = new TypePlat("ENTREES");        
        // soupes
        Produit  prdu1 = new Produit("Phô au boeuf",12.5f);
        prdu1.getNatureProduits().add(np4);
        tp02.getProduits().add(prdu1);
        
        
        Produit  prdu2 = new Produit("Phô au boeuf et boulettes",13.5f);
        prdu2.getIngredients().add(ing01);
        prdu2.getIngredients().add(ing02);
        prdu2.getIngredients().add(ing03);
        prdu2.getIngredients().add(ing04);
        prdu2.getIngredients().add(ing05);
        prdu2.getIngredients().add(ing06);
        tp02.getProduits().add(prdu2);
        
        
        
        Produit  prdu3 = new Produit("Phô aux légumes",12.5f);
        tp02.getProduits().add(prdu3);
        
        
        Produit  prdu4 = new Produit("Mi xa xiu, porc laqué",13.1f);
        prdu4.getIngredients().add(ing001);
        prdu4.getIngredients().add(ing002);
        prdu4.getIngredients().add(ing003);
        prdu4.getIngredients().add(ing004);
        prdu4.getIngredients().add(ing005);
        prdu4.getIngredients().add(ing006);
        tp02.getProduits().add(prdu4);
        
       
      // salades        
      Produit  prdu5 = new Produit("Salade de boeuf à la vietnamienne",11.4f);
      prdu5.getIngredients().add(ing007);
      prdu5.getIngredients().add(ing05);
      prdu5.getIngredients().add(ing04);
      prdu5.getIngredients().add(ing009);
      prdu5.getIngredients().add(ing010);
      prdu5.getIngredients().add(ing011);
      prdu5.getIngredients().add(ing012);
      prdu5.getIngredients().add(ing013);
      prdu5.getIngredients().add(ing014);
      prdu5.getIngredients().add(ing017);
      prdu5.getIngredients().add(ing018);
      tp02.getProduits().add(prdu5);
     
      Produit  prdu6 = new Produit("Salade de poulet mariné au gingembre",10.8f);
      prdu6.getIngredients().add(ing019);
      prdu6.getIngredients().add(ing020);
      prdu6.getIngredients().add(ing021);
      prdu6.getIngredients().add(ing04);
      prdu6.getIngredients().add(ing022);
      prdu6.getIngredients().add(ing023);
      prdu6.getIngredients().add(ing07);
      prdu6.getIngredients().add(ing025);
      prdu6.getIngredients().add(ing026);
      prdu6.getIngredients().add(ing027);
      tp02.getProduits().add(prdu6);
      
      
      Produit  prdu7 = new Produit("Salade de calamars sautés au piment et gingembre",11.9f);
      prdu7.getIngredients().add(ing020);
      prdu7.getIngredients().add(ing028);
      prdu7.getIngredients().add(ing002);
      prdu7.getIngredients().add(ing029);
      prdu7.getIngredients().add(ing030);
      prdu7.getIngredients().add(ing031);
      prdu7.getIngredients().add(ing032);
      prdu7.getIngredients().add(ing033);
      prdu7.getIngredients().add(ing034);
      tp02.getProduits().add(prdu7);
      
      
      Produit  prdu8 = new Produit("Salade de lotus aux crevettes sel et poivre",12.7f);
      prdu8.getIngredients().add(ing034);
      prdu8.getIngredients().add(ing036);
      prdu8.getIngredients().add(ing037);
      prdu8.getIngredients().add(ing039);
      prdu8.getIngredients().add(ing002);
      prdu8.getIngredients().add(ing005);
      prdu8.getIngredients().add(ing004);     
      prdu8.getIngredients().add(ing012);
      prdu8.getIngredients().add(ing013);
      prdu8.getIngredients().add(ing017);
      prdu8.getIngredients().add(ing026);
      prdu8.getIngredients().add(ing027);
      prdu8.getIngredients().add(ing040);
      prdu8.getIngredients().add(ing041);
      tp02.getProduits().add(prdu8);   


        //==================================================================================|
        //                                        PLATS                                     |
        //==================================================================================|
        TypePlat tp05 = new TypePlat("PLATS");
        
        Produit produ1 = new Produit("Pâtes blanches de riz sautées au poulet mariné au gingembre et crevettes", 16.2f);
        Produit produ2 = new Produit("Pâtes blanches de riz sautées au poulet mariné au gingembre", 13.9f);
        Produit produ3 = new Produit("Pâtes blanches de riz sautées aux crevettes", 14.9f);
        Produit produ4 = new Produit("Pâtes blanches de riz sautées aux légumes", 12.3f);
        Produit produ5 = new Produit("Riz Cantonnais", 11.90f);
        Produit produ6 = new Produit("Bo Bun Boeuf", 13.90f);
        Produit produ7 = new Produit("Tit Kho, Porc au Caramel Vietnamien", 15.00f);
        Produit produ8 = new Produit("Nems de Courgette Maison", 9.80f);
        Produit produ9 = new Produit("Boeuf aux oignons vietnamien", 14.50f);
        Produit produ10 = new Produit("Soupe Won Ton", 9.80f);

        //==================================================================================|
        //                   CREATION D'INGREDIENTS COMPOSANT LES PLATS                     |
        //==================================================================================|
        
        // Creation du plat 1
        produ1.getIngredients().add(ing194);
        produ1.getIngredients().add(ing036);
        produ1.getIngredients().add(ing195);
        produ1.getIngredients().add(ing023);
        produ1.getIngredients().add(ing032);
        produ1.getIngredients().add(ing154);
        produ1.getIngredients().add(ing196);
        produ1.getIngredients().add(ing197);
        produ1.getIngredients().add(ing002);
        produ1.getIngredients().add(ing198);
        produ1.getIngredients().add(ing017);
        produ1.getIngredients().add(ing199);
        produ1.getIngredients().add(ing153);
        produ1.getIngredients().add(ing026);
        
        
        // Creation du plat 2
        produ2.getIngredients().add(ing188);
        produ2.getIngredients().add(ing189);
        produ2.getIngredients().add(ing190);
        produ2.getIngredients().add(ing173);
        produ2.getIngredients().add(ing154);
        produ2.getIngredients().add(ing025);
        produ2.getIngredients().add(ing027);
        produ2.getIngredients().add(ing07);
        produ2.getIngredients().add(ing154);
        produ2.getIngredients().add(ing155);
        produ2.getIngredients().add(ing191);
        produ2.getIngredients().add(ing192);
        produ2.getIngredients().add(ing022);
        produ2.getIngredients().add(ing023);
        produ2.getIngredients().add(ing193);
        
        
        // Creation du plat 3
        produ3.getIngredients().add(ing150);
        produ3.getIngredients().add(ing036);
        produ3.getIngredients().add(ing185);
        produ3.getIngredients().add(ing002);
        produ3.getIngredients().add(ing177);
        produ3.getIngredients().add(ing186);
        produ3.getIngredients().add(ing017);
        produ3.getIngredients().add(ing154);
        produ3.getIngredients().add(ing034);
        produ3.getIngredients().add(ing041);
        produ3.getIngredients().add(ing187);
        produ3.getIngredients().add(ing169);
        produ3.getIngredients().add(ing07);
        
        
        // Creation du plat 4.
        produ4.getIngredients().add(ing150);
        produ4.getIngredients().add(ing151);
        produ4.getIngredients().add(ing005);
        produ4.getIngredients().add(ing152);
        produ4.getIngredients().add(ing032);
        produ4.getIngredients().add(ing153);
        produ4.getIngredients().add(ing023);
        produ4.getIngredients().add(ing154);
        produ4.getIngredients().add(ing155);
        produ4.getIngredients().add(ing156);
        
        // Creation du plat 5.
        produ5.getIngredients().add(ing157);
        produ5.getIngredients().add(ing158);
        produ5.getIngredients().add(ing159);
        produ5.getIngredients().add(ing027);
        produ5.getIngredients().add(ing002);
        produ5.getIngredients().add(ing026);
        produ5.getIngredients().add(ing160);
        produ5.getIngredients().add(ing161);
        produ5.getIngredients().add(ing162);
        produ5.getIngredients().add(ing163);
        
        // Creation du plat 6.
        produ6.getIngredients().add(ing004);
        produ6.getIngredients().add(ing017);
        produ6.getIngredients().add(ing002);
        produ6.getIngredients().add(ing164);
        produ6.getIngredients().add(ing165);
        produ6.getIngredients().add(ing166);
        produ6.getIngredients().add(ing167);
        produ6.getIngredients().add(ing155);
        produ6.getIngredients().add(ing168);
        produ6.getIngredients().add(ing169);
        produ6.getIngredients().add(ing027);
        produ6.getIngredients().add(ing041);
        produ6.getIngredients().add(ing034);
        produ6.getIngredients().add(ing07);
        produ6.getIngredients().add(ing012);
        produ6.getIngredients().add(ing170);
        
        // Creation du plat 7.
        produ7.getIngredients().add(ing017);
        produ7.getIngredients().add(ing027);
        produ7.getIngredients().add(ing026);
        produ7.getIngredients().add(ing171);
        produ7.getIngredients().add(ing002);
        produ7.getIngredients().add(ing162);
        produ7.getIngredients().add(ing172);
        
        // Creation du plat 8.
        produ8.getIngredients().add(ing005);
        produ8.getIngredients().add(ing162);
        produ8.getIngredients().add(ing173);
        produ8.getIngredients().add(ing022);
        produ8.getIngredients().add(ing174);
        produ8.getIngredients().add(ing175);
        produ8.getIngredients().add(ing176);
        
        // Creation du plat 9.
        produ9.getIngredients().add(ing017);
        produ9.getIngredients().add(ing177);
        produ9.getIngredients().add(ing178);
        produ9.getIngredients().add(ing032);
        produ9.getIngredients().add(ing179);

        // Creation du plat 10.
        produ10.getIngredients().add(ing154);
        produ10.getIngredients().add(ing157);
        produ10.getIngredients().add(ing180);
        produ10.getIngredients().add(ing181);
        produ10.getIngredients().add(ing182);
        produ10.getIngredients().add(ing183);
        produ10.getIngredients().add(ing184);

        //==================================================================================|
        //                                        DESSERTS                                  |
        //==================================================================================|
        TypePlat tp06 = new TypePlat("DESSERTS");
        Produit produi1 = new Produit("Soupe de perles de tapioca au coco et à la banane", 5f);
        Produit produi2 = new Produit("Raviolis au nutella", 6.1f);
        Produit produi3 = new Produit("Flan au caramel et litchi", 5f);
        Produit produi4 = new Produit("Fondant au chocolat et glace coco", 6.7f);
        Produit produi5 = new Produit("Coupe coco, vanille, chocolat et sauce chocolat", 7f);
        Produit produi6 = new Produit("Salade de fruits frais exotiques", 6.1f);
        Produit produi7 = new Produit("Crème d'avocat doucement sucrée", 7f);

        //==================================================================================|
        //                                        SAUCES                                    |
        //==================================================================================|
        TypePlat tp07 = new TypePlat("SAUCES");
        
        
        //==================================================================================|
        //                                      statut                                      |
        //==================================================================================|
        // commande 10
        Statut statut1001 = new Statut(1001, "commande", "commandé");
        Statut statut1002 = new Statut(1002, "commande", "en cuisine");
        Statut statut1003 = new Statut(1003, "commande", "préparation terminé");
        Statut statut1004 = new Statut(1004, "commande", "servie");
        Statut statut1005 = new Statut(1005, "commande", "annulé");
        Statut statut1006 = new Statut(1006, "commande", "indisponible");
        Statut statut1007 = new Statut(1007, "commande", "terminé"); // quand la commande est réglé
        
        // ligne Commande 20
        Statut statut2001 = new Statut(2001, "ligneCommande", "disponible");
        Statut statut2002 = new Statut(2002, "ligneCommande", "annulé");
        Statut statut2003 = new Statut(2003, "ligneCommande", "indisponible");
        Statut statut2004 = new Statut(2004, "ligneCommande", "prêt");
        
        // produit 30
        Statut statut3001 = new Statut(3001, "produit", "disponible");
        Statut statut3002 = new Statut(3002, "produit", "indisponible");
        
        // ingredient 40
        Statut statut4001 = new Statut(4001, "ingredient", "disponible");
        Statut statut4002 = new Statut(4001, "ingredient", "indisponible");
        
        // formule 50 
        Statut statut5001 = new Statut(5001, "formule", "disponible");
        Statut statut5002 = new Statut(5002, "formule", "indisponible");
        
        //emplacement 60
        Statut statut6001 = new Statut(6001, "emplacement", "disponible");
        Statut statut6002 = new Statut(6002, "emplacement", "occupé");
        Statut statut6003 = new Statut(6003, "emplacement", "réservé");
        Statut statut6004 = new Statut(6004, "emplacement", "indisponible");
        
        //==================================================================================|
        //                                        Formules                                    |
        //==================================================================================|
         
        Formule formule01 = new Formule("con rồng vàng / le dragon d'or","entré, plat, déssert" , 25, null);
        Formule formule02 = new Formule("con mòng biển tự hào / le fière goéland","entré, plat", 19, null);
        Formule formule03 = new Formule("con ngựa có cánh / le cheval ailés ","plat, déssert", 20, null);
        
        //==================================================================================|
        //                                        TypePlats                                  |
        //==================================================================================|
        
        TypePlat typePlat01 = new TypePlat("entré");
        TypePlat typePlat02 = new TypePlat("déssert");
        TypePlat typePlat03 = new TypePlat("plat");
        TypePlat typePlat04 = new TypePlat("apéritifs");
        
        em.persist(typePlat01);
        em.persist(typePlat02);
        em.persist(typePlat03);
        em.persist(formule01);
        em.persist(formule02);
        em.persist(formule03);
        em.persist(statut1001);
        em.persist(statut1002);
        em.persist(statut1003);
        em.persist(statut1004);
        em.persist(statut1005);
        em.persist(statut1006);
        em.persist(statut1007);
        em.persist(statut2001);
        em.persist(statut2002);
        em.persist(statut2003);
        em.persist(statut2004);
        em.persist(statut3001);
        em.persist(statut3002);
        em.persist(statut4001);
        em.persist(statut4002);
        em.persist(statut5001);
        em.persist(statut5002);
        em.persist(statut6001);
        em.persist(statut6002);
        em.persist(statut6003);
        em.persist(statut6004);
        em.persist(tp01);
        em.persist(tp02);        
        em.persist(tp05);
        em.persist(tp06);
        em.persist(tp07);
        em.persist(tp07);
        
        
        em.persist(np1);
        em.persist(np2);
        em.persist(np3);
        em.persist(np4);
        em.persist(np5);
        em.persist(np6);
        em.persist(np7);
        em.persist(np8);
        em.persist(np9);
        em.persist(np10);
        em.persist(np11);
        
        
        em.flush();
    }

}
