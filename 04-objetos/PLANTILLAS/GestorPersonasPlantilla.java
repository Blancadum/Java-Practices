import java.util.ArrayList;
import java.util.Scanner;

/**
 * EJERCICIO 5: Gestor Personas (PLANTILLA - INTEGRACIÓN)
 */
public class GestorPersonasPlantilla {
    public static void main(String[] args) {
        // PASO 1: Scanner y ArrayList
        // TODO: Scanner scanner = new Scanner(System.in);
        // TODO: ArrayList<PersonaPlantilla> personas = new ArrayList<>();
        // TODO: boolean salir = false;

        // PASO 2: While menú
        // TODO: while (!salir) {
        // TODO:     System.out.println("\n=== GESTOR DE PERSONAS ===");
        // TODO:     System.out.println("1. Agregar");
        // TODO:     System.out.println("2. Ver todas");
        // TODO:     System.out.println("3. Buscar");
        // TODO:     System.out.println("4. Mostrar adultos");
        // TODO:     System.out.println("5. Eliminar");
        // TODO:     System.out.println("6. Salir");
        // TODO:     System.out.println("Elige: ");
        // TODO:     int opcion = scanner.nextInt();
        // TODO:     scanner.nextLine();

        // PASO 3: Switch
        // TODO:     switch (opcion) {
        // TODO:         case 1:
        // TODO:             System.out.println("Nombre: ");
        // TODO:             String nombre = scanner.nextLine();
        // TODO:             System.out.println("Edad: ");
        // TODO:             int edad = scanner.nextInt();
        // TODO:             scanner.nextLine();
        // TODO:             personas.add(new PersonaPlantilla(nombre, edad));
        // TODO:             System.out.println("✅ Agregada");
        // TODO:             break;

        // TODO:         case 2:
        // TODO:             System.out.println("=== PERSONAS ===");
        // TODO:             for (PersonaPlantilla p : personas) {
        // TODO:                 System.out.println(p.getInfo());
        // TODO:             }
        // TODO:             break;

        // TODO:         case 3:
        // TODO:             System.out.println("Nombre a buscar: ");
        // TODO:             String buscar = scanner.nextLine();
        // TODO:             boolean encontrada = false;
        // TODO:             for (PersonaPlantilla p : personas) {
        // TODO:                 if (p.getNombre().equals(buscar)) {
        // TODO:                     System.out.println("✅ Encontrada: " + p.getInfo());
        // TODO:                     encontrada = true;
        // TODO:                 }
        // TODO:             }
        // TODO:             if (!encontrada) System.out.println("❌ No encontrada");
        // TODO:             break;

        // TODO:         case 4:
        // TODO:             System.out.println("=== ADULTOS ===");
        // TODO:             int count = 0;
        // TODO:             for (PersonaPlantilla p : personas) {
        // TODO:                 if (p.esAdulto()) {
        // TODO:                     System.out.println(p.getInfo());
        // TODO:                     count++;
        // TODO:                 }
        // TODO:             }
        // TODO:             System.out.println("Total: " + count);
        // TODO:             break;

        // TODO:         case 5:
        // TODO:             System.out.println("Nombre a eliminar: ");
        // TODO:             String eliminar = scanner.nextLine();
        // TODO:             for (int i = 0; i < personas.size(); i++) {
        // TODO:                 if (personas.get(i).getNombre().equals(eliminar)) {
        // TODO:                     personas.remove(i);
        // TODO:                     System.out.println("✅ Eliminada");
        // TODO:                     break;
        // TODO:                 }
        // TODO:             }
        // TODO:             break;

        // TODO:         case 6:
        // TODO:             salir = true;
        // TODO:             System.out.println("👋 Adiós");
        // TODO:             break;

        // TODO:         default:
        // TODO:             System.out.println("❌ Opción no válida");
        // TODO:     }
        // TODO: }

        // PASO 4: Cerrar scanner
        // TODO: scanner.close();
    }
}
