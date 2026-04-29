/**
 * EJERCICIO 1: Crear Persona (SOLUCIÓN)
 */
public class CrearPersonaSol {
    public static void main(String[] args) {
        // Crear 3 objetos
        Persona p1 = new Persona("Juan", 25);
        Persona p2 = new Persona("María", 30);
        Persona p3 = new Persona("Pedro", 16);

        // Mostrar info
        System.out.println("=== PERSONAS ===");
        System.out.println(p1.getInfo());
        System.out.println(p2.getInfo());
        System.out.println(p3.getInfo());

        // Mostrar si son adultos
        System.out.println("\n=== ADULTOS ===");
        System.out.println(p1.getNombre() + ": " + (p1.esAdulto() ? "Sí" : "No"));
        System.out.println(p2.getNombre() + ": " + (p2.esAdulto() ? "Sí" : "No"));
        System.out.println(p3.getNombre() + ": " + (p3.esAdulto() ? "Sí" : "No"));
    }
}
