package Scanner.Proyectos.EACTracker;
import java.nio.file.*;
import java.util.*;

public class EACFileUtils {
    private Path file;

    /**
     * Constructor: crea directorio y archivo si no existen
     */
    public EACFileUtils(String dir, String name) throws Exception {
        Path dirPath = Paths.get(dir);
        Files.createDirectories(dirPath);  // Crea carpeta si no existe
        this.file = dirPath.resolve(name);
        createFile();
    }

    /**
     * Agregar nueva EAC al archivo
     * Formato: EAC|descripción|fecha|No comenzada
     */
    public void addEAC(String eac, String description, String date) throws Exception {
        String line = String.format("%s|%s|%s|No comenzada\n", eac, description, date);
        Files.write(file, line.getBytes(), StandardOpenOption.APPEND);
    }

    /**
     * Ver todas las EACs con emoji según estado
     */
    public String getAllEACs() throws Exception {
        List<String> lines = Files.readAllLines(file);
        if (lines.isEmpty()) {
            return Constants.INFO_EMPTY;
        }

        StringBuilder sb = new StringBuilder("=== MIS EACs ===\n");
        for (String line : lines) {
            String[] parts = line.split("\\|");
            if (parts.length == 4) {
                String emoji = getStatusEmoji(parts[3]);
                sb.append(String.format("%s %s - %s (Entrega: %s)\n",
                    emoji, parts[0], parts[1], parts[2]));
            }
        }
        return sb.toString();
    }

    /**
     * Ver próximas entregas (no completadas, ordenadas por fecha)
     */
    public String getUpcomingEACs() throws Exception {
        List<String> lines = Files.readAllLines(file);
        if (lines.isEmpty()) {
            return Constants.INFO_EMPTY;
        }

        // Guardar EACs no completadas
        List<EACEntry> eacs = new ArrayList<>();
        for (String line : lines) {
            String[] parts = line.split("\\|");
            if (parts.length == 4 && !parts[3].equals("Completada")) {
                eacs.add(new EACEntry(parts[0], parts[1], parts[2], parts[3]));
            }
        }

        // Ordenar por fecha (primero las más cercanas)
        eacs.sort((a, b) -> a.date.compareTo(b.date));

        // Si no hay pendientes
        if (eacs.isEmpty()) {
            return "🎉 ¡Todas completadas!";
        }

        // Mostrar listado
        StringBuilder sb = new StringBuilder("=== PRÓXIMAS ENTREGAS ===\n");
        for (EACEntry eac : eacs) {
            sb.append(String.format("📅 %s - %s (%s)\n", eac.eac, eac.date, eac.status));
        }
        return sb.toString();
    }

    /**
     * Marcar una EAC como completada
     */
    public void markAsCompleted(String eacName) throws Exception {
        List<String> lines = Files.readAllLines(file);
        List<String> updated = new ArrayList<>();

        for (String line : lines) {
            String[] parts = line.split("\\|");
            if (parts.length == 4 && parts[0].equalsIgnoreCase(eacName)) {
                // Reemplazar estado por "Completada"
                updated.add(String.format("%s|%s|%s|Completada",
                    parts[0], parts[1], parts[2]));
            } else {
                updated.add(line);
            }
        }

        // Guardar cambios
        Files.write(file, String.join("\n", updated).getBytes());
    }

    /**
     * Eliminar una EAC
     */
    public void deleteEAC(String eacName) throws Exception {
        List<String> lines = Files.readAllLines(file);
        List<String> updated = new ArrayList<>();

        for (String line : lines) {
            String[] parts = line.split("\\|");
            if (parts.length == 4 && !parts[0].equalsIgnoreCase(eacName)) {
                updated.add(line);
            }
            // Si coincide, no lo añadimos (lo eliminamos)
        }

        Files.write(file, String.join("\n", updated).getBytes());
    }

    // =================== HELPERS ===================

    /**
     * Obtener emoji según estado
     */
    private String getStatusEmoji(String status) {
        if (status.equals("Completada")) return "✅";
        if (status.equals("En progreso")) return "⏳";
        return "❌";
    }

    /**
     * Crear archivo vacío si no existe
     */
    private void createFile() throws Exception {
        if (!Files.exists(file)) {
            Files.createFile(file);
        }
    }

    /**
     * Clase interna para almacenar datos de EAC
     */
    private static class EACEntry {
        String eac, description, date, status;

        EACEntry(String e, String d, String da, String s) {
            eac = e;
            description = d;
            date = da;
            status = s;
        }
    }
}
