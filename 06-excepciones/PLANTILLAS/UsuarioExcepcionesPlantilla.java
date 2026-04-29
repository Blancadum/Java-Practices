/**
 * EJERCICIO 5: Sistema Registro - Excepciones Personalizadas (PLANTILLA)
 *
 * Crea 3 excepciones y úsalas en un sistema completo
 */

// PASO 1: Crear 3 clases de excepciones personalizadas

// TODO: public class NombreVacioExceptionPlantilla extends Exception {
// TODO:     public NombreVacioExceptionPlantilla(String mensaje) {
// TODO:         super(mensaje);
// TODO:     }
// TODO: }

// TODO: public class EmailInvalidoExceptionPlantilla extends Exception {
// TODO:     public EmailInvalidoExceptionPlantilla(String mensaje) {
// TODO:         super(mensaje);
// TODO:     }
// TODO: }

// TODO: public class ContraseñaDebilExceptionPlantilla extends Exception {
// TODO:     public ContraseñaDebilExceptionPlantilla(String mensaje) {
// TODO:         super(mensaje);
// TODO:     }
// TODO: }

// PASO 2: Clase Usuario
public class UsuarioExcepcionesPlantilla {
    private String nombre;
    private String email;
    private String contraseña;

    // Constructor vacío
    // TODO: public UsuarioExcepcionesPlantilla() {
    // TODO: }

    // PASO 3: Método registrar que valida y lanza excepciones
    // PISTA: recibe nombre, email, contraseña (String)
    // PISTA: valida nombre: si está vacío, throw NombreVacioException
    // PISTA: valida email: si no contiene "@", throw EmailInvalidoException
    // PISTA: valida contraseña: si tiene < 6 caracteres, throw ContraseñaDebilException
    // PISTA: si todo OK, guarda datos y muestra "✅ Usuario registrado"
    // TODO: public void registrar(String nombre, String email, String contraseña)
    // TODO:         throws NombreVacioExceptionPlantilla, EmailInvalidoExceptionPlantilla, ContraseñaDebilExceptionPlantilla {
    // TODO:
    // TODO:     if (nombre.isEmpty()) {
    // TODO:         throw new NombreVacioExceptionPlantilla("Nombre no puede estar vacío");
    // TODO:     }
    // TODO:     if (!email.contains("@")) {
    // TODO:         throw new EmailInvalidoExceptionPlantilla("Email debe contener @");
    // TODO:     }
    // TODO:     if (contraseña.length() < 6) {
    // TODO:         throw new ContraseñaDebilExceptionPlantilla("Contraseña mínimo 6 caracteres");
    // TODO:     }
    // TODO:
    // TODO:     this.nombre = nombre;
    // TODO:     this.email = email;
    // TODO:     this.contraseña = contraseña;
    // TODO:     System.out.println("✅ Usuario registrado");
    // TODO: }

    // PASO 4: Main - prueba con try-catch múltiples
    // PISTA: Intento 1: registro válido "Juan", "juan@mail.com", "123456"
    // PISTA: Intento 2: email inválido "Juan", "juanmail", "123456"
    // PISTA: Intento 3: contraseña débil "Juan", "juan@mail.com", "123"
    // TODO: public static void main(String[] args) {
    // TODO:     UsuarioExcepcionesPlantilla usuario = new UsuarioExcepcionesPlantilla();
    // TODO:
    // TODO:     // Intento 1: válido
    // TODO:     try {
    // TODO:         System.out.println("Registro 1: Juan / juan@mail.com / 123456");
    // TODO:         usuario.registrar("Juan", "juan@mail.com", "123456");
    // TODO:     } catch (NombreVacioExceptionPlantilla e) {
    // TODO:         System.out.println("❌ " + e.getMessage());
    // TODO:     } catch (EmailInvalidoExceptionPlantilla e) {
    // TODO:         System.out.println("❌ " + e.getMessage());
    // TODO:     } catch (ContraseñaDebilExceptionPlantilla e) {
    // TODO:         System.out.println("❌ " + e.getMessage());
    // TODO:     }
    // TODO:
    // TODO:     // Intento 2: email inválido
    // TODO:     try {
    // TODO:         System.out.println("\nRegistro 2: Juan / juanmail / 123456");
    // TODO:         usuario.registrar("Juan", "juanmail", "123456");
    // TODO:     } catch (NombreVacioExceptionPlantilla e) {
    // TODO:         System.out.println("❌ " + e.getMessage());
    // TODO:     } catch (EmailInvalidoExceptionPlantilla e) {
    // TODO:         System.out.println("❌ " + e.getMessage());
    // TODO:     } catch (ContraseñaDebilExceptionPlantilla e) {
    // TODO:         System.out.println("❌ " + e.getMessage());
    // TODO:     }
    // TODO:
    // TODO:     // Intento 3: contraseña débil
    // TODO:     try {
    // TODO:         System.out.println("\nRegistro 3: Juan / juan@mail.com / 123");
    // TODO:         usuario.registrar("Juan", "juan@mail.com", "123");
    // TODO:     } catch (NombreVacioExceptionPlantilla e) {
    // TODO:         System.out.println("❌ " + e.getMessage());
    // TODO:     } catch (EmailInvalidoExceptionPlantilla e) {
    // TODO:         System.out.println("❌ " + e.getMessage());
    // TODO:     } catch (ContraseñaDebilExceptionPlantilla e) {
    // TODO:         System.out.println("❌ " + e.getMessage());
    // TODO:     }
    // TODO: }
}
