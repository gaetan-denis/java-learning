import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int monEntier;

        do {

            System.out.println("Saisir mon entier?");
           monEntier = Integer.parseInt(scan.nextLine());
        } while (monEntier < 0 || monEntier > 10);

        System.out.println("Mon entier est " + monEntier + " inférieur à 10");
        scan.close();
    }
}