import java.util.Scanner;

/**
 * EJERCICIO 4: Calculador de IMC (Índice de Masa Corporal) (SOLUCIÓN)
 *
 * Fórmula: IMC = peso(kg) / altura(m)²
 * Categorías:
 * - IMC < 18.5: Bajo peso
 * - 18.5 ≤ IMC < 25: Peso normal
 * - 25 ≤ IMC < 30: Sobrepeso
 * - IMC ≥ 30: Obesidad
 *
 * Concepto: Scanner + validación + condicionales + cálculos
 */
public class IMCSol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir nombre
        System.out.println("¿Cuál es tu nombre?");
        String nombre = scanner.nextLine();

        // 2. Pedir peso
        System.out.println("¿Cuál es tu peso (kg)?");
        double peso = scanner.nextDouble();

        // 3. Pedir altura
        System.out.println("¿Cuál es tu altura (m)? (ej: 1.75)");
        double altura = scanner.nextDouble();
        scanner.nextLine();  // Limpiar buffer ← IMPORTANTE

        // 4. Validar datos
        if (peso <= 0 || altura <= 0) {
            System.out.println("❌ Error: El peso y altura deben ser mayores a 0");
            scanner.close();
            return;
        }

        // 5. Calcular IMC
        double imc = peso / (altura * altura);

        // 6. Determinar categoría
        String categoria;
        if (imc < 18.5) {
            categoria = "Bajo peso";
        } else if (imc < 25) {
            categoria = "Peso normal";
        } else if (imc < 30) {
            categoria = "Sobrepeso";
        } else {
            categoria = "Obesidad";
        }

        // 7. Mostrar resultado
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("IMC: " + String.format("%.2f", imc));
        System.out.println("Categoría: " + categoria);

        scanner.close();
    }
}
