import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.print("Choisissez une valeur : ");
       int userValue = Integer.parseInt(scan.nextLine());
       int int0=0;
       int int1=1;

       int[] fibonacciArray = new int[userValue+1];

       fibonacciArray[0] = int0;
       fibonacciArray[1] = int1;
       

       for (int i = 2; i < fibonacciArray.length; i++) {
            int sum = int0 + int1;
            fibonacciArray[i] = sum;
            int0 =int1;
            int1 = sum;
       }

       for (int i = 0; i < fibonacciArray.length; i++) {
            System.out.println("Valeur " + i + " = " + fibonacciArray[i]);
       }
       scan.close();
    }
}