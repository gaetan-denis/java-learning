import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nom de la montagne : ");
        String nomDeLaMontagne = scan.nextLine();
        System.out.print("Hauteur de la montagne : ");
        int hauteurDeLaMontagne = Integer.parseInt(scan.nextLine());
        System.out.println("Le " + nomDeLaMontagne + " culmine à une hauteur de " + hauteurDeLaMontagne + " m");
        System.out.println("La hauteur est supérieure à 3000m?");
        System.out.println(isHigherThan3000(hauteurDeLaMontagne));
        scan.close();

    }
    // Utilisation de private pour restreindre son utilisation à cette seule classe
    private static boolean isHigherThan3000(int value){
        return value>3000;
    }
}
