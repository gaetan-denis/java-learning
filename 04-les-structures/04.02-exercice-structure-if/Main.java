import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        System.out.print("Nom de la montagne n°1 :");
        String nomDeLaMontagne1 = scan.nextLine();
        System.out.print("Hauteur de la montagne n°1 : ");
        int hauteurDeLaMontagne1 = Integer.parseInt(scan.nextLine());
        System.out.print("Nom de la montagne n°2 :");
        String nomDeLaMontagne2 = scan.nextLine();
        System.out.print("Hauteur de la montagne n°2 : ");
        int hauteurDeLaMontagne2 = Integer.parseInt(scan.nextLine());

        if(hauteurDeLaMontagne1 < hauteurDeLaMontagne2){
            System.out.println("La hauteur de " +nomDeLaMontagne1 + " est plus petite que celle de " + nomDeLaMontagne2);
        }

        if(hauteurDeLaMontagne1 == hauteurDeLaMontagne2){
            System.out.println("La hauteur de " +nomDeLaMontagne1 + " est identique à celle de " + nomDeLaMontagne2);
        }

        if(hauteurDeLaMontagne1 > hauteurDeLaMontagne2){
            System.out.println("La hauteur de " +nomDeLaMontagne1 + " est plus grande que celle de " + nomDeLaMontagne2);
        }
        scan.close();
    }
}
