import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Nom de la première montagne :");
        String nameOfMountain1 = scan.nextLine();
        System.out.print("Hauteur de la première montagne :");
        int heightOfMountain1 = Integer.parseInt(scan.nextLine());

        System.out.print("Nom de la seconde montagne :");
        String nameOfMountain2 = scan.nextLine();
        System.out.print("Hauteur de la seconde montagne :");
        int heightOfMountain2 = Integer.parseInt(scan.nextLine());

        System.out.print("Nom de la troisième montagne :");
        String nameOfMountain3 = scan.nextLine();
        System.out.print("Hauteur de la troisiè!me montagne :");
        int heightOfMountain3 = Integer.parseInt(scan.nextLine());
        
       

        System.out.println(getHeighterMountain(heightOfMountain1, heightOfMountain2, heightOfMountain3, nameOfMountain1, nameOfMountain2, nameOfMountain3));

        scan.close();
    }

    private static String getHeighterMountain(int height1, int height2, int height3, String name1, String name2, String name3){
        if(height1 > height2 && height1 > height3){
            return "La plus grande montagne est : " + name1;
        }else if(height2 > height1 && height2 > height3) {
            return "La plus grande montagne est : " + name2;
        }else{
            return "La plus grande montagne est : " + name3;
        }
    }
}
