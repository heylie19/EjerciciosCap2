/*Escriba una aplicación que muestre los equivalentes enteros de algunas letras en mayúsculas, 
en minúsculas, dígitos y símbolos especiales. Muestre los equivalentes enteros de los 
siguientes caracteres: A B C a b c 0 1 2 $ * + / y el carácter en blanco.*/

public class Ejercicio229 
{
    public static void main(String arg[])
    {         
        System.out.println("Aqui algunos valores ASCII: ");
        System.out.printf("El valor de %c, es: %d\n", 'A', ((int) 'A'));
        System.out.printf("El valor de %c, es: %d\n", 'B', ((int) 'B'));
        System.out.printf("El valor de %c, es: %d\n", 'C', ((int) 'C'));
        System.out.printf("El valor de %c, es: %d\n", 'a', ((int) 'a'));
        System.out.printf("El valor de %c, es: %d\n", 'b', ((int) 'b'));
        System.out.printf("El valor de %c, es: %d\n", 'c', ((int) 'c'));
        System.out.printf("El valor de %c, es: %d\n", '0', ((int) '0'));
        System.out.printf("El valor de %c, es: %d\n", '1', ((int) '1'));
        System.out.printf("El valor de %c, es: %d\n", '2', ((int) '2'));
        System.out.printf("El valor de %c, es: %d\n", '$', ((int) '$'));
        System.out.printf("El valor de %c, es: %d\n", '*', ((int) '*'));
        System.out.printf("El valor de %c, es: %d\n", '+', ((int) '+'));
        System.out.printf("El valor de %c, es: %d\n", '/', ((int) '/'));
        System.out.printf("El valor de caracter en blanco, %c es: %d\n", ' ', ((int) ' '));
    }        
}  

