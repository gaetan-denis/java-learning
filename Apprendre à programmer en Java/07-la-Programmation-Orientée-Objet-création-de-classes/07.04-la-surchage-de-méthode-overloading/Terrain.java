// Classe TErrain qui définit un terrain
public class Terrain {

    // Un terrain, qu'est-ce que c'est? --> Attributs

    private int largeur;
    private int longueur;

    // Un terrain ça se construit comment? --> Constructeurs

    public Terrain(int paramLargeur, int paramLongueur) {
        largeur = paramLargeur;
        longueur = paramLongueur;
    }

    // Un terrain, qu'est-ce que ça sait faire? --> Méthodes

    // Getter ou accesseur

    public int superficie() {
        int laSuperficieDuTerrain = largeur * longueur;
        return laSuperficieDuTerrain;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int paramLargeur) {
        if (paramLargeur < 0) {
            // lancer une exception
        } else {
            this.largeur = paramLargeur;
        }

    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int paramLongueur) {
        this.longueur = paramLongueur;
    }

    public void afficher() {
        System.out
                .println("Terrain de taille : " + largeur + " x " + longueur + ", superficie : " + superficie() + "m²");
    }

    public boolean aUneSuperficiePlusGrandeQue(int valeur) {
        if (superficie() > valeur) {
            return true;
        } else {
            return false;
        }
    }

    public void augmenterLaLongueur() {
        longueur++;
    }
    public void augmenterLaLongueur(int valeur) {
        longueur += valeur;
    }
}