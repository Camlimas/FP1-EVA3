/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_8_arreglos_multi;

/**
 *
 * @author invitado
 */
public class EVA3_8_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][][] cubo = new int[2][5][3];
        
        //LLENADO
        System.out.println(cubo.length);
        System.out.println(cubo[1].length);
        System.out.println(cubo[0][0].length);
        
         for (int i=0; i<cubo.length; i++){//1er dim
         for (int j=0; j<cubo[i].length; j++){//2da dim
         for (int k=0; k<cubo[i][j].length; k++){//3er dim
             cubo[i][j][k] = (int)(Math.random()* 100);
             
                   
     }
     }
     }
       //IMPRIMIR LOS VALORES
         for (int i=0; i<cubo.length; i++){//1er dim
         for (int j=0; j<cubo[i].length; j++){//2da dim
         for (int k=0; k<cubo[i][j].length; k++){//3er dim
            System.out.print("[" +cubo[i][j][k]+"]");
             
                   
     }
     }
     }
    }
}