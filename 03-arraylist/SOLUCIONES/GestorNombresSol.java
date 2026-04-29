import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * EJERCICIO 6: Gestor Nombres (SOLUCIÓN)
 *
 * Menú interactivo: agregar, ver ordenados, buscar, eliminar
 */
public class GestorNombresSol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== GESTOR DE NOMBRES ===");
            System.out.println("1. Agregar");
            System.out.println("2. Ver (ordenados)");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");
            System.out.println("Elige: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpia buffer

            switch (opcion) {
                case 1:
                    agregar(scanner, nombres);
                    break;
                case 2:
                    ver(nombres);
                    break;
                case 3:
                    buscar(scanner, nombres);
                    break;
                case 4:
                    eliminar(scanner, nombres);
                    break;
                case 5:
                    salir = true;
                    System.out.println("👋 Adiós");
                    break;
                default:
                    System.out.println("❌ Opción no válida");
            }
        }

        scanner.close();
    }

    private static void agregar(Scanner scanner, ArrayList<String> nombres) {
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        nombres.add(nombre);
        System.out.println("✅ Agregado");
    }

    private static void ver(ArrayList<String> nombres) {
        if (nombres.isEmpty()) {
            System.out.println("📭 No hay nombres");
            return;
        }

        ArrayList<String> copia = new ArrayList<>(nombres);
        Collections.sort(copia);

        System.out.println("=== NOMBRES ===");
        for (int i = 0; i < copia.size(); i++) {
            System.out.println((i + 1) + ". " + copia.get(i));
        }
    }

    private static void buscar(Scanner scanner, ArrayList<String> nombres) {
        System.out.println("Buscar: ");
        String nombre = scanner.nextLine();

        int posicion = nombres.indexOf(nombre);

        if (posicion != -1) {
            System.out.println("✅ Encontrado en posición " + posicion);
        } else {
            System.out.println("❌ No encontrado");
        }
    }

    private static void eliminar(Scanner scanner, ArrayList<String> nombres) {
        System.out.println("Nombre a eliminar: ");
        String nombre = scanner.nextLine();

        if (nombres.remove(nombre)) {
            System.out.println("✅ Eliminado");
        } else {
            System.out.println("❌ No encontrado");
        }
    }
}
