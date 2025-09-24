public class Main {
    public static void main(String[] args) {
        System.out.println("Début du programme");

        // break

        // for (int i = 1; i <= 10; i++) {
        //     if (i % 5 == 0) {
        //         break;
        //     }

        //     System.out.println(i);
        // }
        
        // continue
        
        for (int i = 1; i <= 10; i++) {
            if (i % 5 == 0) {
                continue;
            }

            System.out.println(i);
        }
        System.out.println("Fin du programme");
    }
}
