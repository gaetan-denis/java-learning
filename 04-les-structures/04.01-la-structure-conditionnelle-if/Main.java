public class Main {
    public static void main(String[] args) {

        // La structure conditionnelle if

        int monEntier = 4;

        System.out.println("La valeur de mon entier est : " + monEntier);
        if (monEntier >= 0 && monEntier < 10) {
            System.out.println("Mon entier est plus grand ou égal à 0 et inférieur à 10 ");

            if(monEntier <5){
                System.out.println("et est strictement inférieur à 5");
            }
        }
    }
}