public class Main {
    public static void main(String[] args){
        System.out.println("Terrains");
        
        // Type objet
        // Déclaration d'un Terrain
        Terrain monTerrain1;

        Terrain monTerrain2;

        // Initialisation par le constructeur

        monTerrain1 = new Terrain(12,32 );
        monTerrain2 = new Terrain(15,42 );

        // Utilisation avec l'opérateur . depuis un objet

        // monTerrain1.largeur = 12;
        // monTerrain1.longueur = 32;

        monTerrain1.largeur = 14;
        monTerrain2.largeur = 15;
        monTerrain2.longueur = 42;

        // int laSuperficieDeMonTerrain1 = monTerrain1.superficie();
        // int laSuperficieDeMonTerrain2 = monTerrain2.superficie();

        monTerrain1.afficher();
        monTerrain2.afficher();

       if( monTerrain1.aUneSuperficiePlusGrandeQue(200)){
        System.out.println("Mon terrrain 1 a une superficie plus grande que 200m²");
       }else{
        System.out.println("Mon terrain 1 n'a pas une superficie plus grande que 200m²");
       }

        // System.out.println("Superficie terrain 1 : " + laSuperficieDeMonTerrain1 +"m²");
        // System.out.println("Superficie terrain 2 : " + laSuperficieDeMonTerrain2 +"m²");
        

    }
}
