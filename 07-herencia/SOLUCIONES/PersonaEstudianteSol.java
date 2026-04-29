/**
 * EJERCICIO 2: Persona y Estudiante - Super en Constructor (SOLUCIÓN)
 */

class PersonaSol {
    protected String nombre;
    protected int edad;

    public PersonaSol(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getInfo() {
        return "Persona: " + nombre + ", " + edad + " años";
    }
}

class EstudianteSol extends PersonaSol {
    private String matricula;

    public EstudianteSol(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public String getInfo() {
        return "Estudiante: " + nombre + ", " + edad + " años, Matrícula: " + matricula;
    }
}

public class PersonaEstudianteSol {
    public static void main(String[] args) {
        EstudianteSol est = new EstudianteSol("Juan", 20, "12345");
        System.out.println(est.getInfo());
    }
}
