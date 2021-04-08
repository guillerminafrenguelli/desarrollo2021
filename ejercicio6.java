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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int Numero;
        System.out.print("Introduce numero entero: ");
        Numero = entrada.nextInt();
        if (Numero%10==0)
        System.out.println("multiplo de 10");
        else 
        System.out.println("no es multiplo de 1o");
    }
    
}
