

public class Main {
    public static void main (String[] args){
        System.out.println("Début du programme");

      /*
       * Les types primitifs :
       * - Au nombre de huit
       * - Sont des mots-clés du Java
       */

       // Les entiers

       /*
       * Le byte :
       * - Le byte est codé sur 8 bit 
       * - les possibilités vont de -128 à +127
       * */

       byte monByte = 42;
       short monShort= 23;
       int monInt = 542;
       long monLong = 78217429293L;

       // Les flottants

       float monFloat = 423.214f;
       double monDouble = 32.523;

        // Le boolean

        boolean monBoolean = true;

        // Le caractère;

        char monChar ='t';

        System.out.println(monByte);
        System.out.println(monShort);
        System.out.println(monInt);
        System.out.println(monLong);
        System.out.println(monFloat);
        System.out.println(monDouble);
        System.out.println(monBoolean);
        System.out.println(monChar);

        System.out.println("Fin du programme");
    }
}
