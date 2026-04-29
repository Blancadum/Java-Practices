import java.util.Scanner;

/**
 * EJERCICIO 5: Validar edad (entrada repetida hasta válida) (SOLUCIÓN)
 *
 * Pide edad y valida:
 * - Que sea un número
 * - Que esté entre 0 y 150
 * Repite hasta que sea válido
 *
 * Concepto: while + hasNextInt() + validación
 */
public class ValidarEdadSol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad = -1;
        boolean valido = false;

        // Repetir hasta obtener una entrada válida
        while (!valido) {
            System.out.println("Introduce tu edad (0-150):");

            // Comprobar si es un número
            if (scanner.hasNextInt()) {
                edad = scanner.nextInt();
                scanner.nextLine();  // Limpiar buffer

                // Comprobar si está en rango
                if (edad >= 0 && edad <= 150) {
                    valido = true;
                    System.out.println("✅ Edad válida: " + edad);
                } else {
                    System.out.println("❌ Error: Debe estar entre 0 y 150");
                }
            } else {
                // Si no es número, limpiar entrada inválida
                System.out.println("❌ Error: Debes introducir un número");
                scanner.nextLine();  // Limpiar entrada inválida
            }
        }

        // Mostrar categoría por edad
        if (edad < 18) {
            System.out.println("Eres menor de edad");
        } else if (edad < 65) {
            System.out.println("Eres adulto");
        } else {
            System.out.println("Eres jubilado");
        }

        scanner.close();
    }
}
