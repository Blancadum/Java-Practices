/**
 * EJERCICIO 3: Sesión - Try-Catch-Finally (PLANTILLA)
 *
 * Ejecutar código que siempre debe ocurrir
 */
public class SesionPlantilla {

    // PASO 1: Método login con try-catch-finally
    // PISTA: recibe usuario (String) y password (String)
    // PISTA: en try, valida que no estén vacíos
    // PISTA: si alguno está vacío, throw new IllegalArgumentException("Campos vacíos")
    // PISTA: si todo OK, System.out.println("✅ Login exitoso")
    // PISTA: en catch, captura IllegalArgumentException y muestra mensaje
    // PISTA: en finally, SIEMPRE muestra "Sesión finalizada"
    // TODO: public void login(String usuario, String password) {
    // TODO:     try {
    // TODO:         if (usuario.isEmpty() || password.isEmpty()) {
    // TODO:             throw new IllegalArgumentException("Campos vacíos");
    // TODO:         }
    // TODO:         System.out.println("✅ Login exitoso");
    // TODO:     } catch (IllegalArgumentException e) {
    // TODO:         System.out.println("❌ " + e.getMessage());
    // TODO:     } finally {
    // TODO:         System.out.println("Sesión finalizada");
    // TODO:     }
    // TODO: }

    // PASO 2: Main - prueba
    // PISTA: prueba login("juan", "1234")
    // PISTA: prueba login("", "")
    // TODO: public static void main(String[] args) {
    // TODO:     SesionPlantilla sesion = new SesionPlantilla();
    // TODO:
    // TODO:     System.out.println("--- Intento 1 ---");
    // TODO:     sesion.login("juan", "1234");
    // TODO:
    // TODO:     System.out.println("\n--- Intento 2 ---");
    // TODO:     sesion.login("", "");
    // TODO: }
}
