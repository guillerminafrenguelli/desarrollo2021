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
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int km;
        int hora;
        System.out.println("ingrese los km: ");
        km = entrada.nextInt();
        System.out.println("ingrese las horas recorridas en esos km: ");
        hora = entrada.nextInt();
        int metros=km*100;
        int segundos=hora*60;
        System.out.println("velocidad en metros sobre segundos:" +metros+"/"+segundos);
    
    }
    
}
