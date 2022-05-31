/*Aritmética: menor y mayor) Escriba una aplicación que reciba tres enteros del usuario y muestre la suma, 
promedio, producto, menor y mayor de esos números. 
[nota: el cálculo del promedio en este ejercicio debe dar como resultado una representación entera 
del promedio. Por lo tanto, si la suma de los valores es 7, el promedio debe ser 2, no 2.3333...].*/

import java.util.Scanner;

public class Ejercicio217 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int num1, num2, num3, suma, promedio, mult;

        System.out.println("Ingrese el primer numero:");
        num1= entrada.nextInt();

        System.out.println("Ingrese el segundo numero:\t");
        num2= entrada.nextInt();

        System.out.println("Ingrese el tercer numero:\t");
        num3= entrada.nextInt();

        suma= num1+num2+num3;
        promedio= suma/3;
        mult= num1*num2*num3;

        if(num1>num2 & num1>num3)
            System.out.printf("El numero mayor es: %d%n", num1);

        if(num2>num1 & num2>num3)
            System.out.printf("El numero mayor es: %d%n", num2);

        if(num3>num1 & num3>num2)
            System.out.printf("El numero mayor es: %d%n", num3);

        System.out.printf("La suma de los tres numeros es: %d%n", suma);
        System.out.printf("El promedio de los tres numeros es: %d%n", promedio);
        System.out.printf("La multiplicacion de los tres numeros es: %d%n", mult);
    }
}