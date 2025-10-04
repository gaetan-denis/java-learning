import java.util.Scanner;

public class Main {
   public static void main(String[] args){
    System.out.println("Début du programme");

    Scanner scanner = new Scanner(System.in);

    /*
     * Là où la méthode printLn permet de passer à la ligne suivante, 
     * la méthode print() permet de faire la saisie sur la même ligne.
     */
    System.out.print("Le nom de la montagne: ");
    String nomDeLaMontagne = scanner.next();

    System.out.print("La hauteur de " + nomDeLaMontagne + ":");
    int hauteurDeLaMontagne = scanner.nextInt();

    System.out.println("Le " + nomDeLaMontagne + " culmine à " + hauteurDeLaMontagne + "m.");

    scanner.close();
    System.out.println("Fin du programme");
   } 
}
