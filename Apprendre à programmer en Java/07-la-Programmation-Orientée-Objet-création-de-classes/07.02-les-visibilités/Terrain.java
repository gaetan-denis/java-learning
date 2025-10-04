// Classe TErrain qui définit un terrain
public class Terrain{
    
    // Un terrain, qu'est-ce que c'est? --> Attributs

    public int largeur;
    private int longueur;

    // Un terrain ça se construit comment? --> Constructeurs
    
    

    Terrain(int paramLargeur, int paramLongueur){
        largeur = paramLargeur;
        longueur = paramLongueur;
    }

    // Un terrain, qu'est-ce que ça sait faire? --> Méthodes

    int superficie(){
        int laSuperficieDuTerrain = largeur * longueur;
        return laSuperficieDuTerrain;
    }

    void afficher(){
        System.out.println("Terrain de taille : " + largeur + " x " + longueur +", superficie : " + superficie() + "m²");
    }

    boolean aUneSuperficiePlusGrandeQue (int valeur){
        if(superficie() > valeur){
            return true;
        }else{
            return false;
        }
    }
}