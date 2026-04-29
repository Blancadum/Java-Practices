import java.util.ArrayList;

/**
 * EJERCICIO 1: Lista Números (SOLUCIÓN)
 *
 * Crear ArrayList, agregar números y mostrar con índices
 */
public class ListaNumerossol {
    public static void main(String[] args) {
        // Crear ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();

        // Agregar 5 números
        numeros.add(10);
        numeros.add(25);
        numeros.add(15);
        numeros.add(30);
        numeros.add(20);

        // Mostrar encabezado
        System.out.println("=== LISTA DE NÚMEROS ===");

        // Mostrar con índices
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(i + ". " + numeros.get(i));
        }

        // Mostrar tamaño
        System.out.println("\nTotal: " + numeros.size());
    }
}
