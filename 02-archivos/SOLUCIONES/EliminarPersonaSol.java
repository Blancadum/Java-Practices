import java.nio.file.*;
import java.util.List;

/**
 * EJERCICIO 5: Eliminar Persona (SOLUCIÓN)
 */
public class EliminarPersonaSol {

    public void eliminarPersona(String nombreFichero, String nombreEliminar) {
        try {
            Path path = Paths.get(nombreFichero);
            List<String> lineas = Files.readAllLines(path);

            boolean encontrado = false;
            for (int i = 0; i < lineas.size(); i++) {
                if (lineas.get(i).startsWith(nombreEliminar)) {
                    lineas.remove(i);
                    System.out.println("✅ Persona eliminada: " + nombreEliminar);
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
        EliminarPersonaSol ep = new EliminarPersonaSol();
        ep.eliminarPersona("personas.txt", "María");
    }
}
