import java.nio.file.*;

/**
 * EJERCICIO 1: Guardar Persona (SOLUCIÓN)
 */
public class GuardarPersonaSol {

    public void guardarPersona(String nombre, int edad) {
        try {
            String linea = nombre + "," + edad + "\n";
            Path path = Paths.get("personas.txt");
            Files.write(path, linea.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
            System.out.println("✅ Persona guardada");
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        GuardarPersonaSol gp = new GuardarPersonaSol();
        gp.guardarPersona("Juan", 25);
        gp.guardarPersona("María", 30);
        gp.guardarPersona("Pedro", 22);
    }
}
