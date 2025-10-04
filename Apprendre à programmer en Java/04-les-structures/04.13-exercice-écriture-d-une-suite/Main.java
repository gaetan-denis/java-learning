import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Suite de Fibonacci");
        Scanner scan = new Scanner(System.in);
        System.out.println("Choisissez un rang : ");
        int userRang = Integer.parseInt(scan.nextLine());

        // 0 1 1 2 3 5 8 13 21 34 55 89 144

        int fibo0 = 0;
        int fibo1 = 1;

        if (userRang >= 2)

        {

            System.out.print(fibo0 + " ");
            System.out.print(fibo1 + " ");

            int fiboNmoins2 = fibo0;
            int fiboNmoins1 = fibo1;
            int fiboN = -1;

            // ..

            for (int n = 2; n <= userRang; n++) {

                fiboN = fiboNmoins1 + fiboNmoins2;
                System.out.print(fiboN + " ");
                fiboNmoins2 = fiboNmoins1;
                fiboNmoins1 = fiboN;
            }
            System.out.println("\nFibonacci au rang " + userRang + "=" + " " + fiboN);
            scan.close();
        }
    }
}
