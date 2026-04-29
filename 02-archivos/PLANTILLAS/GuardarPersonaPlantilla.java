import java.nio.file.*;

/**
 * EJERCICIO 1: Guardar Persona (PLANTILLA)
 *
 * Escribe datos en un fichero
 */
public class GuardarPersonaPlantilla {

    // PASO 1: Método guardarPersona
    // PISTA: recibe nombre (String) y edad (int)
    // PISTA: crea String con formato: "nombre,edad"
    // PISTA: define Path: Paths.get("personas.txt")
    // PISTA: usa Files.write() con StandardOpenOption.APPEND
    // TODO: public void guardarPersona(String nombre, int edad) {
    // TODO:     try {
    // TODO:         String linea = nombre + "," + edad + "\n";
    // TODO:         Path path = Paths.get("personas.txt");
    // TODO:         Files.write(path, linea.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    // TODO:         System.out.println("✅ Persona guardada");
    // TODO:     } catch (Exception e) {
    // TODO:         System.out.println("❌ Error: " + e.getMessage());
    // TODO:     }
    // TODO: }

    // PASO 2: Main - prueba
    // PISTA: guarda 3 personas diferentes
    // TODO: public static void main(String[] args) {
    // TODO:     GuardarPersonaPlantilla gp = new GuardarPersonaPlantilla();
    // TODO:     gp.guardarPersona("Juan", 25);
    // TODO:     gp.guardarPersona("María", 30);
    // TODO:     gp.guardarPersona("Pedro", 22);
    // TODO: }
}
