import java.util.Scanner;

/**
 * EJERCICIO 3: Calculadora básica (PLANTILLA)
 *
 * Sigue los pasos comentados para implementar tu solución.
 * NO MIRES CalculadoraSol.java hasta terminar.
 */
public class CalculadoraPlantilla {
    public static void main(String[] args) {
        // PASO 1: Crea el Scanner que lee de System.in
        // TODO: Scanner scanner = new Scanner(...);

        // PASO 2: Pide el primer número
        // TODO: System.out.println("Introduce primer número:");
        // TODO: double numero1 = scanner...();

        // PASO 3: Pide el operador
        // PISTA: Usa scanner.next().charAt(0) para leer un carácter
        // TODO: System.out.println("Introduce operador (+, -, *, /):");
        // TODO: char operador = scanner...
        // TODO: scanner.nextLine();  // ← Limpia el buffer

        // PASO 4: Pide el segundo número
        // TODO: System.out.println("Introduce segundo número:");
        // TODO: double numero2 = scanner...();

        // PASO 5: Crea variables para guardar resultado y validación
        // TODO: double resultado = 0;
        // TODO: boolean valido = true;

        // PASO 6: Usa SWITCH para cada operador
        // PISTA: Los casos son '+', '-', '*', '/'
        // TODO: switch (operador) {
        // TODO:     case '+': resultado = numero1 + numero2; break;
        // TODO:     case '-': ...
        // TODO:     case '*': ...
        // TODO:     case '/':
        // TODO:         if (numero2 != 0) { resultado = numero1 / numero2; }
        // TODO:         else { System.out.println("❌ Error: No se puede dividir entre 0"); valido = false; }
        // TODO:         break;
        // TODO:     default: System.out.println("❌ Error: Operador no válido"); valido = false;
        // TODO: }

        // PASO 7: Si es válido, muestra el resultado
        // TODO: if (valido) {
        // TODO:     System.out.println(numero1 + " " + operador + " " + numero2 + " = " + resultado);
        // TODO: }

        // PASO 8: Cierra el Scanner
        // TODO: scanner.close();
    }
}
