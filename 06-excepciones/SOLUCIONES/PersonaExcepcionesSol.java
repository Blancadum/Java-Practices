/**
 * EJERCICIO 4: Persona - Excepciones Personalizadas (SOLUCIÓN)
 */
public class PersonaExcepcionesSol {
    private String nombre;
    private int edad;

    public PersonaExcepcionesSol(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
    }

    public void setEdad(int edad) throws EdadInvalidaExceptionSol {
        if (edad < 0 || edad > 150) {
            throw new EdadInvalidaExceptionSol("Edad debe estar entre 0 y 150");
        }
        this.edad = edad;
        System.out.println("✅ Edad establecida");
    }

    public int getEdad() {
        return edad;
    }

    public static void main(String[] args) {
        PersonaExcepcionesSol p = new PersonaExcepcionesSol("Juan");

        // Caso 1: edad válida
        try {
            System.out.println("Establecer edad 25:");
            p.setEdad(25);
        } catch (EdadInvalidaExceptionSol e) {
            System.out.println("❌ " + e.getMessage());
        }

        // Caso 2: edad inválida
        try {
            System.out.println("\nEstablecer edad -5:");
            p.setEdad(-5);
        } catch (EdadInvalidaExceptionSol e) {
            System.out.println("❌ " + e.getMessage());
        }

        // Caso 3: edad inválida (demasiado alta)
        try {
            System.out.println("\nEstablecer edad 200:");
            p.setEdad(200);
        } catch (EdadInvalidaExceptionSol e) {
            System.out.println("❌ " + e.getMessage());
        }

        System.out.println("\n✅ Edad final: " + p.getEdad());
    }
}
