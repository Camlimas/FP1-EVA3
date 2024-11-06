/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_3_CAPTURA {
    public static void main(String[] args) {
       String nombre =capturarTexto("Introduce tu nombre");
       String apellido =capturarTexto("Introduce tu apellido");
       int edad =capturarEdad("Introduce tu edad");
     double salario =capturarSalario("Introduce tu salario");
       System.out.println("Nombre:"+ nombre);
       System.out.println("Apellido:"+ apellido);
      System.out.println("Edad:"+ edad);
      System.out.println("Salario:"+ salario);
        
    }
    
   public static String capturarTexto(String mensaje){
   
       Scanner captu =new Scanner(System.in);
       System.out.println(mensaje);
       String texto =captu.nextLine();
       return texto;
   }
   
   public static int capturarEdad (String mensaje){
      Scanner captu =new Scanner(System.in);
       System.out.println(mensaje);
       return captu.nextInt();
       
   }
    public static double capturarSalario (String mensaje){
      Scanner captu =new Scanner(System.in);
       System.out.println(mensaje);
       return captu.nextDouble();
       
   }
    
    
}
