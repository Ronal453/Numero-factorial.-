package ejefactorial;

import static ejefactorial.FactorialInteractivo.esNumeroValido;
import static ejefactorial.FactorialInteractivo.factorial;
import static ejefactorial.FactorialInteractivo.mostrarProceso;
import java.util.Scanner;


public class EjeFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("      CALCULADORA DE FACTORIAL");
        
        boolean continuar = true;
        
        while (continuar) {
            try {
                System.out.print("\nIngrese un numero entero (0-20): ");
                int numero = scanner.nextInt();
                
                // Validar el número
                if (!esNumeroValido(numero)) {
                    System.out.println("Error: Por favor ingrese un numero entre 0 y 20.");
                    continue;
                }
                
                // Calcular y mostrar resultado
                long resultado = factorial(numero);
                
                System.out.println("RESULTADO: " + numero + "! = " + resultado);
                
                // Mostrar proceso
                mostrarProceso(numero);
                
                
            } catch (Exception e) {
                System.out.println("Error: Por favor ingrese un número entero válido.");
                scanner.nextLine(); // Limpiar el buffer
                continue;
            }
            
            // Preguntar si quiere continuar
            System.out.print("\nDesea calcular otro factorial? (s/n): ");
            String respuesta = scanner.next();
            
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
                System.out.println("\nGracias por usar la calculadora de factorial!");
            }
        }
        
        scanner.close();
    }
}