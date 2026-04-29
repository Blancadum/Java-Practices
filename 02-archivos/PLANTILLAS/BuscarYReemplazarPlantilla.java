import java.nio.file.*;
import java.util.List;
import java.util.ArrayList;

/**
 * EJERCICIO 4: Buscar y Reemplazar (PLANTILLA)
 *
 * Lee fichero, modifica línea específica, reescribe
 */
public class BuscarYReemplazarPlantilla {

    // PASO 1: Método buscarYReemplazar
    // PISTA: recibe nombreFichero, nombreBuscar, nombreNuevo
    // PISTA: lee con Files.readAllLines()
    // PISTA: recorre líneas buscando la que contiene nombreBuscar
    // PISTA: si la encuentra, reemplaza con nombreNuevo
    // PISTA: reescribe fichero con Files.write()
    // TODO: public void buscarYReemplazar(String nombreFichero, String nombreBuscar, String nombreNuevo) {
    // TODO:     try {
    // TODO:         Path path = Paths.get(nombreFichero);
    // TODO:         List<String> lineas = Files.readAllLines(path);
    // TODO:
    // TODO:         for (int i = 0; i < lineas.size(); i++) {
    // TODO:             if (lineas.get(i).startsWith(nombreBuscar)) {
    // TODO:                 String[] datos = lineas.get(i).split(",");
    // TODO:                 lineas.set(i, nombreNuevo + "," + datos[1]);
    // TODO:                 System.out.println("✅ Reemplazado");
    // TODO:             }
    // TODO:         }
    // TODO:
    // TODO:         Files.write(path, lineas);
    // TODO:     } catch (Exception e) {
    // TODO:         System.out.println("❌ Error: " + e.getMessage());
    // TODO:     }
    // TODO: }

    // PASO 2: Main - prueba
    // PISTA: busca "Juan" y reemplaza con "Juanito"
    // TODO: public static void main(String[] args) {
    // TODO:     BuscarYReemplazarPlantilla br = new BuscarYReemplazarPlantilla();
    // TODO:     br.buscarYReemplazar("personas.txt", "Juan", "Juanito");
    // TODO: }
}
