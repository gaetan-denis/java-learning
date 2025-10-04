public class Main {
    public static void main(String[] args){
        
        // La déclaration

        int[][] tableauADeuxDimensions = {{0,1,2,3,4},{5,6,7,8,9}};

        // Initialisation

        tableauADeuxDimensions = new int [3][2];

        int cpt = 10;

        for ( int i = 0; i < tableauADeuxDimensions.length; i++) {
            for (int j = 0; j < tableauADeuxDimensions[0].length; j++) {
                tableauADeuxDimensions[i][j] =cpt;
                cpt ++;
            }
        }

        // Utilisation
        for (int i = 0; i < tableauADeuxDimensions.length; i++) {
            for (int j = 0; j < tableauADeuxDimensions[0].length; j++) {
                System.out.print(tableauADeuxDimensions[i][j] + " ");
            }
            System.out.println();
        }
    }
}
