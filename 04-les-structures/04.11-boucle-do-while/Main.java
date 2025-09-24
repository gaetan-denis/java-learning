import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Choisissez un nombre compris entre 0 et 99 : ");
        int userNumber = Integer.parseInt(scan.nextLine());
        int computerNumber = 0;
        int count = 0;
        int min =0;
        int max =99;

        do {
            computerNumber = (int) (Math.random()  * (max-min+1) +min);
            if (computerNumber > userNumber) {
                System.out.println(computerNumber + ": C'est trop grand!");
                count ++;
                max = computerNumber;
            } else {
                System.out.println(computerNumber + ": C'est trop petit");
                count ++;
                min = computerNumber;
            }
        } while (computerNumber != userNumber);

        System.out.println("C'est gagné! Nombre de tentatives : " + count);

        scan.close();

    }
}
