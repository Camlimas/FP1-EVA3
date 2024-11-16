
package u2_examen_24550242;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author melan
 */
public class U2_EXAMEN_24550242 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Random random = new Random();
         int Em = 0, Gan = 0, Per= 0;
         
         System.out.println("¿Jugamos Piedra,Papel,Tijera?");
        System.out.println("1.Si");
        System.out.println("2.No");
        
         
        int NUM=scanner.nextInt();
        
        while(NUM==1){
          
            System.out.println("Elije Piedra, Papel o Tijeras!");
            System.out.println("1.Piedra");
            System.out.println("2.Papel");
            System.out.println("3.Tijeras");

            
            int NUM2 = scanner.nextInt();
            
            int COM = random.nextInt(3);
            System.out.println("Tu respuesta: " + NUM2);
            System.out.println("La de la computadora: " + COM);

            
            if (NUM2 == COM) {
                System.out.println("Lo siento, es un empate");
            Em++;
            
            } else if ((NUM2 == 1 && COM == 3) || (NUM2== 2 && COM == 1) ||(NUM2 == 3 && COM == 2)) { 
                System.out.println("Ganaste");
                Gan++;
           
            } else {
                System.out.println("Vuelve a intentarlo ");
                Per++;
                
            }
            
            System.out.println("Desea seguir jugando? ");
            System.out.println("1.Si ,2.No");
            NUM = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("CONTADOR FINAL ");
        System.out.println("Empate = " + Em);
        System.out.println("Tu = " + Gan);
        System.out.println("Computadora = " + Per);
       
    }
    
}
