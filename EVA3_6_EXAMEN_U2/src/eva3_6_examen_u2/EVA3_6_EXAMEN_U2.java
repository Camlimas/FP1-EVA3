/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_6_examen_u2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_6_EXAMEN_U2 {
    public static final int PIEDRA =1;
    public static final int PAPEL =2;
    public static final int TIJERA =3;
    public static final int EMPATE =0;
    public static final int GANA =1;
    public static final int PIEDRE =2;
 
    public static void main(String[] args) {
     int jugadaUsu;
     int jugadaCom;
     int resuJugada;
     do{
     jugadaUsu= capturarJugada ("Introduce la jugada (1-PIEDRA , 2- PAPEL, 3-TIJERA, 0-SALIR)");
         jugadaCom =JugadaComp();
         resuJugada =evaluarJugadas(jugadaUsu ,jugadaCom);
        
     }while (jugadaUsu !=0);
        
    }
    
    //CAPTURAR DATOS DEL JUGADOR 
    public static int capturarJugada(String mensaje){
        Scanner captu = new Scanner (System.in);
        int resu=captu.nextInt ();
        return resu;
    
    }
    
    //GENERAR JUGADA DE LA COMPUTADORA
    public static int JugadaComp(){
    int resu;
    double valor =Math.random();
    if ((valor >=0)&& (valor < 0.3))
        resu =1; //piedra
    else if((valor >=0.3)&& (valor < 0.6))
        resu=2;//papel
    else
        resu =3;//tijera
    return resu;
    }
    
    //EVALUAR JUGADAS: 0-EMPATE,1-GANO, 2-PERDIO
    public static int evaluarJugadas(int jugadaU, int jugadaC){
     //9 POSIBLES COMBINACIONES
        int resu;
                
        if((jugadaU == PIEDRA )&& (jugadaC == PIEDRA))
            resu =EMPATE;
        else if((jugadaU == PIEDRA )&& (jugadaC ==PAPEL))
            resu = PIEDRE;
        else if((jugadaU == PIEDRA )&& (jugadaC ==TIJERA))
             resu = GANA;
        else if((jugadaU == PAPEL )&& (jugadaC == PIEDRA))
             resu = GANA;
        else if((jugadaU == PAPEL )&& (jugadaC == PAPEL))
             resu = EMPATE;
        else if((jugadaU == PAPEL )&& (jugadaC ==TIJERA))
             resu = GANA;
        else if((jugadaU == TIJERA)&& (jugadaC ==PIEDRA))
             resu = PIEDRE;
        else if((jugadaU == TIJERA )&& (jugadaC ==PAPEL))
             resu = PIEDRE;
        else
             resu = GANA;
         return resu; 
        }
        
    
      
}
