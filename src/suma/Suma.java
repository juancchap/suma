
package suma;
import java.util.Scanner;
/**
 Autor: JUAN CARLOS CHAPARRO DOMINGUEZ
 */
public class Suma {

  
    public static void main(String[] args) {
        // Declaracion de variables como integer
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
