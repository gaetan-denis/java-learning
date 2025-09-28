public class Main {
    public static void main(String[] args) {

        // la structure for
        // La somme des chiffres soit 0+1+2+3...+9
        int somme = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Mon chiffre " + i);
            int monChiffre = i;
            somme = somme + monChiffre;
        }
        System.out.println("La somme est " + somme);
    }

}
