/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.lang.System.out;
import java.util.Scanner;
/**
 *
 * @author pc07
 */
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int radio;
        System.out.println("ingrese el radio");
        radio = entrada.nextInt();
        float PI= (float) 3.14159;
        int area =( int) PI*radio^2;
        int longitud = (int) (2*PI*radio);
        System.out.println("la longitud es:" +longitud);
        System.out.println("el area es:" +area);
    }
    
}
