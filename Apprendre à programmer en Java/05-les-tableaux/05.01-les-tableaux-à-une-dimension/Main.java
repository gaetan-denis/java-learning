public class Main {
    public static void main(String[] args) {
        System.out.println("Les tableaux");

        // La déclaration

        int[] tableau;

        // L'initialisation

        tableau = new int[10];

        // Utilisation

        int taille = tableau.length;

        tableau[0] = 12;

        tableau[1] = -312;

        // Dernière case du tableau

        tableau[taille-1] = 21;
    
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = i*2;
        }

        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tableau[" + i +"] =" + tableau[i]);
        }
    }
}
