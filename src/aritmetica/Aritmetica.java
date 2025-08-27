
package aritmetica;
import java.util.Scanner;

public class Aritmetica {
    public static void main(String[] args) {
        //declarando variables
        double num1, num2, suma, promedio;
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
            System.out.println("Ingresar número 1:");
            num1=lectura.nextDouble();
            System.out.println("Ingresar número 2:");
            num2=lectura.nextDouble();
            System.out.println("RESULTADOS DE LA APLICACION:");
           // procesos de datos
           suma=num1+num2;
           promedio =suma/2;
           //salida de datos
           System.out.println("La suma es:"+suma);
           System.out.println("El promedio es:"+promedio);
           
    }
    
}
