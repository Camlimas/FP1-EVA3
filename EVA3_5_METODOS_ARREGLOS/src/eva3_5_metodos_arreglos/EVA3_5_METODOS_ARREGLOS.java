/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_5_metodos_arreglos;

/**
 *
 * @author invitado
 */
public class EVA3_5_METODOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String diasSemana[] = {"Lunes","Martes","Miercoles",
      "Jueves","Virernes","Sabado","Domingo"};
      imprimirArreglo(diasSemana);
      
      String meses[]={"Enero","Febrero","Marzo","Abril","Mayo",
      "Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
      imprimirArreglo(meses);
      
      int billetes[]={20,50,100,200,500,1000};
      imprimirBilletes(billetes);
    }
    
    //IMPRIMIR ARREGLO DE CADENA
    
    public static void imprimirArreglo(String[] arreglo){
    for(int i=0;i<arreglo.length;i++)
        System.out.println(arreglo [i]);
    }
    
    public static void imprimirBilletes(int[] arreglo){
        for(int i=0;i<arreglo.length;i++)
        System.out.println(arreglo [i]);
    } 
}
