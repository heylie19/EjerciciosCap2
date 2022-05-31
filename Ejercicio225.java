/*(Par o impar) Escriba una aplicación que lea un entero y que determine e imprima 
si es impar o par [sugerencia: use el operador residuo. Un número par 
es un múltiplo de 2. Cualquier múltiplo de 2 deja un residuo de 0 cuando se divide entre 2].*/

import java.util.Scanner;
public class Ejercicio225 
{
    public static void main(String[] args)
    {
        int numero;
        Scanner entrada = new Scanner(System.in);
          
        System.out.println("\nIntroduzca un numero");
        numero = entrada.nextInt();
          
        if( 0 == numero % 2 )
        System.out.printf("El numero %d es par.", numero);
          
        if ( 0 != numero % 2)
        System.out.printf("El numero %d es impar.", numero);
            
    }      
}    
