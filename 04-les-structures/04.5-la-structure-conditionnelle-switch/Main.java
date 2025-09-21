public class Main {
    public static void main(String[] args){

       // exemple nécessitant un break.
       
        // int monEntien = 2;

        // switch(monEntien){
        //     case 0 :
        //     System.out.println("Mon entier est égal à zéro"); 
        //     break;
        //     case 1 :
        //     System.out.println("Mon entier est égal à un"); 
        //     break;
        //     case 2 :
        //     System.out.println("Mon entier est égal à deux"); 
        //     break;
        //     case 3 :
        //     System.out.println("Mon entier est égal à trois"); 
        //     break;
        // }

        // exemple ne nécessitant pas de break

        char monChar = 'c';

        switch(monChar){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'y' :
                System.out.println("Ce caractère est une voyelle");
                break;
            default :
            System.out.println("Ce caractère est une consonne");
        }
    }
}
