import java.util.ArrayList;
import java.util.Scanner;

/**
 * EJERCICIO 5: Gestor Personas (SOLUCIÓN - INTEGRACIÓN)
 *
 * Menú completo: agregar, ver, buscar, mostrar adultos, eliminar
 */
public class GestorPersonasSol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();

        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== GESTOR DE PERSONAS ===");
            System.out.println("1. Agregar persona");
            System.out.println("2. Ver todas");
            System.out.println("3. Buscar");
            System.out.println("4. Mostrar adultos");
            System.out.println("5. Eliminar");
            System.out.println("6. Salir");
            System.out.println("Elige: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpia buffer

            switch (opcion) {
                case 1:
                    agregar(scanner, personas);
                    break;
                case 2:
                    verTodas(personas);
                    break;
                case 3:
                    buscar(scanner, personas);
                    break;
                case 4:
                    mostrarAdultos(personas);
                    break;
                case 5:
                    eliminar(scanner, personas);
                    break;
                case 6:
                    salir = true;
                    System.out.println("👋 Adiós");
                    break;
                default:
                    System.out.println("❌ Opción no válida");
            }
        }

        scanner.close();
    }

    private static void agregar(Scanner scanner, ArrayList<Persona> personas) {
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        personas.add(new Persona(nombre, edad));
        System.out.println("✅ Agregada");
    }

    private static void verTodas(ArrayList<Persona> personas) {
        if (personas.isEmpty()) {
            System.out.println("📭 No hay personas");
            return;
        }

        System.out.println("=== PERSONAS ===");
        for (Persona p : personas) {
            System.out.println(p.getInfo());
        }
    }

    private static void buscar(Scanner scanner, ArrayList<Persona> personas) {
        System.out.println("Nombre a buscar: ");
        String nombre = scanner.nextLine();

        boolean encontrada = false;
        for (Persona p : personas) {
            if (p.getNombre().equals(nombre)) {
                System.out.println("✅ Encontrada: " + p.getInfo());
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("❌ No encontrada");
        }
    }

    private static void mostrarAdultos(ArrayList<Persona> personas) {
        ArrayList<Persona> adultos = new ArrayList<>();

        for (Persona p : personas) {
            if (p.esAdulto()) {
                adultos.add(p);
            }
        }

        if (adultos.isEmpty()) {
            System.out.println("📭 No hay adultos");
        } else {
            System.out.println("=== ADULTOS (" + adultos.size() + ") ===");
            for (Persona p : adultos) {
                System.out.println(p.getInfo());
            }
        }
    }

    private static void eliminar(Scanner scanner, ArrayList<Persona> personas) {
        System.out.println("Nombre a eliminar: ");
        String nombre = scanner.nextLine();

        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getNombre().equals(nombre)) {
                personas.remove(i);
                System.out.println("✅ Eliminada");
                return;
            }
        }

        System.out.println("❌ No encontrada");
    }
}
