import java.nio.file.*;
import java.util.List;

/**
 * EJERCICIO 2: Leer Personas (PLANTILLA)
 *
 * Lee todas las líneas de un fichero
 */
public class LeerPersonasPlantilla {

    // PASO 1: Método leerPersonas
    // PISTA: recibe nombre del fichero (String)
    // PISTA: crea Path: Paths.get(nombreFichero)
    // PISTA: usa Files.readAllLines(path)
    // PISTA: recorre lista con for-each
    // PISTA: imprime cada línea
    // TODO: public void leerPersonas(String nombreFichero) {
    // TODO:     try {
    // TODO:         Path path = Paths.get(nombreFichero);
    // TODO:         List<String> lineas = Files.readAllLines(path);
    // TODO:         System.out.println("=== PERSONAS ===");
    // TODO:         for (String linea : lineas) {
    // TODO:             System.out.println(linea);
    // TODO:         }
    // TODO:     } catch (Exception e) {
    // TODO:         System.out.println("❌ Error: " + e.getMessage());
    // TODO:     }
    // TODO: }

    // PASO 2: Main - prueba
    // PISTA: llama leerPersonas("personas.txt")
    // TODO: public static void main(String[] args) {
    // TODO:     LeerPersonasPlantilla lp = new LeerPersonasPlantilla();
    // TODO:     lp.leerPersonas("personas.txt");
    // TODO: }
}
