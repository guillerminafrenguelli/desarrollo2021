
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc07
 */
public class ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado =new Scanner(System.in);
        int num;
        System.out.print("Introduce un numero, y luego se mostraran los multiplos de 6, hasta llegar al numero ingresado: ");
        num = teclado.nextInt();
        
        for ( int i=0; i<=num; i++){
            if (i%6==0){
                System.out.println (i);
        } 
    }
    }
    
}
