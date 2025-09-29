import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Les méthodes");
        Scanner scan = new Scanner(System.in);
        // System.out.print("Quel est le nombre de notes? : ");
        // int nombreDeNotes = Integer.parseInt(scan.nextLine());
        int nombreDeNotes = saisirUnEntier(scan ,"Quel est le nombre de notes? : ");
        int[] tableauDesNotes = new int[nombreDeNotes];

        for (int i = 0; i < nombreDeNotes; i++) {
            //System.out.print("Saisir la note : " + (i+1) + " : ");
            //int note = scan.nextInt();
            int note = saisirUnEntier(scan ,"Saisir la note : " + (i+1) + " : ");
            tableauDesNotes[i] = note;
        }

        
        // Afficher le tableau

        afficherTableau(tableauDesNotes);

        // Calcul de la moyenne

        int somme = 0;

        for (int i = 0; i < nombreDeNotes; i++) {
            somme += tableauDesNotes[i];
        }

        double moyenne = (double) somme/nombreDeNotes ;

        System.out.println("La moyenne est de :" + moyenne);

        scan.close();
    }

    static void afficherTableau(int []tab){
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    static int saisirUnEntier(Scanner scan, String message){
        System.out.print(message);
        int monEntier = Integer.parseInt(scan.nextLine());  
        return monEntier;
    }

    
}
