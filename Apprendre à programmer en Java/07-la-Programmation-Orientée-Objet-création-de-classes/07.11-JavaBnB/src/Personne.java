class Personne {
    private String prenom;
    private String nom;
    private int age;

    public Personne(String pPrenom, String pNom, int pAge) {
        this.prenom = pPrenom;
        this.nom = pNom;
        this.age = pAge;
    }

    public void afficher() {
        System.out.println("prénom : " + prenom + ";nom :" + nom + "; âge : " + age + " ans; ");
    }
}
