import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nom de la montagne : ");
        String nomDeLaMontagne = scanner.nextLine();
        System.out.print("Hauteur de la montagne : ");
        int hauteurDeLaMontagne = Integer.parseInt(scanner.nextLine());
        System.out.println("Le nom de la montagne est : " + nomDeLaMontagne + " et sa hauteur cumule à : " + hauteurDeLaMontagne + "m");
        if(hauteurDeLaMontagne %2 == 0){
            System.out.println("La hauteur de la montagne est une valeur pair");
        }else {
            System.out.println("La valeur de la montagne est une valeur impair");
        }
        scanner.close();
    }
}