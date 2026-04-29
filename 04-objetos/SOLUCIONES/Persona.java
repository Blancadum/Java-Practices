/**
 * Clase Persona - Modelo base para los ejercicios
 */
public class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad > 0 && edad < 150) {
            this.edad = edad;
        } else {
            System.out.println("❌ Edad no válida");
        }
    }

    // Métodos
    public String getInfo() {
        return nombre + " (" + edad + " años)";
    }

    public boolean esAdulto() {
        return edad >= 18;
    }
}
