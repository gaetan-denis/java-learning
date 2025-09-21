public class Main {
    public static void main(String[] args) {

        int highValue = Integer.MIN_VALUE; // représente la plus grande valeur qu’un int peut contenir en Java
        int lowValue = Integer.MAX_VALUE; // représente la plus petite valeur qu’un int peut contenir en Java

        for (int i = 1; i <= 10; i++) {

            // Math.random() -> {0,1} au minimum 0,0 et au maximum 0,99999
            int randomNumber = (int) (Math.random() * 100);
            System.out.println("Nombre " + i + " = " + randomNumber);

            if (randomNumber > highValue) {
                highValue = randomNumber;
            }

            if (randomNumber < lowValue) {
                lowValue = randomNumber;
            }
        }
        System.out.println("La plus grande valeur est : " + highValue);
        System.out.println("La plus petite valeur est : " + lowValue);

    }
}
