import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quel est le nom de la montagne? ");
        String nameOfTheMoutain = scanner.nextLine();
        System.out.print("Quelle est la hauteur de la montagne? ");
        int heightOfTheMoutain = Integer.parseInt(scanner.nextLine());

        int value = heightOfTheMoutain / 1000;

        switch (value) {
            case 0:
                System.out.println("La hauteur de " + nameOfTheMoutain + "culmine entre 0 et 999m");
                break;
            case 1:
                System.out.println("La hauteur de " + nameOfTheMoutain + "culmine entre 1000 et 1999m");
                break;
            case 2:
                System.out.println("La hauteur de " + nameOfTheMoutain + "culmine entre 2000 et 2999m");
                break;
            case 3:
                System.out.println("La hauteur de " + nameOfTheMoutain + "culmine entre 3000 et 3999m");
                break;
            case 4:
                System.out.println("La hauteur de " + nameOfTheMoutain + "culmine entre 4000 et 4999m");
                break;
            default:
                System.out.println("La hauteur de " + nameOfTheMoutain + "culmine à plus de 5000m");
                break;
        }

        scanner.close();

    }
}
