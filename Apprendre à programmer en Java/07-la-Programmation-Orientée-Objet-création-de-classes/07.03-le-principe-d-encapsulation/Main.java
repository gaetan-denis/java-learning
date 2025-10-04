public class Main {
    public static void main(String[] args){
        System.out.println("Terrains");
        
        // Type objet
        // Déclaration d'un Terrain
        Terrain monTerrain1;

        monTerrain1 = new Terrain(12, 32);

        

        // Initialisation par le constructeur

        monTerrain1.setLargeur(14);
        monTerrain1.setLongueur(24);
        

        System.out.println("Mon terrain 1 : " + monTerrain1.getLargeur());

        monTerrain1.afficher();
        // monTerrain2.afficher();

       /*
       * Définition du principe d'encapsulation :
       * 
       * C'est le fait d'enfermer à l'intérieur de la classe sa représentation faite par ses 
       * attributs et d'offrir un accès public à ses attributs uniquement via des méthodes
       * comme get(lire la valeur des attributs) ou set(modifier la valeur des attributs)
       * 
       */
      
       /*
        * Notes : 
        * 
        * Il est important de noter qu'il n'y a aucune obligation techniques à instaurer ses 
        * méthodes get et set. Par contre il en est de la responsabilité du développeur de la 
        * classe de protéger ses attributs et d'offrir s'il le souhaite un accès en écriture ainsi
        * qu'en lecture.
        */
       
       
       
    }
}

