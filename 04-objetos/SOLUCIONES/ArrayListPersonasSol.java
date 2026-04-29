import java.util.ArrayList;

/**
 * EJERCICIO 2: ArrayList de Personas (SOLUCIÓN)
 */
public class ArrayListPersonasSol {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();

        // Agregar 5 personas
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("María", 30));
        personas.add(new Persona("Pedro", 16));
        personas.add(new Persona("Ana", 22));
        personas.add(new Persona("Carlos", 17));

        // Mostrar todas
        System.out.println("=== TODAS ===");
        for (Persona p : personas) {
            System.out.println(p.getInfo());
        }

        // Buscar por nombre
        System.out.println("\n=== BUSCAR ===");
        String buscar = "María";
        boolean encontrado = false;
        for (Persona p : personas) {
            if (p.getNombre().equals(buscar)) {
                System.out.println("✅ Encontrada: " + p.getInfo());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("❌ No encontrada");
        }

        // Filtrar adultos
        System.out.println("\n=== ADULTOS ===");
        ArrayList<Persona> adultos = new ArrayList<>();
        for (Persona p : personas) {
            if (p.esAdulto()) {
                adultos.add(p);
            }
        }
        System.out.println("Total adultos: " + adultos.size());
        for (Persona p : adultos) {
            System.out.println(p.getInfo());
        }
    }
}
