import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Nom de la montagne : ");
        String nomDeLaMontagne = scan.nextLine();
        System.out.println("Hauteur de la montagne : ");
        int hauteurDeLaMontagne = Integer.parseInt(scan.nextLine());
        System.out.println("Le nom de la montagne est " + nomDeLaMontagne + "et sa hauteur culmine à " + hauteurDeLaMontagne +" m");
        scan.close();
        System.out.println("La hauteur de la montagne est-elle comprise entre 3000 ou 4000m?");
        System.out.println(heightBetween3000And4000(hauteurDeLaMontagne));
    }

    private static boolean heightBetween3000And4000(int value){
        return (value >3000 && value < 4000);
    }
}
