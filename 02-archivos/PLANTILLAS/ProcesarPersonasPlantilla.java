import java.nio.file.*;
import java.util.List;

/**
 * EJERCICIO 3: Procesar Personas (PLANTILLA)
 *
 * Lee, parsea con split() y filtra datos
 */
public class ProcesarPersonasPlantilla {

    // PASO 1: Método procesarPersonas
    // PISTA: lee el fichero con Files.readAllLines()
    // PISTA: para cada línea:
    //   - usa linea.split(",") para separar
    //   - datos[0] = nombre, datos[1] = edad
    //   - convierte edad: Integer.parseInt(datos[1])
    //   - muestra si es adulto (edad >= 18)
    // TODO: public void procesarPersonas(String nombreFichero) {
    // TODO:     try {
    // TODO:         Path path = Paths.get(nombreFichero);
    // TODO:         List<String> lineas = Files.readAllLines(path);
    // TODO:
    // TODO:         System.out.println("=== ANÁLISIS ===");
    // TODO:         for (String linea : lineas) {
    // TODO:             String[] datos = linea.split(",");
    // TODO:             String nombre = datos[0];
    // TODO:             int edad = Integer.parseInt(datos[1]);
    // TODO:
    // TODO:             String tipo = (edad >= 18) ? "Adulto" : "Menor";
    // TODO:             System.out.println(nombre + " (" + edad + ") - " + tipo);
    // TODO:         }
    // TODO:     } catch (Exception e) {
    // TODO:         System.out.println("❌ Error: " + e.getMessage());
    // TODO:     }
    // TODO: }

    // PASO 2: Main - prueba
    // PISTA: llama procesarPersonas("personas.txt")
    // TODO: public static void main(String[] args) {
    // TODO:     ProcesarPersonasPlantilla pp = new ProcesarPersonasPlantilla();
    // TODO:     pp.procesarPersonas("personas.txt");
    // TODO: }
}
