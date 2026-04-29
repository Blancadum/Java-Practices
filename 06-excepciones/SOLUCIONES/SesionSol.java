/**
 * EJERCICIO 3: Sesión - Try-Catch-Finally (SOLUCIÓN)
 */
public class SesionSol {

    public void login(String usuario, String password) {
        try {
            if (usuario.isEmpty() || password.isEmpty()) {
                throw new IllegalArgumentException("Campos vacíos");
            }
            System.out.println("✅ Login exitoso");
        } catch (IllegalArgumentException e) {
            System.out.println("❌ " + e.getMessage());
        } finally {
            System.out.println("Sesión finalizada");
        }
    }

    public static void main(String[] args) {
        SesionSol sesion = new SesionSol();

        System.out.println("--- Intento 1 ---");
        sesion.login("juan", "1234");

        System.out.println("\n--- Intento 2 ---");
        sesion.login("", "");

        System.out.println("\n✅ Finally se ejecutó en ambos casos");
    }
}
