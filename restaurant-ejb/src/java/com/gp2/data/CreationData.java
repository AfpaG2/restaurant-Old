package com.gp2.data;

import com.gp2.entites.Emplacement;
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
        Statut statut4002 = new Statut(4002, "ingredient", "indisponible");
        
        // formule 50 
        Statut statut5001 = new Statut(5001, "formule", "disponible");
        Statut statut5002 = new Statut(5002, "formule", "indisponible");
        
        //emplacement 60
        Statut statut6001 = new Statut(6001, "emplacement", "disponible");
        Statut statut6002 = new Statut(6002, "emplacement", "occupé");
        Statut statut6003 = new Statut(6003, "emplacement", "réservé");
        Statut statut6004 = new Statut(6004, "emplacement", "indisponible");
       

        Emplacement Empl01 = new Emplacement("10",2);
        Empl01.setStatut(statut6001);
        Emplacement Empl02 = new Emplacement("11",2);
        Empl02.setStatut(statut6001);
        Emplacement Empl03 = new Emplacement("12",2);
        Empl03.setStatut(statut6001);
        Emplacement Empl04 = new Emplacement("13",2);
        Empl04.setStatut(statut6001);
        Emplacement Empl05 = new Emplacement("14",2);
        Empl05.setStatut(statut6001);
        Emplacement Empl06 = new Emplacement("15",2);
        Empl06.setStatut(statut6001);
        Emplacement Empl07 = new Emplacement("16",6);
        Empl07.setStatut(statut6001);
        Emplacement Empl08 = new Emplacement("17",6);
        Empl08.setStatut(statut6001);
        Emplacement Empl09 = new Emplacement("18",6);
        Empl09.setStatut(statut6001);
        Emplacement Empl10 = new Emplacement("19",6);
        Empl10.setStatut(statut6001);
        Emplacement Empl11 = new Emplacement("20",6);
        Empl11.setStatut(statut6001);
        Emplacement Empl12 = new Emplacement("21",4);
        Empl12.setStatut(statut6001);
        Emplacement Empl13 = new Emplacement("22",4);
        Empl13.setStatut(statut6001);
        Emplacement Empl14 = new Emplacement("23",4);
        Empl14.setStatut(statut6001);
        Emplacement Empl15 = new Emplacement("24",4);
        Empl15.setStatut(statut6001);
        Emplacement Empl16 = new Emplacement("25",4);
        Empl16.setStatut(statut6001);
        Emplacement Empl17 = new Emplacement("26",4);
        Empl17.setStatut(statut6001);
        Emplacement Empl18 = new Emplacement("27",4);
        Empl18.setStatut(statut6001);        
        Emplacement Empl19 = new Emplacement("28",4);
        Empl19.setStatut(statut6001);
        Emplacement Empl20 = new Emplacement("29",4);
        Empl20.setStatut(statut6001);
        Emplacement Empl21 = new Emplacement("30",8);
        Empl21.setStatut(statut6001);
        Emplacement Empl22 = new Emplacement("31",8);
        Empl22.setStatut(statut6001);
        Emplacement Empl23 = new Emplacement("32",8);
        Empl23.setStatut(statut6001);
        Emplacement Empl24 = new Emplacement("33",10);
        Empl24.setStatut(statut6001);
        Emplacement Empl25 = new Emplacement("34",10);
        Empl25.setStatut(statut6001);
        Emplacement Empl26 = new Emplacement("35",10);
        Empl26.setStatut(statut6001);
        Emplacement Empl27 = new Emplacement("36",10);
        Empl27.setStatut(statut6001);
        Emplacement Empl28 = new Emplacement("37",10);
        Empl28.setStatut(statut6001);
        
        
        
        
       
        Ingredient ing01 = new Ingredient("Boeuf");
        ing01.setStatut(statut4001);
        Ingredient ing02 = new Ingredient("Nouilles de riz");
        ing02.setStatut(statut4001);
        Ingredient ing03 = new Ingredient("Basilic");
        ing03.setStatut(statut4001);
        Ingredient ing04 = new Ingredient("Coriandre");
        ing04.setStatut(statut4001);
        Ingredient ing05 = new Ingredient("Menthe");
        ing05.setStatut(statut4001);
        Ingredient ing06 = new Ingredient("Ciboule ");
        ing06.setStatut(statut4001);
        Ingredient ing07 = new Ingredient("Citron vert");
        ing07.setStatut(statut4001);
        Ingredient ing08 = new Ingredient("Glaçons");
        ing08.setStatut(statut4001);
        Ingredient ing09 = new Ingredient("Rhum blanc");
        ing09.setStatut(statut4001);
        Ingredient ing10 = new Ingredient("Sirop de sucre de canne");
        ing10.setStatut(statut4001);
        Ingredient ing11 = new Ingredient("Eau gazeuse");
        ing11.setStatut(statut4001);
        Ingredient ing12 = new Ingredient("Liqueur d'oranges"); 
        ing12.setStatut(statut4001);
        Ingredient ing13 = new Ingredient("Jus de canneberge");
        ing13.setStatut(statut4001);
        Ingredient ing14 = new Ingredient("Vodka");
        ing14.setStatut(statut4001);
        Ingredient ing15 = new Ingredient("Martini"); 
        ing15.setStatut(statut4001);
        Ingredient ing16 = new Ingredient("Jus de litchi");
        ing16.setStatut(statut4001);
        Ingredient ing17 = new Ingredient("Litchi");  
        ing17.setStatut(statut4001);
        Ingredient ingd01 = new Ingredient("Cassis");
        ingd01.setStatut(statut4001);
        Ingredient ingd02 = new Ingredient("pêche");   
        ingd02.setStatut(statut4001);
        Ingredient ingd03 = new Ingredient("Liqueur de pamplemousse");
        ingd03.setStatut(statut4001);
        Ingredient ingd04 = new Ingredient("Rosé"); 
        ingd04.setStatut(statut4001);
        
        Ingredient ing001 = new Ingredient("Echine de porc");
        ing001.setStatut(statut4001);
        Ingredient ing002 = new Ingredient("Ails");
        ing002.setStatut(statut4001);
        Ingredient ing003 = new Ingredient("Sauce d'huître");
        ing003.setStatut(statut4001);
        Ingredient ing004 = new Ingredient("Concombre");
        ing004.setStatut(statut4001);
        Ingredient ing005 = new Ingredient("Carottes");
        ing005.setStatut(statut4001);
        Ingredient ing006 = new Ingredient("Vinaigre d'alcool blanc au citron");
        ing006.setStatut(statut4001);
        Ingredient ing007 = new Ingredient("Vermicelles de soja");
        ing007.setStatut(statut4001);
        Ingredient ing008 = new Ingredient("Steak");
        ing008.setStatut(statut4001);
        Ingredient ing009 = new Ingredient("Carottes râpées");
        ing009.setStatut(statut4001);
        Ingredient ing010 = new Ingredient("Soja frais");
        ing010.setStatut(statut4001);
        Ingredient ing011 = new Ingredient("Salades sucrines");
        ing011.setStatut(statut4001);
        Ingredient ing012 = new Ingredient("Cacahuètes");
        ing012.setStatut(statut4001);
        Ingredient ing013 = new Ingredient("Echalote"); 
        ing013.setStatut(statut4001);
        Ingredient ing014 = new Ingredient("Citrons");   
        ing014.setStatut(statut4001);
        Ingredient ing017 = new Ingredient("Sauce Nuoc Mam");
        ing017.setStatut(statut4001);
        Ingredient ing018 = new Ingredient("Tabasco");
        ing018.setStatut(statut4001);
        Ingredient ing019 = new Ingredient("Blancs de poulet");
        ing019.setStatut(statut4001);
        Ingredient ing020 = new Ingredient("Tomates");
        ing020.setStatut(statut4001);
        Ingredient ing021 = new Ingredient("Oignon rouge"); 
        ing021.setStatut(statut4001);
        Ingredient ing022 = new Ingredient("Curry");
        ing022.setStatut(statut4001);
        Ingredient ing023 = new Ingredient("Gingembre");
        ing023.setStatut(statut4001);
        Ingredient ing025 = new Ingredient("Huile d'olive");
        ing025.setStatut(statut4001);
        Ingredient ing026 = new Ingredient("Poivre");
        ing026.setStatut(statut4001);
        Ingredient ing027 = new Ingredient("Sel");
        ing027.setStatut(statut4001);
        Ingredient ing028 = new Ingredient("Calamars en anneaux");  
        ing028.setStatut(statut4001);
        Ingredient ing029 = new Ingredient("Morceau de gingembre");
        ing029.setStatut(statut4001);
        Ingredient ing030 = new Ingredient("Poivron jaune");
        ing030.setStatut(statut4001);
        Ingredient ing031 = new Ingredient("Poivron vert");
        ing031.setStatut(statut4001);
        Ingredient ing032 = new Ingredient("Oignon");
        ing032.setStatut(statut4001);
        Ingredient ing033 = new Ingredient("Huile d'olive");
        ing033.setStatut(statut4001);
        Ingredient ing034 = new Ingredient("Piment");
        ing034.setStatut(statut4001);
        Ingredient ing036 = new Ingredient("Crevette");
        ing036.setStatut(statut4001);
        Ingredient ing037 = new Ingredient("Cacine de lotus");
        ing037.setStatut(statut4001);
        Ingredient ing039 = new Ingredient("Poivron rouge");  
        ing039.setStatut(statut4001);
        Ingredient ing040 = new Ingredient("vinaigre blanc de riz");
        ing040.setStatut(statut4001);
        Ingredient ing041 = new Ingredient("sucre"); 
        ing041.setStatut(statut4001);
        
        // Ingredients rajoutés par Ibrahim
        Ingredient ing150 = new Ingredient("Pates de riz");    
        ing150.setStatut(statut4001);
        Ingredient ing151 = new Ingredient("Filet de Boeuf");
        ing151.setStatut(statut4001);
        Ingredient ing152 = new Ingredient("Pousse de Haricot Mungo");
        ing152.setStatut(statut4001);
        Ingredient ing153 = new Ingredient("Ciboulettes");
        ing153.setStatut(statut4001);
        Ingredient ing154 = new Ingredient("Sauce de Soja");
        ing154.setStatut(statut4001);
        Ingredient ing155 = new Ingredient("Huile");
        ing155.setStatut(statut4001);
        Ingredient ing156 = new Ingredient("Sésame");
        ing156.setStatut(statut4001);

        Ingredient ing157 = new Ingredient("Oeufs");
        ing157.setStatut(statut4001);
        Ingredient ing158 = new Ingredient("Huile Tournesol");
        ing158.setStatut(statut4001);
        Ingredient ing159 = new Ingredient("Sauce Maggi");
        ing159.setStatut(statut4001);
        Ingredient ing160 = new Ingredient("Jambon en dés");
        ing160.setStatut(statut4001);
        Ingredient ing161 = new Ingredient("Petits Pois");
        ing161.setStatut(statut4001);
        Ingredient ing162 = new Ingredient("Gros Oignon");
        ing162.setStatut(statut4001);
        Ingredient ing163 = new Ingredient("riz");
        ing163.setStatut(statut4001);

        Ingredient ing164 = new Ingredient("Poivre Noir");
        ing164.setStatut(statut4001);
        Ingredient ing165 = new Ingredient("Batavia");
        ing165.setStatut(statut4001);
        Ingredient ing166 = new Ingredient("Tige Menthe");
        ing166.setStatut(statut4001);
        Ingredient ing167 = new Ingredient("Petits Nems");
        ing167.setStatut(statut4001);
        Ingredient ing168 = new Ingredient("Boeuf Tendre");
        ing168.setStatut(statut4001);
        Ingredient ing169 = new Ingredient("Tige de Coriandre");
        ing169.setStatut(statut4001);
        Ingredient ing170 = new Ingredient("Vermicelles de riz");
        ing170.setStatut(statut4001);

        Ingredient ing171 = new Ingredient("Caramel Maison");
        ing171.setStatut(statut4001);
        Ingredient ing172 = new Ingredient("Poitrine de Porc");
        ing172.setStatut(statut4001);
        Ingredient ing173 = new Ingredient("Champignons noirs réhydratés");
        ing173.setStatut(statut4001);
        Ingredient ing174 = new Ingredient("Courgette");
        ing174.setStatut(statut4001);
        Ingredient ing175 = new Ingredient("Vermicelles chinois");
        ing175.setStatut(statut4001);
        Ingredient ing176 = new Ingredient("Feuilles de riz");
        ing176.setStatut(statut4001);
        Ingredient ing177 = new Ingredient("Huile d'arachide");
        ing177.setStatut(statut4001);
        Ingredient ing178 = new Ingredient("Poivron Vert");
        ing178.setStatut(statut4001);
        Ingredient ing179 = new Ingredient("RumSteack ou Noix de Basse Côte");
        ing179.setStatut(statut4001);

        Ingredient ing180 = new Ingredient("Haut de cuisse (paquet de trois)");
        ing180.setStatut(statut4001);
        Ingredient ing181 = new Ingredient("Echalotes coupées finement");
        ing181.setStatut(statut4001);
        Ingredient ing182 = new Ingredient("Boite de pâte Wong ton");
        ing182.setStatut(statut4001);
        Ingredient ing183 = new Ingredient("Porc haché maigre cru");
        ing183.setStatut(statut4001);
        Ingredient ing184 = new Ingredient("Bouillon de poulet fait maison");
        ing184.setStatut(statut4001);

        Ingredient ing185 = new Ingredient("Oignon Blanc");
        ing185.setStatut(statut4001);
        Ingredient ing186 = new Ingredient("Purée de Tamarin");
        ing186.setStatut(statut4001);
        Ingredient ing187 = new Ingredient("Cacahuètes concassées");
        ing187.setStatut(statut4001);
        Ingredient ing188 = new Ingredient("Nouilles de Riz");
        ing188.setStatut(statut4001);
        Ingredient ing189 = new Ingredient("Filet de Poulet");
        ing189.setStatut(statut4001);
        Ingredient ing190 = new Ingredient("Pousse d'épinards fraiches");
        ing190.setStatut(statut4001);
        Ingredient ing191 = new Ingredient("Gingembre en poudre");
        ing191.setStatut(statut4001);
        Ingredient ing192 = new Ingredient("Curcumin");
        ing192.setStatut(statut4001);
        Ingredient ing193 = new Ingredient("Ail écrasé");
        ing193.setStatut(statut4001);
        
        Ingredient ing194 = new Ingredient("Nouilles aux oeufs Suzi Wan");
        ing194.setStatut(statut4001);
        Ingredient ing195 = new Ingredient("blanc de poulet");
        ing195.setStatut(statut4001);
        Ingredient ing196 = new Ingredient("Vinaigre Balsamique");
        ing196.setStatut(statut4001);
        Ingredient ing197 = new Ingredient("Légumes shop suey");
        ing197.setStatut(statut4001);
        Ingredient ing198 = new Ingredient("Germes de soja ");
        ing198.setStatut(statut4001);
        Ingredient ing199 = new Ingredient("Huile végétale");
        ing199.setStatut(statut4001);
        
        // Ingrédients utilisés en déssert (Ibrahim)
        Ingredient ing200 = new Ingredient("Banane");
        ing200.setStatut(statut4001);
        Ingredient ing201 = new Ingredient("Sucre vanillé");
        ing201.setStatut(statut4001);
        Ingredient ing202 = new Ingredient("Lait");
        ing202.setStatut(statut4001);
        Ingredient ing203 = new Ingredient("Lait de Coco"); 
        ing203.setStatut(statut4001);
        Ingredient ing204 = new Ingredient("Perles de Tapioca"); 
        ing204.setStatut(statut4001);
        
        Ingredient ing205 = new Ingredient("Farine");   
        ing205.setStatut(statut4001);
        Ingredient ing206 = new Ingredient("Eau");   
        ing206.setStatut(statut4001);
        Ingredient ing207 = new Ingredient("Beurre");   
        ing207.setStatut(statut4001);
        Ingredient ing208 = new Ingredient("Nutella");
        ing208.setStatut(statut4001);
        Ingredient ing209 = new Ingredient("Jaune d'oeuf");
        ing209.setStatut(statut4001);

        Ingredient ing210 = new Ingredient("Jus de citron");   
        ing210.setStatut(statut4001);
        Ingredient ing211 = new Ingredient("Gousse de vanille");   
        ing211.setStatut(statut4001);
        Ingredient ing212 = new Ingredient("Litchi au sirop");
        ing212.setStatut(statut4001);

        Ingredient ing213 = new Ingredient("Chocolat noir spécial");
        ing213.setStatut(statut4001);
        Ingredient ing214 = new Ingredient("Fécule de maïs");   
        ing214.setStatut(statut4001);
        Ingredient ing215 = new Ingredient("Noix de Coco râpée");
        ing215.setStatut(statut4001);
           
        Ingredient ing216 = new Ingredient("Glace vanille");   
        ing216.setStatut(statut4001);
        Ingredient ing217 = new Ingredient("Glace au chocolat");
        ing217.setStatut(statut4001);
           
        Ingredient ing218 = new Ingredient("Ananas");  
        ing218.setStatut(statut4001);
        Ingredient ing219 = new Ingredient("Orange"); 
        ing219.setStatut(statut4001);
        Ingredient ing220 = new Ingredient("Papaye");   
        ing220.setStatut(statut4001);
        Ingredient ing221 = new Ingredient("Kiwi");   
        ing221.setStatut(statut4001);
        Ingredient ing222 = new Ingredient("Mangue");   
        ing222.setStatut(statut4001);
        Ingredient ing223 = new Ingredient("Baton de Cannelle");   
        ing223.setStatut(statut4001);
        Ingredient ing224 = new Ingredient("Poivre de Sichuan");
        ing224.setStatut(statut4001);
           
        Ingredient ing225 = new Ingredient("Biscuit au chocolat");   
        ing225.setStatut(statut4001);
        Ingredient ing226 = new Ingredient("avocat");   
        ing226.setStatut(statut4001);
        Ingredient ing227 = new Ingredient("Chocolat au lait fondu");   
        ing227.setStatut(statut4001);
        Ingredient ing228 = new Ingredient("Lait concentré sucré");  
        ing228.setStatut(statut4001);
        Ingredient ing229 = new Ingredient("Rhum");   
        ing229.setStatut(statut4001);
        Ingredient ing230 = new Ingredient("Noix du brésil"); 
        ing230.setStatut(statut4001);

        Ingredient ing231 = new Ingredient("Haricots noirs secs"); 
        ing231.setStatut(statut4001);
        Ingredient ing232 = new Ingredient("Lotus au sirop");
        ing232.setStatut(statut4001);

        Ingredient ing233 = new Ingredient("Taro (Khoai Môn Cao)"); 
        ing233.setStatut(statut4001);
        Ingredient ing234 = new Ingredient("Riz gluant"); 
        ing234.setStatut(statut4001);
        Ingredient ing235 = new Ingredient("Feuilles de Pandanus fraiches"); 
        ing235.setStatut(statut4001);
        
        Ingredient ing236 = new Ingredient("Cornilles ou doliques à oeil noir (Haricot)"); 
        ing236.setStatut(statut4001);
        Ingredient ing237 = new Ingredient("Bicarbonate de Sodium"); 
        ing237.setStatut(statut4001);
        Ingredient ing238 = new Ingredient("Extrait de vanille");  
        ing238.setStatut(statut4001);
        Ingredient ing239 = new Ingredient("Amidon de Maïs");
        ing239.setStatut(statut4001);
                  
        
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

        NatureProduit salades = new NatureProduit("NOS SALADES");
        NatureProduit soupes = new NatureProduit("NOS SOUPES");
        NatureProduit pates = new NatureProduit("NOS PÂTES SAUTÉES");
        NatureProduit viandes = new NatureProduit("NOS VIANDES");
        NatureProduit volailles = new NatureProduit("NOS VOLAILLES");
        NatureProduit poissons = new NatureProduit("NOS POISSONS");
        NatureProduit legumes = new NatureProduit("NOS LEGUMES");
        NatureProduit fruits = new NatureProduit("NOS FRUITS");
        NatureProduit fromages = new NatureProduit("NOS FROMAGES");
        NatureProduit boissons = new NatureProduit("NOS BOISSONS");
        NatureProduit aperitifs = new NatureProduit("NOS APERITIFS");
        NatureProduit fruitMer = new NatureProduit("NOS FRUIT DE MER");
        NatureProduit riz = new NatureProduit("NOS RIZ");

        //==================================================================================|
        //                                  Type de plats                                   |
        //==================================================================================|
        //                              COCKTAILS                                           |
        //==================================================================================| 

        TypePlat tp01 = new TypePlat("COCKTAILS");
        Produit  produit01 = new Produit("Mojito", 8.5f, "mojito.jpeg");
        produit01.getIngredients().add(ing05);
        produit01.getIngredients().add(ing07);
        produit01.getIngredients().add(ing08);
        produit01.getIngredients().add(ing09);
        produit01.getIngredients().add(ing10);
        produit01.getIngredients().add(ing11); 
        produit01.setStatut(statut3001);
        tp01.getProduits().add(produit01);
        
        
        Produit  produit02 = new Produit("Daiquiri", 8.5f, "daiquiri.png");
        produit02.getIngredients().add(ing09);
        produit02.getIngredients().add(ing07);
        produit02.getIngredients().add(ing10);
        produit02.getIngredients().add(ing08);   
        produit02.setStatut(statut3001);
        tp01.getProduits().add(produit02);
        
        
        Produit  produit03 = new Produit("Cosmopolitan",8.5f, "Cosmopolitan.jpg");
        produit03.getIngredients().add(ing07);           
        produit03.getIngredients().add(ing12);             
        produit03.getIngredients().add(ing13);              
        produit03.getIngredients().add(ing14);
        produit03.setStatut(statut3001);
        tp01.getProduits().add(produit03);
        
        
        Produit  produit04 = new Produit("Lychee martini",8.5f,"Lychee-martini.png");        
        produit04.getIngredients().add(ing07);
        produit04.getIngredients().add(ing15);
        produit04.getIngredients().add(ing16);
        produit04.getIngredients().add(ing17);
        produit04.setStatut(statut3001);
        tp01.getProduits().add(produit04);
        
        
        
         Produit  produit06 = new Produit("Ginger julep",8.5f,"Ginger-julep.jpg");
        produit06.setStatut(statut3001);
        tp01.getProduits().add(produit06);
        
        
        Produit  produit08 = new Produit("Virgin ginger mojitoi",6.5f,"Virgin-ginger-mojitoi.jpg");
        produit08.getInfosProduits().add(infosPr07);
        produit08.setStatut(statut3001);
        tp01.getProduits().add(produit08);
        
        Produit  produit09 = new Produit("Kir aligotÃ©",14.5f,"Kir-aligote.jpg");
        produit09.getInfosProduits().add(infosPr01);
        produit09.getIngredients().add(ingd02);
        produit09.getIngredients().add(ingd01);
        produit09.setStatut(statut3001);       
        tp01.getProduits().add(produit09);
        
        Produit  produit10 = new Produit("Kir aligote",4f,"Kir-aligote.jpg");
        produit10.getInfosProduits().add(infosPr02);
        produit10.getIngredients().add(ingd02);
        produit10.getIngredients().add(ingd01);
        produit10.setStatut(statut3001);
        tp01.getProduits().add(produit10);
        
        Produit  produit11 = new Produit("Kir royal",36.9f,"kir-royal.png");
        produit11.getInfosProduits().add(infosPr03);
        produit11.getIngredients().add(ingd02);
        produit11.getIngredients().add(ingd01);
        produit11.setStatut(statut3001);
        tp01.getProduits().add(produit11);
        
        Produit  produit12 = new Produit("Kir royal",9.5f,"kir-royal.png");
        produit12.getInfosProduits().add(infosPr04);
        produit12.getIngredients().add(ingd02);
        produit12.getIngredients().add(ingd01);
        produit12.setStatut(statut3001);
        tp01.getProduits().add(produit12);
        
        Produit  produit13 = new Produit("RosÃ© pamplemousse",14f,"Rose-pamplemousse.jpg");
        produit13.getInfosProduits().add(infosPr05);
        produit13.getIngredients().add(ingd03);
        produit13.getIngredients().add(ingd04);
        produit13.setStatut(statut3001);
        tp01.getProduits().add(produit13);
        
        Produit  produit14 = new Produit("RosÃ© pamplemousse 12",3.9f,"Rose-pamplemousse.jpg");
        produit14.getInfosProduits().add(infosPr06);
        produit14.getIngredients().add(ingd03);
        produit14.getIngredients().add(ingd04);
        produit14.setStatut(statut3001);
        tp01.getProduits().add(produit14);

        //==================================================================================|
        //                                        ENTREES                                   |
        //==================================================================================|
        TypePlat tp02 = new TypePlat("ENTREES");        
        // soupes
        Produit  prdu1 = new Produit("PhÃ´ au boeuf",12.5f,"Pho-au-boeuf.jpg");
        soupes.getProduits().add(prdu1);        
        prdu1.setStatut(statut3001);
        tp02.getProduits().add(prdu1);
        
        
        Produit  prdu2 = new Produit("PhÃ´ au boeuf et boulettes",13.5f,"Pho-au-boeuf-et-boulettes.jpg");
        soupes.getProduits().add(prdu2);
        prdu2.getIngredients().add(ing01);
        prdu2.getIngredients().add(ing02);
        prdu2.getIngredients().add(ing03);
        prdu2.getIngredients().add(ing04);
        prdu2.getIngredients().add(ing05);
        prdu2.getIngredients().add(ing06);
        prdu2.setStatut(statut3001);
        tp02.getProduits().add(prdu2);
        
        
        
        Produit  prdu3 = new Produit("PhÃ´ aux lÃ©gumes",12.5f,"Pho-aux-legumes.jpg");
        soupes.getProduits().add(prdu3);
        prdu3.setStatut(statut3001);
        tp02.getProduits().add(prdu3);
        
        
        Produit  prdu4 = new Produit("Mi xa xiu, porc laquÃ©",13.1f,"mi-xa-xiu-porc-laque.jpg");       
        soupes.getProduits().add(prdu4);
        prdu4.getIngredients().add(ing001);
        prdu4.getIngredients().add(ing002);
        prdu4.getIngredients().add(ing003);
        prdu4.getIngredients().add(ing004);
        prdu4.getIngredients().add(ing005);
        prdu4.getIngredients().add(ing006);
        prdu4.setStatut(statut3001);
        tp02.getProduits().add(prdu4);
        
       
      // salades        
      Produit  prdu5 = new Produit("Salade de boeuf Ã  la vietnamienne",11.4f,"salade-de-boeuf-a-la-vietnamienne.jpg");
      salades.getProduits().add(prdu5);
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
      prdu5.setStatut(statut3001);
      tp02.getProduits().add(prdu5);
     
      Produit  prdu6 = new Produit("Salade de poulet mariné au gingembre",10.8f,"salade-de-poulet-marine-au-gingembre.jpg");
      salades.getProduits().add(prdu6);
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
      prdu6.setStatut(statut3001);
      tp02.getProduits().add(prdu6);
      
      
      Produit  prdu7 = new Produit("Salade de calamars sautées au piment et gingembre",11.9f,"salade-de-calamars-sautes-au-piment-et-gingembre.jpg");
      salades.getProduits().add(prdu7);
      prdu7.getIngredients().add(ing020);
      prdu7.getIngredients().add(ing028);
      prdu7.getIngredients().add(ing002);
      prdu7.getIngredients().add(ing029);
      prdu7.getIngredients().add(ing030);
      prdu7.getIngredients().add(ing031);
      prdu7.getIngredients().add(ing032);
      prdu7.getIngredients().add(ing033);
      prdu7.getIngredients().add(ing034);
      prdu7.setStatut(statut3001);
      tp02.getProduits().add(prdu7);
      
      
      Produit  prdu8 = new Produit("Salade de lotus aux crevettes sel et poivre",12.7f,"salade-de-lotus-aux-crevettes-sel-et-poivre.jpg");
      salades.getProduits().add(prdu8);
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
      prdu8.setStatut(statut3001);
      tp02.getProduits().add(prdu8);  
      
      
      
        //==================================================================================|
        //                                        PLATS                                     |
        //==================================================================================|
        TypePlat tp05 = new TypePlat("PLATS");
        
         Produit produ1 = new Produit("Pates blanches de riz sautees au poulet marine au gingembre et crevettes", 16.2f, "pates-blanches-de-riz-sautees-au-poulet-marine-au-gingembre-et-crevettes.jpg");
        Produit produ2 = new Produit("Pates blanches de riz sautees au poulet marine au gingembre", 13.9f,"pates-blanches-de-riz-sautees-au-poulet-marine-au-gingembre.jpg");
        Produit produ3 = new Produit("Pates blanches de riz sautees aux crevettes", 14.9f,"pates-blanches-de-riz-sautees-aux-crevettes.jpg");
        Produit produ4 = new Produit("Pates blanches de riz sautees aux legumes", 12.3f,"pates-blanches-de-riz-sautees-aux-legumes.jpg");
        
        fruitMer.getProduits().add(produ3);
        pates.getProduits().add(produ1);
        pates.getProduits().add(produ2);
        pates.getProduits().add(produ3);
        pates.getProduits().add(produ4);        
        volailles.getProduits().add(produ1);
        volailles.getProduits().add(produ2);
        legumes.getProduits().add(produ4);
        
        Produit produ5 = new Produit("Riz Cantonnais", 11.90f,"riz-cantonnais.jpg");
        riz.getProduits().add(produ5);
        
        Produit produ6 = new Produit("Bo Bun Boeuf", 13.90f,"bo-bun-boeuf.jpg"); 
        viandes.getProduits().add(produ6);
        Produit produ7 = new Produit("Tit Kho, Porc au Caramel Vietnamien", 15.00f,"tit-kho-porc-au-caramel-vietnamien.jpg");
        viandes.getProduits().add(produ7);
        Produit produ9 = new Produit("Boeuf aux oignons vietnamien", 14.50f,"boeuf-aux-oignons-vietnamien.jpg");
        viandes.getProduits().add(produ9);
        
        Produit produ8 = new Produit("Nems de Courgette Maison", 9.80f,"nems-de-courgette-maison.jpg");
        legumes.getProduits().add(produ8);
        
        Produit produ10 = new Produit("Soupe Won Ton", 9.80f,"soupe-won-ton.jpg");
        soupes.getProduits().add(produ10);

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

        produ1.setStatut(statut3001);
        tp05.getProduits().add(produ1);
        
        // Creation du plat 2
        produ2.getIngredients().add(ing188);
        produ2.getIngredients().add(ing189);
        produ2.getIngredients().add(ing190);
        produ2.getIngredients().add(ing173);
        produ2.getIngredients().add(ing154);
        produ2.getIngredients().add(ing025);
        produ2.getIngredients().add(ing027);
        produ2.getIngredients().add(ing07);
        produ2.getIngredients().add(ing155);
        produ2.getIngredients().add(ing191);
        produ2.getIngredients().add(ing192);
        produ2.getIngredients().add(ing022);
        produ2.getIngredients().add(ing023);
        produ2.getIngredients().add(ing193);
        
        produ2.setStatut(statut3001);
        tp05.getProduits().add(produ2);
        
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
        
        produ3.setStatut(statut3001);
        tp05.getProduits().add(produ3);
        
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
        
        produ4.setStatut(statut3001);
        tp05.getProduits().add(produ4);
        
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
        
        produ5.setStatut(statut3001);
        tp05.getProduits().add(produ5);
        
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
        
        produ6.setStatut(statut3001);
        tp05.getProduits().add(produ6);
        
        // Creation du plat 7.
        produ7.getIngredients().add(ing017);
        produ7.getIngredients().add(ing027);
        produ7.getIngredients().add(ing026);
        produ7.getIngredients().add(ing171);
        produ7.getIngredients().add(ing002);
        produ7.getIngredients().add(ing162);
        produ7.getIngredients().add(ing172);
        
        produ7.setStatut(statut3001);
        tp05.getProduits().add(produ7);
        
        // Creation du plat 8.
        produ8.getIngredients().add(ing005);
        produ8.getIngredients().add(ing162);
        produ8.getIngredients().add(ing173);
        produ8.getIngredients().add(ing022);
        produ8.getIngredients().add(ing174);
        produ8.getIngredients().add(ing175);
        produ8.getIngredients().add(ing176);
        
        produ8.setStatut(statut3001);
        tp05.getProduits().add(produ8);
        
        // Creation du plat 9.
        produ9.getIngredients().add(ing017);
        produ9.getIngredients().add(ing177);
        produ9.getIngredients().add(ing178);
        produ9.getIngredients().add(ing032);
        produ9.getIngredients().add(ing179);

        produ9.setStatut(statut3001);
        tp05.getProduits().add(produ9);
        
        // Creation du plat 10.
        produ10.getIngredients().add(ing154);
        produ10.getIngredients().add(ing157);
        produ10.getIngredients().add(ing180);
        produ10.getIngredients().add(ing181);
        produ10.getIngredients().add(ing182);
        produ10.getIngredients().add(ing183);
        produ10.getIngredients().add(ing184);

        produ10.setStatut(statut3001);
        tp05.getProduits().add(produ10);
        
        //==================================================================================|
        //                                        DESSERTS                                  |
        //==================================================================================|
        TypePlat tp06 = new TypePlat("DESSERTS");
        
        Produit produi1 = new Produit("Soupe de perles de tapioca au coco et à la banane", 5f,"soupe-de-perles-de-tapioca-au-coco-et-a-la-banane.jpg");
        Produit produi2 = new Produit("Raviolis au nutella", 6.1f,"raviolis-au-nutella.jpg");
        Produit produi3 = new Produit("Flan au caramel et litchi", 5f,"flan-au-caramel-et-litchi.jpg");
        Produit produi4 = new Produit("Fondant au chocolat et glace coco", 6.7f,"fondant-au-chocolat-et-glace-coco.jpg");
        Produit produi5 = new Produit("Coupe coco, vanille, chocolat et sauce chocolat", 7f,"coupe-coco-vanille-chocolat-et-sauce-chocolat.jpg");
        Produit produi6 = new Produit("Salade de fruits frais exotiques", 6.1f,"salade-de-fruits-frais-exotiques.jpg");
        Produit produi7 = new Produit("Crème d'avocat doucement sucrée", 7f,"creme-d-avocat-doucement-sucree.jpg");
        Produit produi8 = new Produit("Soupe sucrée de haricots noirs aux graines de lotus", 5.9f);
        Produit produi9 = new Produit("Porridge sucré de riz gluant au taro et lait de coco (Chè Khoai môn)", 4.9f);
        Produit produi10 = new Produit("Entremets aux Cornilles et riz gluant (Chè dâu trang)", 6.5f);
        
        
        //==================================================================================|
        //                   CREATION D'INGREDIENTS COMPOSANT LES DESSERTS                  |
        //==================================================================================|
        
        // Creation du déssert 1 : "Soupe de Perles de Tapioca au coco et à la banane"
        produi1.getIngredients().add(ing200);
        produi1.getIngredients().add(ing201);
        produi1.getIngredients().add(ing202);
        produi1.getIngredients().add(ing203);
        produi1.getIngredients().add(ing204);
        produi1.getIngredients().add(ing041);
        
        produi1.setStatut(statut3001);
        tp06.getProduits().add(produi1);
        
        // Creation du déssert 2 : "Raviolis au nutella"
        produi2.getIngredients().add(ing200);
        produi2.getIngredients().add(ing205);
        produi2.getIngredients().add(ing206);
        produi2.getIngredients().add(ing207);
        produi2.getIngredients().add(ing208);
        produi2.getIngredients().add(ing209);
        
        produi2.setStatut(statut3001);
        tp06.getProduits().add(produi2);
        
        // Creation du déssert 3 : "Flan au caramel et litchi"
        produi3.getIngredients().add(ing041);
        produi3.getIngredients().add(ing206);
        produi3.getIngredients().add(ing210);
        produi3.getIngredients().add(ing202);
        produi3.getIngredients().add(ing157);
        produi3.getIngredients().add(ing211);
        produi3.getIngredients().add(ing212);
        
        produi3.setStatut(statut3001);
        tp06.getProduits().add(produi3);
        
        // Creation du déssert 4 : "Fondant au chocolat et glace coco"
        produi4.getIngredients().add(ing207);
        produi4.getIngredients().add(ing157);
        produi4.getIngredients().add(ing041);
        produi4.getIngredients().add(ing213);
        produi4.getIngredients().add(ing214);
        produi4.getIngredients().add(ing215);
        produi4.getIngredients().add(ing027);
        
        produi4.setStatut(statut3001);
        tp06.getProduits().add(produi4);
        
        // Creation du déssert 5 : "Coupe coco, vanille, chocolat et banane"
        produi5.getIngredients().add(ing211);
        produi5.getIngredients().add(ing216);
        produi5.getIngredients().add(ing217);
        produi5.getIngredients().add(ing215);
        produi5.getIngredients().add(ing200);
        produi5.getIngredients().add(ing202);
        produi5.getIngredients().add(ing157);
        
        produi5.setStatut(statut3001);
        tp06.getProduits().add(produi5);
        
        // Creation du déssert 6 : "Salade de fruits frais exotiques"
        produi6.getIngredients().add(ing218);
        produi6.getIngredients().add(ing219);
        produi6.getIngredients().add(ing220);
        produi6.getIngredients().add(ing221);
        produi6.getIngredients().add(ing222);
        produi6.getIngredients().add(ing223);
        produi6.getIngredients().add(ing224);
        produi6.getIngredients().add(ing041);
        
        produi6.setStatut(statut3001);
        tp06.getProduits().add(produi6);
        
        // Creation du déssert 7 : "Mousse d'avocat doucement sucrée"
        produi7.getIngredients().add(ing225);
        produi7.getIngredients().add(ing226);
        produi7.getIngredients().add(ing227);
        produi7.getIngredients().add(ing228);
        produi7.getIngredients().add(ing041);
        produi7.getIngredients().add(ing014);
        produi7.getIngredients().add(ing229);
        produi7.getIngredients().add(ing230);
        
        produi7.setStatut(statut3001);
        tp06.getProduits().add(produi7);
        
        // Creation du déssert 8 : "Soupe sucrée de haricots noirs aux graines de lotus"
        produi8.getIngredients().add(ing231);
        produi8.getIngredients().add(ing232);
        produi8.getIngredients().add(ing204);
        produi8.getIngredients().add(ing041);
        produi8.getIngredients().add(ing027);
        produi8.getIngredients().add(ing014);
        produi8.getIngredients().add(ing203);
        produi8.getIngredients().add(ing206);
        
        produi8.setStatut(statut3001);
        tp06.getProduits().add(produi8);
        
        // Creation du déssert 9 : "Porridge sucré de riz gluant au taro et lait de coco"
        produi9.getIngredients().add(ing233);
        produi9.getIngredients().add(ing234);
        produi9.getIngredients().add(ing235);
        produi9.getIngredients().add(ing041);
        produi9.getIngredients().add(ing203);
        produi9.getIngredients().add(ing204);
        produi9.getIngredients().add(ing027);
        produi9.getIngredients().add(ing206);
        
        produi9.setStatut(statut3001);
        tp06.getProduits().add(produi9);
        
        // Creation du déssert 10 : "Entremets aux Cornilles et riz gluant (Chè dâu trang)"
        produi10.getIngredients().add(ing236);
        produi10.getIngredients().add(ing234);
        produi10.getIngredients().add(ing235);
        produi10.getIngredients().add(ing041);
        produi10.getIngredients().add(ing237);
        produi10.getIngredients().add(ing238);
        produi10.getIngredients().add(ing239);
        produi10.getIngredients().add(ing203);
        produi10.getIngredients().add(ing027);
        
        produi10.setStatut(statut3001);
        tp06.getProduits().add(produi10);
        
        //==================================================================================|
        //                                        SAUCES                                    |
        //==================================================================================|
        TypePlat tp07 = new TypePlat("SAUCES");
        
        //==================================================================================|
        //                                        Formules                                    |
        //==================================================================================|
         
        Formule formule01 = new Formule("con rồng vàng / le dragon d'or","entré, plat, déssert" , 25, null);        
        TypePlat formule01Entree = new TypePlat("Entree dragon d'or");        
        formule01Entree.getProduits().add(prdu3);
        formule01Entree.getProduits().add(prdu4);
        formule01Entree.getProduits().add(prdu5);
        formule01.getTypePlats().add(formule01Entree);
        
        TypePlat formule01Plat = new TypePlat("Plat dragon d'or");        
        formule01Plat.getProduits().add(produ1);
        formule01Plat.getProduits().add(produ5);
        formule01Plat.getProduits().add(produ8);
        formule01.getTypePlats().add(formule01Plat);
        
        TypePlat formule01Dessert = new TypePlat("Dessert dragon d'or");        
        formule01Dessert.getProduits().add(produi4);
        formule01Dessert.getProduits().add(produi6);
        formule01Dessert.getProduits().add(produi10);
        formule01.getTypePlats().add(formule01Dessert);
        
        
        
        Formule formule02 = new Formule("con mòng bien tự hào / le fière goéland","entré, plat", 19, null);
        TypePlat formule02Entree = new TypePlat("Entree le fière goéland");        
        formule02Entree.getProduits().add(prdu1);
        formule02Entree.getProduits().add(prdu3); 
        formule02.getTypePlats().add(formule02Entree);
        
        TypePlat formule02Plat = new TypePlat("Plat le fière goéland");        
        formule02Plat.getProduits().add(produ4);
        formule02Plat.getProduits().add(produ6);
        formule02Plat.getProduits().add(produ8);
        formule02.getTypePlats().add(formule02Plat);
        
        Formule formule03 = new Formule("con ngựa có cánh / le cheval ailés ","plat, déssert", 20, null);        
        TypePlat formule03Plat = new TypePlat("Plat le fière goéland");        
        formule03Plat.getProduits().add(produ3);
        formule03Plat.getProduits().add(produ7);
        formule03Plat.getProduits().add(produ8);
        formule03.getTypePlats().add(formule03Plat);
        
        TypePlat formule03Dessert = new TypePlat("Dessert dragon d'or");         
        formule03Dessert.getProduits().add(produi4);
        formule03Dessert.getProduits().add(produi5);
        formule03Dessert.getProduits().add(produi8);
        formule03.getTypePlats().add(formule03Dessert);
        
        //==================================================================================|
        //                                        TypePlats                                  |
        //==================================================================================|
              
        
        
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
       
        
        em.persist(salades);
        em.persist(soupes);
        em.persist(pates);
        em.persist(viandes);
        em.persist(volailles);
        em.persist(poissons);
        em.persist(legumes);
        em.persist(fruits);
        em.persist(fromages);
        em.persist(boissons);
        em.persist(aperitifs);        
        em.persist(fruitMer);
        em.persist(riz);
        
        
        em.persist(Empl01);
        em.persist(Empl02);
        em.persist(Empl03);
        em.persist(Empl04);
        em.persist(Empl05);
        em.persist(Empl06);
        em.persist(Empl07);
        em.persist(Empl08);
        em.persist(Empl09);
        em.persist(Empl10);
        em.persist(Empl11);
        em.persist(Empl12);
        em.persist(Empl13);
        em.persist(Empl14);
        em.persist(Empl15);
        em.persist(Empl16);
        em.persist(Empl17);
        em.persist(Empl18);
        em.persist(Empl19);
        em.persist(Empl20);
        em.persist(Empl21);
        em.persist(Empl22);
        em.persist(Empl23);
        em.persist(Empl24);
        em.persist(Empl25);
        em.persist(Empl26);
        em.persist(Empl27);
        em.persist(Empl28);        
        
        em.persist(formule01);
        em.persist(formule02);
        em.persist(formule03);
        
        
        em.flush();
    
    }
    


}
