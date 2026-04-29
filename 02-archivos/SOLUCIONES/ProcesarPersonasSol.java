import java.nio.file.*;
import java.util.List;

/**
 * EJERCICIO 3: Procesar Personas (SOLUCIÓN)
 */
public class ProcesarPersonasSol {

    public void procesarPersonas(String nombreFichero) {
        try {
            Path path = Paths.get(nombreFichero);
            List<String> lineas = Files.readAllLines(path);

            System.out.println("=== ANÁLISIS ===");
            for (String linea : lineas) {
                String[] datos = linea.split(",");
                String nombre = datos[0];
                int edad = Integer.parseInt(datos[1]);

                String tipo = (edad >= 18) ? "Adulto" : "Menor";
                System.out.println(nombre + " (" + edad + ") - " + tipo);
            }
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ProcesarPersonasSol pp = new ProcesarPersonasSol();
        pp.procesarPersonas("personas.txt");
    }
}
