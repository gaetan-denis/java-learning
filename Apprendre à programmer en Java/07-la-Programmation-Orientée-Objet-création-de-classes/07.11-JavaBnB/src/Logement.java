public class Logement {
    private String nom;
    private int tarifParNuit;
    private String adresse;
    private int superficie; 
    private int nbVoyageursMax;

    public Logement(String Nom, int TarifParNuit, String Adresse, int Superficie, int NbVoyageursMax){
        this.nom= Nom;
        this.tarifParNuit = TarifParNuit;
        this.adresse = Adresse;
        this.superficie = Superficie;
        this.nbVoyageursMax = NbVoyageursMax;
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
        System.out.println("Le logement (" + this.nom + ") est situé " + this.adresse);
        System.out.println("Superficie : " + this.superficie + "m²");
    }
}
