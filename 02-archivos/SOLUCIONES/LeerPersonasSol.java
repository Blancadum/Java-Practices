import java.nio.file.*;
import java.util.List;

/**
 * EJERCICIO 2: Leer Personas (SOLUCIÓN)
 */
public class LeerPersonasSol {

    public void leerPersonas(String nombreFichero) {
        try {
            Path path = Paths.get(nombreFichero);
            List<String> lineas = Files.readAllLines(path);

            System.out.println("=== PERSONAS ===");
            for (String linea : lineas) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        LeerPersonasSol lp = new LeerPersonasSol();
        lp.leerPersonas("personas.txt");
    }
}
