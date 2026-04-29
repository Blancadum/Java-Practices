import java.util.ArrayList;

/**
 * EJERCICIO 2: Buscar Número (SOLUCIÓN)
 *
 * Buscar si un número existe y mostrar su posición
 */
public class BuscarNumeroSol {
    public static void main(String[] args) {
        // Crear ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(25);
        numeros.add(15);
        numeros.add(30);
        numeros.add(20);

        // Número a buscar
        int numeroBuscado = 15;

        // Buscar usando indexOf
        int posicion = numeros.indexOf(numeroBuscado);

        // Mostrar resultado
        System.out.println("Buscando: " + numeroBuscado);

        if (posicion != -1) {
            System.out.println("✅ Encontrado en posición " + posicion);
        } else {
            System.out.println("❌ No encontrado");
        }
    }
}
