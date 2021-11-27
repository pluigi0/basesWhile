
package Mientras;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*

 */
public class Mientras {
    public static void main(String[] args) {
        int i =1; //iterador
        int contador; //contador
        Scanner entrada = new Scanner (System.in);
        
        contador = Integer.parseInt(JOptionPane.showInputDialog("Hasta que numero desea imprimir"));
        
        
        while (i <= contador){
            System.out.println(i);;  
            i ++;
        } 
        
    }
}
