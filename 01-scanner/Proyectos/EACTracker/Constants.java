package Scanner.Proyectos.EACTracker;
public class Constants {
    // Valores por defecto
    public static final String DEFAULT_DIR = "./eac_tracker";
    public static final String DEFAULT_FILE = "mis_eacs.txt";

    // Menú
    public static final String MENU =
        "=== EAC TRACKER ===\n" +
        "1. Agregar EAC\n" +
        "2. Ver todas\n" +
        "3. Marcar como completada\n" +
        "4. Próximas entregas\n" +
        "5. Eliminar EAC\n" +
        "0. Salir";

    // Mensajes entrada
    public static final String ASK_FOLDER = "Carpeta (Enter = defecto): ";
    public static final String ASK_FILE = "Archivo (Enter = defecto): ";
    public static final String ASK_OPTION = "Elige: ";

    public static final String ASK_EAC = "EAC (ej: EAC1): ";
    public static final String ASK_DESC = "Descripción: ";
    public static final String ASK_DATE = "Fecha (YYYY-MM-DD): ";

    // Mensajes error
    public static final String ERROR_INT = "❌ Debe ser número";
    public static final String ERROR_EMPTY = "❌ No puede estar vacío";
    public static final String ERROR_INVALID = "❌ Opción no válida";

    // Mensajes éxito
    public static final String SUCCESS_ADDED = "✅ EAC agregada";
    public static final String SUCCESS_MARKED = "✅ Marcada como completada";
    public static final String SUCCESS_DELETED = "✅ EAC eliminada";
    public static final String INFO_EMPTY = "📭 No hay EACs";
}
