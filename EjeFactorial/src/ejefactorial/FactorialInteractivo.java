package ejefactorial;

public class FactorialInteractivo {
     public static long factorial(int n) {
        // Caso base: factorial de 0 es 1
        if (n == 0) {
            return 1;
        }
        
        // Caso recursivo: n! = n * (n-1)!
        return n * factorial(n - 1);
    }
    
    /**
     * Valida si el número es válido para calcular factorial
     */
    public static boolean esNumeroValido(int n) {
        return n >= 0 && n <= 20; // Limitamos a 20 porque factorial de 21 ya excede long
    }
    
    /**
     * Muestra el proceso paso a paso del cálculo
     */
    public static void mostrarProceso(int n) {
        System.out.println("\nProceso de calculo:");
        System.out.print(n + "! = ");
        
        for (int i = n; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
        }
        System.out.println(" = " + factorial(n));
    }
}
