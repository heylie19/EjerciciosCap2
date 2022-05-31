import java.util.Scanner;

public class Ejercicio233 
{
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        
        int peso,est;
        float imc;
        
        System.out.println("Ingrese su peso en Kilogramos ");
        peso= entrada.nextInt();
        System.out.println("Ingrese su estatura en metros");
        est= entrada.nextInt();
        
        imc= peso/(est*est);
        
        System.out.printf("SU IMC ES: %d%n ", imc);
         
        if (imc<18.5) 
            System.out.println("BAJO PESO");
        else if (imc>=18.5 && imc<=24.9) 
            System.out.println("NORMAL");
        else if (imc>=25 && imc<=29.9) 
            System.out.println("SOBREPESO");
        else {
            System.out.println("OBESIDAD");
        }
    }
}
