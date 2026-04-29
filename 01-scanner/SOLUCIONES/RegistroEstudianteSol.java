import java.util.Scanner;

/**
 * EJERCICIO 7: Registro de Estudiante (SOLUCIÓN)
 *
 * Registra datos de un estudiante:
 * - Nombre (String)
 * - Edad (int con validación)
 * - Nota promedio (double)
 * - ¿Beca? (boolean)
 *
 * Concepto: Scanner múltiples tipos + validación completa
 */
public class RegistroEstudianteSol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir nombre
        System.out.println("=== REGISTRO DE ESTUDIANTE ===\n");
        System.out.println("Nombre:");
        String nombre = scanner.nextLine();

        // 2. Pedir edad (con validación)
        int edad = -1;
        while (edad == -1) {
            System.out.println("Edad (15-80):");
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                scanner.nextLine();  // Limpiar buffer

                if (input >= 15 && input <= 80) {
                    edad = input;
                } else {
                    System.out.println("❌ La edad debe estar entre 15 y 80");
                }
            } else {
                scanner.nextLine();  // Limpiar entrada inválida
                System.out.println("❌ Error: Debes introducir un número");
            }
        }

        // 3. Pedir nota promedio
        System.out.println("Nota promedio (0.0-10.0):");
        double nota = scanner.nextDouble();
        scanner.nextLine();  // Limpiar buffer

        // 4. Pedir si tiene beca
        System.out.println("¿Tienes beca? (s/n):");
        String respuesta = scanner.nextLine().toLowerCase();
        boolean tieneBeca = respuesta.equals("s");

        // 5. Mostrar resumen
        System.out.println("\n=== RESUMEN ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Nota: " + String.format("%.2f", nota));
        System.out.println("Beca: " + (tieneBeca ? "Sí" : "No"));

        // 6. Determinar estado
        String estado;
        if (nota >= 9) {
            estado = "Excelente";
        } else if (nota >= 7) {
            estado = "Bueno";
        } else if (nota >= 5) {
            estado = "Aprobado";
        } else {
            estado = "Suspenso";
        }

        System.out.println("Estado: " + estado);

        // 7. Si tiene beca y nota buena, felicitar
        if (tieneBeca && nota >= 8) {
            System.out.println("🎉 ¡Felicidades! Estás en el programa de honor");
        }

        scanner.close();
    }
}
