import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * EJERCICIO 6: Gestor Nombres (PLANTILLA)
 *
 * Menú interactivo: agregar, ver ordenados, buscar, eliminar
 */
public class GestorNombresPlantilla {
    public static void main(String[] args) {
        // PASO 1: Scanner y ArrayList
        // TODO: Scanner scanner = new Scanner(System.in);
        // TODO: ArrayList<String> nombres = new ArrayList<>();

        // PASO 2: Variable para salir
        // TODO: boolean salir = false;

        // PASO 3: Menú while
        // TODO: while (!salir) {
        // TODO:     System.out.println("\n=== GESTOR DE NOMBRES ===");
        // TODO:     System.out.println("1. Agregar");
        // TODO:     System.out.println("2. Ver (ordenados)");
        // TODO:     System.out.println("3. Buscar");
        // TODO:     System.out.println("4. Eliminar");
        // TODO:     System.out.println("5. Salir");
        // TODO:     System.out.println("Elige: ");
        // TODO:     int opcion = scanner.nextInt();
        // TODO:     scanner.nextLine();  // Limpia buffer

        // PASO 4: Switch para opciones
        // TODO:     switch (opcion) {

        // CASO 1: Agregar
        // TODO:         case 1:
        // TODO:             System.out.println("Nombre: ");
        // TODO:             String nombre = scanner.nextLine();
        // TODO:             nombres.add(nombre);
        // TODO:             System.out.println("✅ Agregado");
        // TODO:             break;

        // CASO 2: Ver ordenados
        // PISTA: Collections.sort() modifica el ArrayList
        // PISTA: Mejor hacer copia para no modificar original
        // TODO:         case 2:
        // TODO:             if (nombres.isEmpty()) {
        // TODO:                 System.out.println("📭 No hay nombres");
        // TODO:             } else {
        // TODO:                 ArrayList<String> copia = new ArrayList<>(nombres);
        // TODO:                 Collections.sort(copia);
        // TODO:                 System.out.println("=== NOMBRES ===");
        // TODO:                 for (int i = 0; i < copia.size(); i++) {
        // TODO:                     System.out.println((i + 1) + ". " + copia.get(i));
        // TODO:                 }
        // TODO:             }
        // TODO:             break;

        // CASO 3: Buscar
        // TODO:         case 3:
        // TODO:             System.out.println("Buscar: ");
        // TODO:             String buscar = scanner.nextLine();
        // TODO:             int pos = nombres.indexOf(buscar);
        // TODO:             if (pos != -1) {
        // TODO:                 System.out.println("✅ Encontrado en posición " + pos);
        // TODO:             } else {
        // TODO:                 System.out.println("❌ No encontrado");
        // TODO:             }
        // TODO:             break;

        // CASO 4: Eliminar
        // PISTA: .remove(String) retorna boolean
        // TODO:         case 4:
        // TODO:             System.out.println("Nombre a eliminar: ");
        // TODO:             String eliminar = scanner.nextLine();
        // TODO:             if (nombres.remove(eliminar)) {
        // TODO:                 System.out.println("✅ Eliminado");
        // TODO:             } else {
        // TODO:                 System.out.println("❌ No encontrado");
        // TODO:             }
        // TODO:             break;

        // CASO 5: Salir
        // TODO:         case 5:
        // TODO:             salir = true;
        // TODO:             System.out.println("👋 Adiós");
        // TODO:             break;

        // CASO default
        // TODO:         default:
        // TODO:             System.out.println("❌ Opción no válida");
        // TODO:     }
        // TODO: }

        // PASO 5: Cerrar Scanner
        // TODO: scanner.close();
    }
}
