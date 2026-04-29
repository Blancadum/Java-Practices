import java.nio.file.*;
import java.util.List;

/**
 * EJERCICIO 4: Buscar y Reemplazar (SOLUCIÓN)
 */
public class BuscarYReemplazarSol {

    public void buscarYReemplazar(String nombreFichero, String nombreBuscar, String nombreNuevo) {
        try {
            Path path = Paths.get(nombreFichero);
            List<String> lineas = Files.readAllLines(path);

            boolean encontrado = false;
            for (int i = 0; i < lineas.size(); i++) {
                if (lineas.get(i).startsWith(nombreBuscar)) {
                    String[] datos = lineas.get(i).split(",");
                    lineas.set(i, nombreNuevo + "," + datos[1]);
                    System.out.println("✅ Reemplazado: " + nombreBuscar + " → " + nombreNuevo);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("❌ No encontrado");
            } else {
                Files.write(path, lineas);
            }
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        BuscarYReemplazarSol br = new BuscarYReemplazarSol();
        br.buscarYReemplazar("personas.txt", "Juan", "Juanito");
    }
}
