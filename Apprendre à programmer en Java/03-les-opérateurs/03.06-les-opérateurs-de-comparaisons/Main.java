public class Main {
    public static void main(String[] args){

        // les opérateurs relationnels > >= < <= == !=

        int monPremierEntier = 10;
        int monSecondEntier = 4;
    
        // La règle
        // int > int -> boolean

        boolean resultat1 = monPremierEntier > monSecondEntier;
        System.out.println("Est-ce que mon premier entier est plus grand que mon deuxième entier?");
        System.out.println(resultat1);

        boolean resultat2 = monPremierEntier >= monSecondEntier;
        System.out.println("Est-ce que mon premier entier est plus grand ou égal à mon deuxième entier?");
        System.out.println(resultat2);

        boolean resultat3 = monPremierEntier < monSecondEntier;
        System.out.println("Est-ce que mon premier entier est plus petit que mon deuxième entier?");
        System.out.println(resultat3);

        boolean resultat4 = monPremierEntier < monSecondEntier;
        System.out.println("Est-ce que mon premier entier est plus petit ou égal à mon deuxième entier?");
        System.out.println(resultat4);

        boolean resultat5 = monPremierEntier == monSecondEntier;
        System.out.println("Est-ce que mon premier entier est égal à mon deuxième entier?");
        System.out.println(resultat5);

        boolean resultat6 = monPremierEntier != monSecondEntier;
        System.out.println("Est-ce que mon premier entier est différent de mon deuxième entier?");
        System.out.println(resultat6);
    }
}
