import java.util.ArrayList;
import java.util.Collections;

/**
 * EJERCICIO 3: Ordenar Números (SOLUCIÓN)
 *
 * Mostrar ArrayList desordenado y después ordenado
 */
public class OrdenarNumerosSol {
    public static void main(String[] args) {
        // Crear ArrayList desordenado
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(30);
        numeros.add(10);
        numeros.add(25);
        numeros.add(15);
        numeros.add(20);

        // Mostrar ANTES
        System.out.println("=== ANTES (desordenado) ===");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i));
            if (i < numeros.size() - 1) System.out.print(", ");
        }
        System.out.println();

        // Ordenar
        Collections.sort(numeros);

        // Mostrar DESPUÉS
        System.out.println("\n=== DESPUÉS (ordenado) ===");
        for (int num : numeros) {
            System.out.print(num);
            if (num != numeros.get(numeros.size() - 1)) System.out.print(", ");
        }
        System.out.println();
    }
}
