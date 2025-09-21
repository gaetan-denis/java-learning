public class Main {
    public static void main(String[] args) {
        int monEntier = 2;
        System.out.println("La valeur de cet entier est " + monEntier);

        if (monEntier > 0) {
            System.out.println("Mon entier est positif");
        } else if (monEntier < 0) {
            System.out.println("Mon entier est négatif");
        } else {
            System.out.println("Mon entier est null");
        }
    }
}