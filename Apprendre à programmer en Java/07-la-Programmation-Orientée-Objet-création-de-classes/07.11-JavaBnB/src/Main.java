public class Main {
    public static void main(String[] args) {
        Personne user01 = new Personne("Doe", "John", 33);
        Personne user02 = new Personne("Doe", "Jane", 28);

        user01.afficher();
        user02.afficher();

        Logement logement01 = new Logement("Maison au calme", 80, "157 Boulevard de la Liberté, Lille", 100, 4);

        logement01.afficher();
    }
}
