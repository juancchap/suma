package suma;

import java.util.Scanner;

/**
 * Autor: JUAN CARLOS CHAPARRO DOMINGUEZ
 */
public class Suma {

    public static void main(String[] args) {
        // Declaracion de variables como integer
        
        int n1, n2, resultado;

        //le pedimos al usuario que digite un numero
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un numero: ");

        //le pedimos al usuario que digite otro numero
        
        n1 = entrada.nextInt();
        System.out.println("escribe un segundo numero: ");

        //se realisa la operacion
        
        n2 = entrada.nextInt();
        resultado = n1 + n2;
        
        //imprimimos el resultado de la operacion
        
        System.out.println("el resultado es: " + resultado);

    }

}
