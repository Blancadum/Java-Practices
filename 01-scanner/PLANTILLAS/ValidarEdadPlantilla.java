import java.util.Scanner;

/**
 * EJERCICIO 5: Validar edad (PLANTILLA)
 *
 * Pide edad y VALIDA:
 * - Que sea un número
 * - Que esté entre 0 y 150
 * Repite hasta válido.
 *
 * Concepto CLAVE: while + hasNextInt()
 */
public class ValidarEdadPlantilla {
    public static void main(String[] args) {
        // PASO 1: Crea Scanner
        // TODO: Scanner scanner = ...

        // PASO 2: Variables para guardar edad y bandera de validación
        // TODO: int edad = -1;
        // TODO: boolean valido = false;

        // PASO 3: BUCLE WHILE - Repite hasta que edad sea válida
        // PISTA: while (!valido) { ... }
        // TODO: while (!valido) {
        // TODO:     System.out.println("Introduce tu edad (0-150):");

        // PASO 4: Comprueba si el siguiente dato es un número
        // PISTA: scanner.hasNextInt() retorna true/false sin consumir entrada
        // TODO:     if (scanner.hasNextInt()) {
        // TODO:         edad = scanner.nextInt();
        // TODO:         scanner.nextLine();  // Limpia buffer

        // PASO 5: Si es número, valida que esté en rango (0-150)
        // TODO:         if (edad >= 0 && edad <= 150) {
        // TODO:             valido = true;
        // TODO:             System.out.println("✅ Edad válida: " + edad);
        // TODO:         } else {
        // TODO:             System.out.println("❌ Error: Debe estar entre 0 y 150");
        // TODO:         }
        // TODO:     } else {
        // TODO:         // Si NO es número, limpia la entrada y muestra error
        // TODO:         System.out.println("❌ Error: Debes introducir un número");
        // TODO:         scanner.nextLine();  // Limpia entrada inválida
        // TODO:     }
        // TODO: }

        // PASO 6: Después del bucle, determina categoría por edad
        // PISTA: if-else if para 3 categorías: menor (< 18), adulto (< 65), jubilado
        // TODO: if (edad < 18) { System.out.println("Eres menor de edad"); }
        // TODO: else if (edad < 65) { System.out.println("Eres adulto"); }
        // TODO: else { System.out.println("Eres jubilado"); }

        // PASO 7: Cierra Scanner
        // TODO: scanner.close();
    }
}
