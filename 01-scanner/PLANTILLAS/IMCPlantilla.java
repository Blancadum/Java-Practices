import java.util.Scanner;

/**
 * EJERCICIO 4: Calculador de IMC (PLANTILLA)
 *
 * Fórmula: IMC = peso / (altura * altura)
 * Clasificación: < 18.5 (Bajo), < 25 (Normal), < 30 (Sobrepeso), >= 30 (Obesidad)
 *
 * Sigue los pasos comentados. NO MIRES IMCSol.java
 */
public class IMCPlantilla {
    public static void main(String[] args) {
        // PASO 1: Crea Scanner
        // TODO: Scanner scanner = ...

        // PASO 2: Pide nombre
        // TODO: System.out.println("¿Cuál es tu nombre?");
        // TODO: String nombre = scanner.nextLine();

        // PASO 3: Pide peso (kg)
        // TODO: System.out.println("¿Cuál es tu peso (kg)?");
        // TODO: double peso = scanner.nextDouble();

        // PASO 4: Pide altura (metros, ej: 1.75)
        // TODO: System.out.println("¿Cuál es tu altura (m)? (ej: 1.75)");
        // TODO: double altura = scanner.nextDouble();
        // TODO: scanner.nextLine();  // Limpia buffer

        // PASO 5: Valida que peso y altura sean > 0
        // PISTA: if (peso <= 0 || altura <= 0) { ... scanner.close(); return; }
        // TODO: if (...) {
        // TODO:     System.out.println("❌ Error: El peso y altura deben ser mayores a 0");
        // TODO:     scanner.close();
        // TODO:     return;
        // TODO: }

        // PASO 6: Calcula IMC
        // TODO: double imc = peso / (altura * altura);

        // PASO 7: Determina categoría usando IF-ELSE IF
        // PISTA: Usa String categoria; y if-else if para 4 rangos
        // TODO: String categoria;
        // TODO: if (imc < 18.5) { categoria = "Bajo peso"; }
        // TODO: else if (imc < 25) { categoria = "Peso normal"; }
        // TODO: else if (imc < 30) { categoria = "Sobrepeso"; }
        // TODO: else { categoria = "Obesidad"; }

        // PASO 8: Muestra resultado formateado
        // PISTA: String.format("%.2f", imc) para 2 decimales
        // TODO: System.out.println("\n=== RESULTADO ===");
        // TODO: System.out.println("Nombre: " + nombre);
        // TODO: System.out.println("Peso: " + peso + " kg");
        // TODO: System.out.println("Altura: " + altura + " m");
        // TODO: System.out.println("IMC: " + String.format("%.2f", imc));
        // TODO: System.out.println("Categoría: " + categoria);

        // PASO 9: Cierra Scanner
        // TODO: scanner.close();
    }
}
