import java.util.ArrayList;

/**
 * EJERCICIO 3: Ordenar Personas (SOLUCIÓN)
 */
public class OrdenarPersonasSol {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();

        // Agregar desordenado
        personas.add(new Persona("Carlos", 35));
        personas.add(new Persona("Ana", 22));
        personas.add(new Persona("Juan", 28));
        personas.add(new Persona("María", 25));

        // Mostrar ANTES
        System.out.println("=== ANTES (desordenado) ===");
        for (Persona p : personas) {
            System.out.println(p.getInfo());
        }

        // Ordenar por edad
        personas.sort((p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad()));

        // Mostrar DESPUÉS
        System.out.println("\n=== DESPUÉS (ordenado por edad) ===");
        for (Persona p : personas) {
            System.out.println(p.getInfo());
        }
    }
}
