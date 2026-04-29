import java.util.ArrayList;

/**
 * EJERCICIO 2: ArrayList de Personas (PLANTILLA)
 */
public class ArrayListPersonasPlantilla {
    public static void main(String[] args) {
        // PASO 1: Crear ArrayList
        // TODO: ArrayList<PersonaPlantilla> personas = new ArrayList<>();

        // PASO 2: Agregar 5 personas
        // TODO: personas.add(new PersonaPlantilla("Juan", 25));
        // TODO: personas.add(new PersonaPlantilla("María", 30));
        // TODO: personas.add(new PersonaPlantilla("Pedro", 16));
        // TODO: personas.add(new PersonaPlantilla("Ana", 22));
        // TODO: personas.add(new PersonaPlantilla("Carlos", 17));

        // PASO 3: Mostrar todas
        // TODO: System.out.println("=== TODAS ===");
        // TODO: for (PersonaPlantilla p : personas) {
        // TODO:     System.out.println(p.getInfo());
        // TODO: }

        // PASO 4: Buscar por nombre
        // TODO: System.out.println("\n=== BUSCAR ===");
        // TODO: String buscar = "María";
        // TODO: boolean encontrado = false;
        // TODO: for (PersonaPlantilla p : personas) {
        // TODO:     if (p.getNombre().equals(buscar)) {
        // TODO:         System.out.println("✅ Encontrada: " + p.getInfo());
        // TODO:         encontrado = true;
        // TODO:     }
        // TODO: }
        // TODO: if (!encontrado) {
        // TODO:     System.out.println("❌ No encontrada");
        // TODO: }

        // PASO 5: Filtrar adultos
        // TODO: System.out.println("\n=== ADULTOS ===");
        // TODO: ArrayList<PersonaPlantilla> adultos = new ArrayList<>();
        // TODO: for (PersonaPlantilla p : personas) {
        // TODO:     if (p.esAdulto()) {
        // TODO:         adultos.add(p);
        // TODO:     }
        // TODO: }
        // TODO: System.out.println("Total adultos: " + adultos.size());
        // TODO: for (PersonaPlantilla p : adultos) {
        // TODO:     System.out.println(p.getInfo());
        // TODO: }
    }
}
