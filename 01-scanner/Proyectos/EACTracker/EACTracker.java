package Scanner.Proyectos.EACTracker;
import java.util.Locale;

public class EACTracker {

    /**
     * Punto de entrada del programa
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);  // Decimales con punto
        new EACTracker().start();
    }

    /**
     * Inicia el programa: pide carpeta/archivo → menú loop
     */
    private void start() {
        UtilsIO io = new UtilsIO();

        // Pedir carpeta y archivo
        String dir = io.askString(Constants.ASK_FOLDER);
        String filename = io.askString(Constants.ASK_FILE);

        // Valores por defecto si están vacíos
        if (dir.isEmpty()) {
            dir = Constants.DEFAULT_DIR;
        }
        if (filename.isEmpty()) {
            filename = Constants.DEFAULT_FILE;
        }

        // Crear utilidad de archivos
        EACFileUtils fu;
        try {
            fu = new EACFileUtils(dir, filename);
        } catch (Exception e) {
            io.showError("❌ Error al crear archivo: " + e.getMessage());
            return;
        }

        // Menú repetitivo
        boolean exit = false;
        while (!exit) {
            io.show("\n" + Constants.MENU);
            int option = io.askInt(Constants.ASK_OPTION);

            try {
                switch (option) {
                    case 1:
                        addNewEAC(io, fu);
                        break;
                    case 2:
                        viewAllEACs(io, fu);
                        break;
                    case 3:
                        markAsCompleted(io, fu);
                        break;
                    case 4:
                        viewUpcomingEACs(io, fu);
                        break;
                    case 5:
                        deleteEAC(io, fu);
                        break;
                    case 0:
                        exit = true;
                        break;
                    default:
                        io.showError(Constants.ERROR_INVALID);
                        break;
                }
            } catch (Exception e) {
                io.showError("❌ Error: " + e.getMessage());
            }
        }

        io.show("\n👋 ¡Hasta luego!");
    }

    /**
     * Opción 1: Agregar nueva EAC
     */
    private void addNewEAC(UtilsIO io, EACFileUtils fu) throws Exception {
        String eac = io.askNotEmpty(Constants.ASK_EAC);
        String description = io.askNotEmpty(Constants.ASK_DESC);
        String date = io.askNotEmpty(Constants.ASK_DATE);

        fu.addEAC(eac, description, date);
        io.show(Constants.SUCCESS_ADDED);
    }

    /**
     * Opción 2: Ver todas las EACs
     */
    private void viewAllEACs(UtilsIO io, EACFileUtils fu) throws Exception {
        String result = fu.getAllEACs();
        io.show(result);
    }

    /**
     * Opción 3: Marcar como completada
     */
    private void markAsCompleted(UtilsIO io, EACFileUtils fu) throws Exception {
        String eacName = io.askNotEmpty("¿Cuál EAC completaste? (ej: EAC1): ");
        fu.markAsCompleted(eacName);
        io.show(Constants.SUCCESS_MARKED);
    }

    /**
     * Opción 4: Ver próximas entregas
     */
    private void viewUpcomingEACs(UtilsIO io, EACFileUtils fu) throws Exception {
        String result = fu.getUpcomingEACs();
        io.show(result);
    }

    /**
     * Opción 5: Eliminar una EAC
     */
    private void deleteEAC(UtilsIO io, EACFileUtils fu) throws Exception {
        String eacName = io.askNotEmpty("¿Cuál EAC eliminar? (ej: EAC1): ");
        fu.deleteEAC(eacName);
        io.show(Constants.SUCCESS_DELETED);
    }
}
