
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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado =new Scanner(System.in);
        Double HorasDeTrabajo = null;
        Double PagoPorHoras = null;
        Double SueldoPorMes;
        Double SueldoPorAño;
        
        System.out.println("Horas de trabajo:");
        HorasDeTrabajo=teclado.nextDouble();
        System.out.println("Pago por hora:");
        PagoPorHoras=teclado.nextDouble();
        SueldoPorMes= HorasDeTrabajo*PagoPorHoras;
        SueldoPorAño= SueldoPorMes*12;
        
        System.out.println("Pago por mes: "+SueldoPorMes);
        System.out.println("Pago por año: "+SueldoPorAño);
        
        
    }
    
}
