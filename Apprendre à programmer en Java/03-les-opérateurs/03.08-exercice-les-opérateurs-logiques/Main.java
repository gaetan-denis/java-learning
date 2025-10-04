public class Main {
    public static void main(String[] args){
        // Les opérateurs logiques !  && ||

        boolean monPremierBoolean = true;
        boolean monSecondBoolean = false;

        boolean negation = !monPremierBoolean;
        System.out.println("Négation  : " + negation);

        /* 
        * Le ET logique  :
        * La règle
        * true && true -> true
        * true && false -> false
        * false && true -> false
        * false && false -> false
        */  

        boolean etLogique = monPremierBoolean && monSecondBoolean;
        System.out.println("ET logique " + etLogique);


        /*
         * Le OU logique :
         *  true || true -> true
         * true || false -> true
         * true || true -> true
         * false || false -> false
         */

         boolean ouLogique = monPremierBoolean || monSecondBoolean;
         System.out.println("OU logique :" + ouLogique);
    }
}
