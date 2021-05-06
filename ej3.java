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
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        char caracter;
        System.out.println("ingrese un caracter y le dire si es vocal: ");
        caracter=entrada.next().charAt(0); 
        switch(caracter)
        { 
        case 'a' : System.out.println("el caracter es una vocal, es la letra A");
        break;
        case 'e' : System.out.println("el caracter es una vocal, es la letra E");
        break;
        case 'i' : System.out.println("el caracter es una vocal, es la letra I");
        break;
        case 'o' : System.out.println("el caracter es una vocal, es la letra O");
        break;
        case 'u' : System.out.println("el caracter es una vocal, es la letra U");
        break;
        default: System.out.println("el caracter NO es una vocal");
        break;
}
}
}