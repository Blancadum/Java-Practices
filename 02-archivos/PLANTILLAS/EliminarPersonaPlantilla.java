import java.nio.file.*;
import java.util.List;

/**
 * EJERCICIO 5: Eliminar Persona (PLANTILLA)
 *
 * Lee fichero, elimina línea específica, reescribe
 */
public class EliminarPersonaPlantilla {

    // PASO 1: Método eliminarPersona
    // PISTA: recibe nombreFichero y nombreEliminar
    // PISTA: lee con Files.readAllLines()
    // PISTA: recorre líneas buscando la que comienza con nombreEliminar
    // PISTA: usa lineas.remove(i) para eliminar
    // PISTA: reescribe fichero con Files.write()
    // TODO: public void eliminarPersona(String nombreFichero, String nombreEliminar) {
    // TODO:     try {
    // TODO:         Path path = Paths.get(nombreFichero);
    // TODO:         List<String> lineas = Files.readAllLines(path);
    // TODO:
    // TODO:         for (int i = 0; i < lineas.size(); i++) {
    // TODO:             if (lineas.get(i).startsWith(nombreEliminar)) {
    // TODO:                 lineas.remove(i);
    // TODO:                 System.out.println("✅ Persona eliminada");
    // TODO:                 break;
    // TODO:             }
    // TODO:         }
    // TODO:
    // TODO:         Files.write(path, lineas);
    // TODO:     } catch (Exception e) {
    // TODO:         System.out.println("❌ Error: " + e.getMessage());
    // TODO:     }
    // TODO: }

    // PASO 2: Main - prueba
    // PISTA: elimina a "María"
    // TODO: public static void main(String[] args) {
    // TODO:     EliminarPersonaPlantilla ep = new EliminarPersonaPlantilla();
    // TODO:     ep.eliminarPersona("personas.txt", "María");
    // TODO: }
}
