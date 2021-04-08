/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author pc07
 */
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("ingrese un numero: ");
        numero = entrada.nextInt();
        int i=1;
        System.out.println("numeros del 1 al 100: ");
        do{
            System.out.println(i);
            i++;
         }  
        while(i<numero);
    }
    
}
