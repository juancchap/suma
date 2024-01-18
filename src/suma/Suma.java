/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma;
import java.util.Scanner;
/**
 *
 * @author JUAN
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2,resultado;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        n1=entrada.nextInt();
        System.out.println("escribe un segundo numero: ");
        n2=entrada.nextInt();
        resultado=n1+n2;
        System.out.println("el resultado es: "+resultado);
        
    }
    
}
