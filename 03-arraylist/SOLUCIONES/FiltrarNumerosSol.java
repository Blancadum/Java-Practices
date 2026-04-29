import java.util.ArrayList;

/**
 * EJERCICIO 4: Filtrar Números (SOLUCIÓN)
 *
 * Crear nuevo ArrayList solo con números mayores a 20
 */
public class FiltrarNumerosSol {
    public static void main(String[] args) {
        // ArrayList original
        ArrayList<Integer> original = new ArrayList<>();
        original.add(10);
        original.add(25);
        original.add(15);
        original.add(30);
        original.add(20);
        original.add(35);
        original.add(5);

        // ArrayList filtrado
        ArrayList<Integer> filtrados = new ArrayList<>();

        // Filtrar números mayores a 20
        for (int num : original) {
            if (num > 20) {
                filtrados.add(num);
            }
        }

        // Mostrar
        System.out.println("=== NÚMEROS MAYORES A 20 ===");
        for (int i = 0; i < filtrados.size(); i++) {
            System.out.print(filtrados.get(i));
            if (i < filtrados.size() - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
