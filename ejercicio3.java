
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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner teclado =new Scanner(System.in);
      String nombreAlumno;
      double evaluacion;
      double evaluacion2;
      double evaluacionfinal;
      System.out.println("Nombre de alumno: ");
      nombreAlumno=teclado.nextLine();
      System.out.println("Nota 1°: Evaluacion");
      evaluacion=teclado.nextDouble();
      System.out.println("Nota 2°: Evaluacion");
      evaluacion2=teclado.nextDouble();
      evaluacionfinal=(evaluacion+evaluacion2)/2;
      System.out.println("Nota final: "+evaluacionfinal);
    }
    
}
