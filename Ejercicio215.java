/*(Aritmética) Escriba una aplicación que pida al usuario que escriba dos números, que obtenga los números 
del usuario e imprima la suma, producto, diferencia y cociente (división) de los números.*/

import java.util.Scanner;

public class Ejercicio215 
{
    public static void main(String[] args)
    {
        Scanner entrada=new Scanner(System.in);

        int num1, num2, suma, resta, mult, div;
        
        System.out.print("Ingrese el primer numero: ");
        num1= entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2= entrada.nextInt();

        suma= num1+num2;
        resta= num1-num2;
        mult= num1*num2;
        div=num1/num2;

        System.out.printf("La suma de estos numeros es: %d%n", suma);
        System.out.printf("La resta de estos numeros es: %d%n", resta);
        System.out.printf("La multiplicacion de estos numeros es: %d%n", mult);
        System.out.printf("La division de estos numeros es: %d%n", div);
    } 
}
