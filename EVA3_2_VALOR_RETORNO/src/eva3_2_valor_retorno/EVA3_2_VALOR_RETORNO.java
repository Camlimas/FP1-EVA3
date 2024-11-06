/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_2_valor_retorno;

/**
 *
 * @author invitado
 */
public class EVA3_2_VALOR_RETORNO {
    public static void main(String[] args) {
        //NECESITAMOS RECUPEREAR EL VALOR,PARA HACER ALGO CON EL;
        int resu;
        resu= sumar(5,10);
        System.out.println("RESULTADO:"+ resu);
        //SEGUNDA ALTERNATIVA,SOLO LO NESCISTA UNA VEZ
        System.out.println("RESULTADO:" + sumar(5,10));
        //NO LES INTERESA EL RESULTADO
        
        sumar(5,10); //El resultado se pierde 
    }
    
    public static int sumar( int num1,int num2){
    return num1 + num2;
   
   }
    
            
    
}
