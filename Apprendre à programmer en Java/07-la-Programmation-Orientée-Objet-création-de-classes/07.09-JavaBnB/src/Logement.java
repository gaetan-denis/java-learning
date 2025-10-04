public class Logement {
    private String nom;
    private int tarifParNuit;
    private String adresse;
    private int superficie; 
    private int nbVoyageursMax;

    public Logement(String paramNom, int paramTarifParNuit, String paramAdresse, int paramSuperficie, int paramNbVoyageursMax){
        this.nom= paramNom;
        this.tarifParNuit = paramTarifParNuit;
        this.adresse = paramAdresse;
        this.superficie = paramSuperficie;
        this.nbVoyageursMax = paramNbVoyageursMax;
    }

    // Getter & Setters

    public String getNom() {
        return nom;
    }

    public void setNom(String paramNom) {
        this.nom = paramNom;
    }

    public int getTarifParNuit() {
        return tarifParNuit;
    }
    public void setTarifParNuit(int paramTarifParNuit) {
        this.tarifParNuit = paramTarifParNuit;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String paramAdresse) {
        this.adresse = paramAdresse;
    }
    public int getSuperficie() {
        return superficie;
    }
    public void setSuperficie(int paramSuperficie) {
        this.superficie = paramSuperficie;
    }
    public int getNbVoyageursMax() {
        return nbVoyageursMax;
    }
    public void setNbVoyageursMax(int paramNbVoyageursMax) {
        this.nbVoyageursMax = paramNbVoyageursMax;
    }

    public void afficher(){
        System.out.println("Le logement (" + nom + ") est situé " + adresse);
        System.out.println("Superficie : " + superficie + "m²");
    }
}
