/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

/**
 *
 * @author pc07
 */
public class ejercicio16_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int num=1;
        
        for( int i=0; i<=100; i++){
            if  (num%2==0 && num%3==0){
                System.out.println(num);
        }
        num++;
    }
    
}
