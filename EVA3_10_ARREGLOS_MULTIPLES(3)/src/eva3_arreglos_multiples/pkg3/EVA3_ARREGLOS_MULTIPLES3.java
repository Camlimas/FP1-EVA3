package eva3_arreglos_multiples.pkg3;

/**
 *
 * @author melan
 */
public class EVA3_ARREGLOS_MULTIPLES3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][][][][] num= new int [3][4][5][6][7];
        
       for (int i=0; i<num.length; i++){
        for (int j=0; j<num.length; j++){
        for (int k=0; k<num.length; k++){
        for (int l=0; l<num.length; l++){
        for (int m=0; m<num.length; m++){
            num[i][j][k][l][m] = (int)(Math.random()*100);
        }
        }
        }
        }
        }
         
       for (int i=0; i<num.length; i++){
       for (int j=0; j<num[i].length; j++){
        for (int k=0; k<num[i][j].length; k++){
        for (int l=0; l<num[i][j][k].length; l++){
        for (int m=0; m<num[i][j][k][l].length; m++){
          System.out.print(num[i][j][k][l][m] + " ");
        }
        }
        }
        }
        }
       
    }
    
}
