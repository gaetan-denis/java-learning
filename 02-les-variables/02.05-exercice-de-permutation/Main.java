public class Main {
    public static void main(String[] args){
        System.out.println("Début du programme");
        
        int hauteurDeLaMontagne1 = 4401;
        String nomDeLaMontagne1 = "Le Mont Whitney";

        int hauteurDeLaMontagne2 = 4421;
        String nomDeLaMontagne2 = "Le Mont Elbert";

        System.out.println("Avant la permutation : " + nomDeLaMontagne1 + " culmine à " + hauteurDeLaMontagne1 + "m" + " et " + nomDeLaMontagne2 + " culmine à " + hauteurDeLaMontagne2 + "m");
        
        int hauteurDeTransition = hauteurDeLaMontagne1;
        hauteurDeLaMontagne1 = hauteurDeLaMontagne2;
        hauteurDeLaMontagne2=hauteurDeTransition;

        System.out.println("Après la permutation : " + nomDeLaMontagne1 + " culmine à " + hauteurDeLaMontagne1 + "m" + " et " + nomDeLaMontagne2 + " culmine à " + hauteurDeLaMontagne2 + "m");


        System.out.println("Fin du programme");
    }    
}
