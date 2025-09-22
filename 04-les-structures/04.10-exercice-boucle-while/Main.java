import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Le nombre mystère");
        int randomNumber = (int) (Math.random() * 100);
        int userNumber = 0;
        int number1 = 0;
        int number2 = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Saisissez votre nombre mystère :");
            userNumber = Integer.parseInt(scan.nextLine());

            if (userNumber > randomNumber) {
                number1 = userNumber;
                number2 = randomNumber;
            } else {
                number1 = randomNumber;
                number2 = userNumber;
            }
            int difference = (number1 - number2);

            if (difference > 20) {
                System.out.println("froid");
            } else if (difference > 6 && difference < 20) {
                System.out.println("tiède");
            } else  {
                System.out.println("Chaud");
            } 
                
            

        } while (userNumber != randomNumber);
        System.out.println("Vous avez gagné!");
        
        scan.close();
    }
}
