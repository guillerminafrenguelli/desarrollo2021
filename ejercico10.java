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
public class ejercico10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("ingrese un numero: ");
        numero = entrada.nextInt();
        int i = 1;
        while(i<=numero){
            System.out.println(i);
            i++;
    }
   }
}
