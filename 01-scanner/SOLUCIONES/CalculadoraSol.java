import java.util.Scanner;

/**
 * EJERCICIO 3: Calculadora básica (SOLUCIÓN)
 *
 * Pide dos números y un operador (+, -, *, /)
 * Realiza la operación y muestra el resultado
 *
 * Concepto: Scanner para múltiples tipos + Switch
 */
public class CalculadoraSol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir primer número
        System.out.println("Introduce primer número:");
        double numero1 = scanner.nextDouble();

        // 2. Pedir operador
        System.out.println("Introduce operador (+, -, *, /):");
        char operador = scanner.next().charAt(0);  // Leer un carácter
        scanner.nextLine();  // Limpiar buffer ← IMPORTANTE

        // 3. Pedir segundo número
        System.out.println("Introduce segundo número:");
        double numero2 = scanner.nextDouble();

        // 4. Calcular resultado
        double resultado = 0;
        boolean valido = true;

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("❌ Error: No se puede dividir entre 0");
                    valido = false;
                }
                break;
            default:
                System.out.println("❌ Error: Operador no válido");
                valido = false;
                break;
        }

        // 5. Mostrar resultado
        if (valido) {
            System.out.println(numero1 + " " + operador + " " + numero2 + " = " + resultado);
        }

        scanner.close();
    }
}
