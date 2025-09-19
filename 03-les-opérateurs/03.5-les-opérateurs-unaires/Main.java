public class Main {
    public static void main(String[] args){
        
        int monEntier = 10;

        // Post-incrémentation
        int resultat = monEntier++;
        System.out.println("Mon entier : " + monEntier);
        System.out.println("Résultat : " + resultat);

        // Pré-incrémentation

        int monEntier2= 10;

        int resultat2 = ++monEntier2;
        System.out.println("Mon second entier : " + monEntier2);
        System.out.println("Mon second résultat : "+ resultat2);

        // négatif

        int monEntier3 = 10;
        System.out.println("Mon troisième entier : " + -monEntier3);

        // Pré-décrémentation

        int monEntier4 = 10;
        int resultat4 = --monEntier4;
        System.out.println("Mon quatrième entier : " + monEntier4);
        System.out.println("Mon quatrième résultat : " + resultat4);
        
        // Post-décrémentation

        int monEntier5 = 10;
        int resultat5 = monEntier4--;
        System.out.println("Mon cinquième entier : " + monEntier5);
        System.out.println("Mon cinquième résultat : " + resultat5);


    }
}
