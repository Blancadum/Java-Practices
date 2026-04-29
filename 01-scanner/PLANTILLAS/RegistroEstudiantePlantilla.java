import java.util.Scanner;

/**
 * EJERCICIO 6: Registro de Estudiante (PLANTILLA)
 *
 * Registra: nombre, edad (validada), nota, beca (s/n)
 * Muestra categoría por nota: Excelente (≥9), Bueno (≥7), Aprobado (≥5), Suspenso
 * Bonus: Si tiene beca y nota ≥8 → felicitar
 */
public class RegistroEstudiantePlantilla {
    public static void main(String[] args) {
        // PASO 1: Crea Scanner
        // TODO: Scanner scanner = ...

        // PASO 2: Pide nombre
        // TODO: System.out.println("=== REGISTRO DE ESTUDIANTE ===\n");
        // TODO: System.out.println("Nombre:");
        // TODO: String nombre = scanner.nextLine();

        // PASO 3: Pide edad CON VALIDACIÓN (como en ValidarEdad.java)
        // PISTA: while que repite hasta que edad sea válida (15-80)
        // TODO: int edad = -1;
        // TODO: while (edad == -1) {
        // TODO:     System.out.println("Edad (15-80):");
        // TODO:     if (scanner.hasNextInt()) {
        // TODO:         int input = scanner.nextInt();
        // TODO:         scanner.nextLine();
        // TODO:         if (input >= 15 && input <= 80) {
        // TODO:             edad = input;
        // TODO:         } else {
        // TODO:             System.out.println("❌ La edad debe estar entre 15 y 80");
        // TODO:         }
        // TODO:     } else {
        // TODO:         scanner.nextLine();
        // TODO:         System.out.println("❌ Error: Debes introducir un número");
        // TODO:     }
        // TODO: }

        // PASO 4: Pide nota promedio (0.0-10.0)
        // TODO: System.out.println("Nota promedio (0.0-10.0):");
        // TODO: double nota = scanner.nextDouble();
        // TODO: scanner.nextLine();  // Limpia buffer

        // PASO 5: Pide si tiene beca (s/n)
        // PISTA: Convierte a minúsculas con .toLowerCase()
        // TODO: System.out.println("¿Tienes beca? (s/n):");
        // TODO: String respuesta = scanner.nextLine().toLowerCase();
        // TODO: boolean tieneBeca = respuesta.equals("s");

        // PASO 6: Muestra resumen
        // PISTA: Usa String.format("%.2f", nota) para 2 decimales
        // PISTA: Usa operador ternario: (tieneBeca ? "Sí" : "No")
        // TODO: System.out.println("\n=== RESUMEN ===");
        // TODO: System.out.println("Nombre: " + nombre);
        // TODO: System.out.println("Edad: " + edad + " años");
        // TODO: System.out.println("Nota: " + String.format("%.2f", nota));
        // TODO: System.out.println("Beca: " + (tieneBeca ? "Sí" : "No"));

        // PASO 7: Determina estado por nota usando IF-ELSE IF
        // PISTA: 4 categorías (≥9, ≥7, ≥5, resto)
        // TODO: String estado;
        // TODO: if (nota >= 9) { estado = "Excelente"; }
        // TODO: else if (nota >= 7) { estado = "Bueno"; }
        // TODO: else if (nota >= 5) { estado = "Aprobado"; }
        // TODO: else { estado = "Suspenso"; }
        // TODO: System.out.println("Estado: " + estado);

        // PASO 8: BONUS - Felicita si beca Y nota ≥ 8
        // TODO: if (tieneBeca && nota >= 8) {
        // TODO:     System.out.println("🎉 ¡Felicidades! Estás en el programa de honor");
        // TODO: }

        // PASO 9: Cierra Scanner
        // TODO: scanner.close();
    }
}
