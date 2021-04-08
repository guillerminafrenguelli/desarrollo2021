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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int Numero;
        System.out.print("Introduce nuevo numero: ");
        Numero = entrada.nextInt();
        if (Numero%2==0)
        System.out.println("Par");
        else
        System.out.println("impar");
        
    }
    
}
