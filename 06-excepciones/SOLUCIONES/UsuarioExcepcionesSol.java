/**
 * EJERCICIO 5: Sistema Registro - Excepciones Personalizadas (SOLUCIÓN)
 */
public class UsuarioExcepcionesSol {
    private String nombre;
    private String email;
    private String contraseña;

    public UsuarioExcepcionesSol() {
    }

    public void registrar(String nombre, String email, String contraseña)
            throws NombreVacioExceptionSol, EmailInvalidoExceptionSol, ContraseñaDebilExceptionSol {

        if (nombre.isEmpty()) {
            throw new NombreVacioExceptionSol("Nombre no puede estar vacío");
        }
        if (!email.contains("@")) {
            throw new EmailInvalidoExceptionSol("Email debe contener @");
        }
        if (contraseña.length() < 6) {
            throw new ContraseñaDebilExceptionSol("Contraseña mínimo 6 caracteres");
        }

        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        System.out.println("✅ Usuario registrado");
    }

    public static void main(String[] args) {
        UsuarioExcepcionesSol usuario = new UsuarioExcepcionesSol();

        // Intento 1: válido
        try {
            System.out.println("Registro 1: Juan / juan@mail.com / 123456");
            usuario.registrar("Juan", "juan@mail.com", "123456");
        } catch (NombreVacioExceptionSol e) {
            System.out.println("❌ " + e.getMessage());
        } catch (EmailInvalidoExceptionSol e) {
            System.out.println("❌ " + e.getMessage());
        } catch (ContraseñaDebilExceptionSol e) {
            System.out.println("❌ " + e.getMessage());
        }

        // Intento 2: email inválido
        try {
            System.out.println("\nRegistro 2: Juan / juanmail / 123456");
            usuario.registrar("Juan", "juanmail", "123456");
        } catch (NombreVacioExceptionSol e) {
            System.out.println("❌ " + e.getMessage());
        } catch (EmailInvalidoExceptionSol e) {
            System.out.println("❌ " + e.getMessage());
        } catch (ContraseñaDebilExceptionSol e) {
            System.out.println("❌ " + e.getMessage());
        }

        // Intento 3: contraseña débil
        try {
            System.out.println("\nRegistro 3: Juan / juan@mail.com / 123");
            usuario.registrar("Juan", "juan@mail.com", "123");
        } catch (NombreVacioExceptionSol e) {
            System.out.println("❌ " + e.getMessage());
        } catch (EmailInvalidoExceptionSol e) {
            System.out.println("❌ " + e.getMessage());
        } catch (ContraseñaDebilExceptionSol e) {
            System.out.println("❌ " + e.getMessage());
        }

        // Intento 4: nombre vacío
        try {
            System.out.println("\nRegistro 4: (vacío) / maria@mail.com / 123456");
            usuario.registrar("", "maria@mail.com", "123456");
        } catch (NombreVacioExceptionSol e) {
            System.out.println("❌ " + e.getMessage());
        } catch (EmailInvalidoExceptionSol e) {
            System.out.println("❌ " + e.getMessage());
        } catch (ContraseñaDebilExceptionSol e) {
            System.out.println("❌ " + e.getMessage());
        }

        System.out.println("\n✅ Sistema de registro con validación completa");
    }
}
