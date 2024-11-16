/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_9_arreglos_multi.pkg2;

/**
 *
 * @author invitado
 */
public class EVA3_9_ARREGLOS_MULTI2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        int [] billetes ={20,50,100,200,500,100};
        System.out.println(billetes.length);
        String [][] ciudades = {{"Aguascalientes","Calvillo","Jesús María"},
                                {"Ensenada","Mexicali","Tecate","Tijuana"},
                                {"La paz","Cabo San Lucas","San Jose del Cabo"}};
        System.out.println(ciudades[0].length);
        
        for(int i =0;i<ciudades.length;i++){
            for(int j =0;j< ciudades[i].length;j++)
            System.out.println(ciudades[i][j]);
         }
    }
    
}
