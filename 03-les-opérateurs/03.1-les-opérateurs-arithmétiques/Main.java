public class Main {
    public static void main(String[] args) {
        // les opérateurs arithmétiques

        int monPremierEntier = 42;
        int monSecondEntier = 5;

        int somme = monPremierEntier + monSecondEntier;
        int soustraction = monPremierEntier - monSecondEntier;
        int multiplication = monPremierEntier * monSecondEntier;

        /*
         * Attention pour la division, le résultat d'un int divisé par un int sera
         * également un int, nous n'auront donc pas de décimal ici
         */

        int division = monPremierEntier / monSecondEntier;

        /*
         * Reste de la division
         */

        int modulo = monPremierEntier % monSecondEntier;

        System.out.println("Somme = " +somme);
        System.out.println("Soustraction =" + soustraction);
        System.out.println("Multiplication =" + multiplication);
        System.out.println("Division avec un type int =" + division);
        System.out.println("Modulo =" + modulo);

        /*
         * Typage :
         * int + int = int
         * int - int = int
         * int * int = int
         * int / int = int
         * double + double = double
         * double - double = double
         * double * double = double
         * double / double = double
         * 
         * ATTENTION : stocker la variable dans un type double ne suffit pas, il faut que les deux opérateurs soient des doubles équalement.
         * 
         * Exemple 
         */
         double monPremierDouble = monPremierEntier;
         double monSecondDouble = monSecondEntier;
         double resultat = monPremierDouble/monSecondDouble;
         System.out.println("Division avec un type double = " + resultat);

         /*
          * Il est possible de multiplier un type int par un type double ce qui donnera alors un résultat de type double.
          */
    }
}