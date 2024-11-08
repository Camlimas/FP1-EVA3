/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_4_metodos;

/**
 *
 * @author invitado
 */
public class EVA3_4_METODOS {

    
 
    public static void main(String[] args) {
        
        System.out.println(encontrarMayor(10,15));
        System.out.println(diadelaSemana(1));
        
        
    }
    
    //VALOR MÁS GRANDE ENTRE DOS NÚMEROS ENTEROS
    public static int encontrarMayor(int num1,int num2){
     /*int resu;
     if(num1>num2)
    resu = num1;
    else
        resu = num2;
    return resu;*/
        if(num1> num2){
            return num1;
            }else{ 
            return num2;
        }
        
        //Metodo que regresa el dia de la semana en texto.Pide el número
        //(1-7) y regresa :Lunes,Martes,etc.
  
    }
    
    public static String diadelaSemana(int num1){
    
        switch (num1){
         case 1:
             return "Domingo";
          case 2:
             return "Lunes";
         case 3:
             return "Martes";
         case 4:
             return "Miercoles";
         case 5:
             return "Jueves";
         case 6:
             return "Viernes";
         case 7:
             return "Sabado";   
         default:
             return "Día no valido";
    }
    
    }

}
