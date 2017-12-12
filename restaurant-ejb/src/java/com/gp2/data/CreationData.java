package com.gp2.data;

import com.gp2.entites.InfosProduit;
import com.gp2.entites.Ingredient;
import com.gp2.entites.NatureProduit;
import com.gp2.entites.Produit;
import com.gp2.entites.TypePlat;
import java.util.ArrayList;
import java.util.Collection;
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

        Produit produit01 = new Produit("Mojito", 8.5f);
        Ingredient ing05 = new Ingredient("Menthe");
        Ingredient ing07 = new Ingredient("Citron vert");
        Ingredient ing08 = new Ingredient("Glaçons");
        Ingredient ing09 = new Ingredient("Rhum blanc");
        Ingredient ing10 = new Ingredient("Sirop de sucre de canne");
        Ingredient ing11 = new Ingredient("Eau gazeuse");
        produit01.getIngredients().add(ing05);
        produit01.getIngredients().add(ing07);
        produit01.getIngredients().add(ing08);
        produit01.getIngredients().add(ing09);
        produit01.getIngredients().add(ing10);
        produit01.getIngredients().add(ing11);
        tp01.getProduits().add(produit01);

        Produit produit02 = new Produit("Daiquiri", 8.5f);
        produit02.getIngredients().add(ing09);
        produit02.getIngredients().add(ing07);
        produit02.getIngredients().add(ing10);
        produit02.getIngredients().add(ing08);
        tp01.getProduits().add(produit02);

        Produit produit03 = new Produit("Cosmopolitan", 8.5f);
        Ingredient ing12 = new Ingredient("Liqueur d'oranges");
        Ingredient ing13 = new Ingredient("Jus de canneberge");
        Ingredient ing14 = new Ingredient("Vodka");
        produit03.getIngredients().add(ing07);
        produit03.getIngredients().add(ing12);
        produit03.getIngredients().add(ing13);
        produit03.getIngredients().add(ing14);
        tp01.getProduits().add(produit03);

        Produit produit04 = new Produit("Lychee martini", 8.5f);
        produit04.getIngredients().add(ing07);
        Ingredient ing15 = new Ingredient("Martini");
        Ingredient ing16 = new Ingredient("Jus de litchi");
        Ingredient ing17 = new Ingredient("Litchi");
        produit04.getIngredients().add(ing15);
        produit04.getIngredients().add(ing16);
        produit04.getIngredients().add(ing17);
        tp01.getProduits().add(produit04);

        Produit produit06 = new Produit("Ginger julep", 8.5f);
        tp01.getProduits().add(produit06);

        Produit produit08 = new Produit("Virgin ginger mojitoi", 6.5f);
        InfosProduit infosPr07 = new InfosProduit("Alcool", "Sans alcool");
        produit08.getInfosProduits().add(infosPr07);
        tp01.getProduits().add(produit08);

        Produit produit09 = new Produit("Kir aligoté", 14.5f);
        InfosProduit infosPr01 = new InfosProduit("volume", "50", "cl");
        Ingredient ingd01 = new Ingredient("Cassis");
        Ingredient ingd02 = new Ingredient("pêche");
        produit09.getInfosProduits().add(infosPr01);
        produit09.getIngredients().add(ingd02);
        produit09.getIngredients().add(ingd01);
        tp01.getProduits().add(produit09);

        Produit produit10 = new Produit("Kir aligoté", 4f);
        InfosProduit infosPr02 = new InfosProduit("volume", "12.5", "cl");
        produit10.getInfosProduits().add(infosPr02);
        produit10.getIngredients().add(ingd02);
        produit10.getIngredients().add(ingd01);
        tp01.getProduits().add(produit10);

        Produit produit11 = new Produit("Kir royal", 36.9f);
        InfosProduit infosPr03 = new InfosProduit("volume", "50", "cl");
        produit11.getInfosProduits().add(infosPr03);
        produit11.getIngredients().add(ingd02);
        produit11.getIngredients().add(ingd01);
        tp01.getProduits().add(produit11);

        Produit produit12 = new Produit("Kir royal", 9.5f);
        InfosProduit infosPr04 = new InfosProduit("volume", "12.5", "cl");
        produit12.getInfosProduits().add(infosPr04);
        produit12.getIngredients().add(ingd02);
        produit12.getIngredients().add(ingd01);
        tp01.getProduits().add(produit12);

        Produit produit13 = new Produit("Rosé pamplemousse", 14f);
        InfosProduit infosPr05 = new InfosProduit("volume", "50", "cl");
        Ingredient ingd03 = new Ingredient("Liqueur de pamplemousse");
        Ingredient ingd04 = new Ingredient("Rosé");
        produit13.getInfosProduits().add(infosPr05);
        produit13.getIngredients().add(ingd03);
        produit13.getIngredients().add(ingd04);
        tp01.getProduits().add(produit13);

        Produit produit14 = new Produit("Rosé pamplemousse", 3.9f);
        InfosProduit infosPr06 = new InfosProduit("volume", "12.5", "cl");
        produit14.getInfosProduits().add(infosPr06);
        produit14.getIngredients().add(ingd03);
        produit14.getIngredients().add(ingd04);
        tp01.getProduits().add(produit14);

        //==================================================================================|
        //                                        ENTREES                                   |
        //==================================================================================|
        TypePlat tp02 = new TypePlat("ENTREES");
        // soupes
        Produit prdu1 = new Produit("Phô au boeuf", 12.5f);
        prdu1.getNaturePorduits().add(np4);
        tp02.getProduits().add(prdu1);

        Produit prdu2 = new Produit("Phô au boeuf et boulettes", 13.5f);
        Ingredient ing01 = new Ingredient("Boeuf");
        Ingredient ing02 = new Ingredient("Nouilles de riz");
        Ingredient ing03 = new Ingredient("Basilic");
        Ingredient ing04 = new Ingredient("Coriandre");
        Ingredient ing06 = new Ingredient("Ciboule ");
        prdu2.getIngredients().add(ing01);
        prdu2.getIngredients().add(ing02);
        prdu2.getIngredients().add(ing03);
        prdu2.getIngredients().add(ing04);
        prdu2.getIngredients().add(ing05);
        prdu2.getIngredients().add(ing06);
        tp02.getProduits().add(prdu2);

        Produit prdu3 = new Produit("Phô aux légumes", 12.5f);
        tp02.getProduits().add(prdu3);

        Produit prdu4 = new Produit("Mi xa xiu, porc laqué", 13.1f);
        Ingredient ing001 = new Ingredient("Echine de porc");
        Ingredient ing002 = new Ingredient("Ails");
        Ingredient ing003 = new Ingredient("Sauce d'huître");
        Ingredient ing004 = new Ingredient("Concombre");
        Ingredient ing005 = new Ingredient("Carottes");
        Ingredient ing006 = new Ingredient("Vinaigre d'alcool blanc au citron");
        prdu4.getIngredients().add(ing001);
        prdu4.getIngredients().add(ing002);
        prdu4.getIngredients().add(ing003);
        prdu4.getIngredients().add(ing004);
        prdu4.getIngredients().add(ing005);
        prdu4.getIngredients().add(ing006);
        tp02.getProduits().add(prdu4);

        // salades        
        Produit prdu5 = new Produit("Salade de boeuf à la vietnamienne", 11.4f);
        Ingredient ing007 = new Ingredient("Vermicelles de soja");
        Ingredient ing008 = new Ingredient("Steak");
        Ingredient ing009 = new Ingredient("Carottes râpées");
        Ingredient ing010 = new Ingredient("Soja frais");
        Ingredient ing011 = new Ingredient("Salades sucrines");
        Ingredient ing012 = new Ingredient("Cacahuètes");
        Ingredient ing013 = new Ingredient("Echalote");
        Ingredient ing014 = new Ingredient("Citrons");
        Ingredient ing017 = new Ingredient("Sauce nuoc mam");
        Ingredient ing018 = new Ingredient("Tabasco");
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

        Produit prdu6 = new Produit("Salade de poulet mariné au gingembre", 10.8f);
        Ingredient ing019 = new Ingredient("Blancs de poulet");
        Ingredient ing020 = new Ingredient("Tomates");
        Ingredient ing021 = new Ingredient("Oignon rouge");
        Ingredient ing022 = new Ingredient("Curry");
        Ingredient ing023 = new Ingredient("Gingembre");
        Ingredient ing025 = new Ingredient("Huile d'olive");
        Ingredient ing026 = new Ingredient("Poivre");
        Ingredient ing027 = new Ingredient("Sel");
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

        Produit prdu7 = new Produit("Salade de calamars sautés au piment et gingembre", 11.9f);
        Ingredient ing028 = new Ingredient("Calamars en anneaux");
        Ingredient ing029 = new Ingredient("Morceau de gingembre");
        Ingredient ing030 = new Ingredient("Poivron jaune");
        Ingredient ing031 = new Ingredient("Poivron vert");
        Ingredient ing032 = new Ingredient("Oignon");
        Ingredient ing033 = new Ingredient("Huile d'olive");
        Ingredient ing034 = new Ingredient("Piment");
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

        Produit prdu8 = new Produit("Salade de lotus aux crevettes sel et poivre", 12.7f);
        Ingredient ing036 = new Ingredient("Crevette");
        Ingredient ing037 = new Ingredient("Cacine de lotus");
        Ingredient ing039 = new Ingredient("Poivron rouge");
        Ingredient ing040 = new Ingredient("vinaigre blanc de riz");
        Ingredient ing041 = new Ingredient("sucre");
        prdu8.getIngredients().add(ing034);
        prdu8.getIngredients().add(ing036);
        prdu8.getIngredients().add(ing037);
        prdu8.getIngredients().add(ing039);
        prdu8.getIngredients().add(ing002);
        prdu8.getIngredients().add(ing005);
        prdu8.getIngredients().add(ing004);
        prdu8.getIngredients().add(ing002);
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
        
        // Creation du plat 4.
        Ingredient produit4Ingredient1 = new Ingredient("Pates de riz");
        Ingredient produit4Ingredient2 = new Ingredient("Filet de Boeuf");
        Ingredient produit4Ingredient3 = new Ingredient("Carotte");
        Ingredient produit4Ingredient4 = new Ingredient("Pousse de Haricot Mungo");
        Ingredient produit4Ingredient5 = new Ingredient("Oignon");
        Ingredient produit4Ingredient6 = new Ingredient("Ciboulettes");
        Ingredient produit4Ingredient7 = new Ingredient("Tranches de Gingembre");
        Ingredient produit4Ingredient8 = new Ingredient("Sauce de Soja");
        Ingredient produit4Ingredient9 = new Ingredient("Huile");
        Ingredient produit4Ingredient10 = new Ingredient("Sésame");
        
        produ5.getIngredients().add(produit4Ingredient1);
        produ5.getIngredients().add(produit4Ingredient2);
        produ5.getIngredients().add(produit4Ingredient3);
        produ5.getIngredients().add(produit4Ingredient4);
        produ5.getIngredients().add(produit4Ingredient5);
        produ5.getIngredients().add(produit4Ingredient6);
        produ5.getIngredients().add(produit4Ingredient7);
        produ5.getIngredients().add(produit4Ingredient8);
        produ5.getIngredients().add(produit4Ingredient9);
        produ5.getIngredients().add(produit4Ingredient10);
        
        // Creation du plat 5.
        Ingredient produit5Ingredient1 = new Ingredient("Oeufs");
        Ingredient produit5Ingredient2 = new Ingredient("Huile Tournesol");
        Ingredient produit5Ingredient3 = new Ingredient("Sauce Maggi");
        Ingredient produit5Ingredient4 = new Ingredient("Sel");
        Ingredient produit5Ingredient5 = new Ingredient("Gousse d'Ail");
        Ingredient produit5Ingredient6 = new Ingredient("Poivre");
        Ingredient produit5Ingredient7 = new Ingredient("Jambon en dés");
        Ingredient produit5Ingredient8 = new Ingredient("Petits Pois");
        Ingredient produit5Ingredient9 = new Ingredient("Gros Oignons");
        Ingredient produit5Ingredient10 = new Ingredient("Riz");
        
        produ5.getIngredients().add(produit5Ingredient1);
        produ5.getIngredients().add(produit5Ingredient2);
        produ5.getIngredients().add(produit5Ingredient3);
        produ5.getIngredients().add(produit5Ingredient4);
        produ5.getIngredients().add(produit5Ingredient5);
        produ5.getIngredients().add(produit5Ingredient6);
        produ5.getIngredients().add(produit5Ingredient7);
        produ5.getIngredients().add(produit5Ingredient8);
        produ5.getIngredients().add(produit5Ingredient9);
        produ5.getIngredients().add(produit5Ingredient10);
        
        // Creation du plat 6.
        Ingredient produit6Ingredient1 = new Ingredient("Concombre");
        Ingredient produit6Ingredient2 = new Ingredient("Nuoc Mam");
        Ingredient produit6Ingredient3 = new Ingredient("Gousse d'ail");
        Ingredient produit6Ingredient4 = new Ingredient("Poivre Noir");
        Ingredient produit6Ingredient5 = new Ingredient("Batavia");
        Ingredient produit6Ingredient6 = new Ingredient("Tiges Menthe");
        Ingredient produit6Ingredient7 = new Ingredient("Petits Nems");
        Ingredient produit6Ingredient8 = new Ingredient("Huile");
        Ingredient produit6Ingredient9 = new Ingredient("Boeuf Tendre");
        Ingredient produit6Ingredient10 = new Ingredient("Tige de Coriandre");
        Ingredient produit6Ingredient11 = new Ingredient("Sel");
        Ingredient produit6Ingredient12 = new Ingredient("Sucre");
        Ingredient produit6Ingredient13 = new Ingredient("Piment");
        Ingredient produit6Ingredient14 = new Ingredient("Sucre");
        Ingredient produit6Ingredient15 = new Ingredient("Citron Vert");
        Ingredient produit6Ingredient16 = new Ingredient("Cacahuetes");
        Ingredient produit6Ingredient17 = new Ingredient("Vermicelles de riz");
        
        produ6.getIngredients().add(produit6Ingredient1);
        produ6.getIngredients().add(produit6Ingredient2);
        produ6.getIngredients().add(produit6Ingredient3);
        produ6.getIngredients().add(produit6Ingredient4);
        produ6.getIngredients().add(produit6Ingredient5);
        produ6.getIngredients().add(produit6Ingredient6);
        produ6.getIngredients().add(produit6Ingredient7);
        produ6.getIngredients().add(produit6Ingredient8);
        produ6.getIngredients().add(produit6Ingredient9);
        produ6.getIngredients().add(produit6Ingredient10);
        produ6.getIngredients().add(produit6Ingredient11);
        produ6.getIngredients().add(produit6Ingredient12);
        produ6.getIngredients().add(produit6Ingredient13);
        produ6.getIngredients().add(produit6Ingredient14);
        produ6.getIngredients().add(produit6Ingredient15);
        produ6.getIngredients().add(produit6Ingredient16);
        produ6.getIngredients().add(produit6Ingredient17);
        
        // Creation du plat 7.
        Ingredient produit7Ingredient1 = new Ingredient("Nuoc Mam");
        Ingredient produit7Ingredient2 = new Ingredient("Sel");
        Ingredient produit7Ingredient3 = new Ingredient("Poivre");
        Ingredient produit7Ingredient4 = new Ingredient("Caramel Maison");
        Ingredient produit7Ingredient5 = new Ingredient("Gousse d'Ail");
        Ingredient produit7Ingredient6 = new Ingredient("Gros Oignon");
        Ingredient produit7Ingredient7 = new Ingredient("Poitrine de Porc");
        
        produ7.getIngredients().add(produit7Ingredient1);
        produ7.getIngredients().add(produit7Ingredient2);
        produ7.getIngredients().add(produit7Ingredient3);
        produ7.getIngredients().add(produit7Ingredient4);
        produ7.getIngredients().add(produit7Ingredient5);
        produ7.getIngredients().add(produit7Ingredient6);
        produ7.getIngredients().add(produit7Ingredient7);
        
        // Creation du plat 8.
        Ingredient produit8Ingredient1 = new Ingredient("Carotte");
        Ingredient produit8Ingredient2 = new Ingredient("Gros Oignon");
        Ingredient produit8Ingredient3 = new Ingredient("Champignons noirs réhydratés");
        Ingredient produit8Ingredient4 = new Ingredient("Curry");
        Ingredient produit8Ingredient5 = new Ingredient("Courgette");
        Ingredient produit8Ingredient6 = new Ingredient("Vermicelles chinois");
        Ingredient produit8Ingredient7 = new Ingredient("Feuilles de riz");
        
        produ8.getIngredients().add(produit8Ingredient1);
        produ8.getIngredients().add(produit8Ingredient2);
        produ8.getIngredients().add(produit8Ingredient3);
        produ8.getIngredients().add(produit8Ingredient4);
        produ8.getIngredients().add(produit8Ingredient5);
        produ8.getIngredients().add(produit8Ingredient6);
        produ8.getIngredients().add(produit8Ingredient7);
        
        // Creation du plat 9.
        Ingredient produit9Ingredient1 = new Ingredient("Nuoc Mam");
        Ingredient produit9Ingredient2 = new Ingredient("Huile d'Arachide");
        Ingredient produit9Ingredient3 = new Ingredient("Poivron Vert");
        Ingredient produit9Ingredient4 = new Ingredient("Oignons");
        Ingredient produit9Ingredient5 = new Ingredient("RumSteack ou Noix de Basse Côte");

        produ9.getIngredients().add(produit9Ingredient1);
        produ9.getIngredients().add(produit9Ingredient2);
        produ9.getIngredients().add(produit9Ingredient3);
        produ9.getIngredients().add(produit9Ingredient4);
        produ9.getIngredients().add(produit9Ingredient5);

        // Creation du plat 10.
        Ingredient produit10Ingredient1 = new Ingredient("Sauce Soya");
        Ingredient produit10Ingredient2 = new Ingredient("Oeuf");
        Ingredient produit10Ingredient3 = new Ingredient("Haut de cuisse (paquet de trois)");
        Ingredient produit10Ingredient4 = new Ingredient("Echalotes coupées finement");
        Ingredient produit10Ingredient5 = new Ingredient("Boite de pâte Wong ton");
        Ingredient produit10Ingredient6 = new Ingredient("Porc haché maigre cru");
        Ingredient produit10Ingredient7 = new Ingredient("Bouillon de poulet fait maison");

        produ10.getIngredients().add(produit10Ingredient1);
        produ10.getIngredients().add(produit10Ingredient2);
        produ10.getIngredients().add(produit10Ingredient3);
        produ10.getIngredients().add(produit10Ingredient4);
        produ10.getIngredients().add(produit10Ingredient5);
        produ10.getIngredients().add(produit10Ingredient6);
        produ10.getIngredients().add(produit10Ingredient7);

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
