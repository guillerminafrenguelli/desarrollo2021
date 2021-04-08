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
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int i;
        int numero;
        System.out.println("Ingrese un numero");
        numero = entrada.nextInt();
        for( i=0; i<numero; i++)
            System.out.println(i);
        
    }
    
}
