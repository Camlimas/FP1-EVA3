/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_7_mareices;

/**
 *
 * @author invitado
 */
public class EVA3_7_MAREICES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arreglos =new int [5];//arreglo unidimensional
        int [][] matriz =new int [3][3];//HOJA DE EXCEL
        matriz [0][0] =100;//PRIMERA POSICION
        matriz [0][1] =200;
        matriz [0][2] =300;
        matriz [1][0] =400;
        matriz [1][1] =500;
        matriz [1][2] =600;
        matriz [2][0] =700;
        matriz [2][1] =800;   
        matriz [2][2] =900;//ULTIMA POSICION
        
        for (int i=0; i<3; i++){//FILAS-> 1ER DIMENSION
            for (int j=0; j<3; j++){//COLUMNAS -> 2DA DIMENSION
            System.out.print("["+ matriz[i][j] +"]");
      
            }
            System.out.println("");
        }
    }
    
}
