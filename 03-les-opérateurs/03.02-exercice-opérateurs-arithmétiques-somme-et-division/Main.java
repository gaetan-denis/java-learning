import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nom de la première montagne :");
        String nomMontagne1 = scanner.nextLine();
        System.out.println("Hauteur de la première montagne :");

        // Utiliser Integer.parseInt permet de convertir le résultat en int tout en empéchant les soucis de retour chariot dans le buffer.

        int hauteurMontagne1 = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Nom de la seconde montagne :");
        String nomMontagne2 = scanner.nextLine();
        System.out.println("Hauteur de la seconde montagne :");
        int hauteurMontagne2 = Integer.parseInt(scanner.nextLine());

        // Résolution
        
        int sommeHauteur = hauteurMontagne1 + hauteurMontagne2;
        double sommeHauteurEnDouble = sommeHauteur;
        double moyenneDesHauteurs = sommeHauteurEnDouble / 2 ;
        System.out.println("La somme des hauteurs de " + nomMontagne1 + " et de "+nomMontagne2 + " est égal à : " + sommeHauteur + "m"+ " tandis que leur moyenne est de : " + moyenneDesHauteurs + "m");
        scanner.close();
    } 
}
