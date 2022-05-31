import java.util.Scanner;
 
public class Ejercicio233 {
 
 public static void main(String[] args) 
 {
    Scanner entrada = new Scanner(System.in);
  
    double peso,altura, imc;
    System.out.println("Ingrese su peso en kilogramos: ");
    peso = entrada.nextDouble();
    System.out.println("Ingrese su altura en metros: ");
    altura =entrada.nextDouble();
  
    imc=peso/(altura*altura);
  
    if (imc< 18.5) 
    System.out.printf("su indice de masa corporal es %f, tiene bajo peso", imc);
 
    else if (imc > 18.5 && imc < 24.9) 
    System.out.printf("su indice de masa corporal es %f, su peso es NORMAL", imc);
  
    else if (imc<25 && imc<29.9) 
    System.out.printf("su indice de masa corporal es %f, tiene sobrepeso", imc);
 
    else
    System.out.printf("su indice de masa corporal es %f, tiene obesidad", imc);
 }
 
}