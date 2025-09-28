import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nom de la montagne : ");
        String nomDeLaMontagne = scanner.nextLine();
        System.out.print("Hauteur de la montagne : ");
        int hauteurDeLaMontagne = Integer.parseInt(scanner.nextLine());
        System.out.println("Le nom de la montagne est : " + nomDeLaMontagne + " et sa hauteur cumule à : " + hauteurDeLaMontagne + "m");
        if(isEvenHeight(hauteurDeLaMontagne)){
            System.out.println("La hauteur de la montagne est une valeur paire");
        }else {
            System.out.println("La valeur de la montagne est une valeur impaire");
        }
        scanner.close();
    }

    public static boolean isEvenHeight(int value){
        return value %2 == 0;
    }
}