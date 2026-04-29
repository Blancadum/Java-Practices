/**
 * EJERCICIO 5: Persona (abstracta), Ingeniero, Profesor, Medico - Clases Abstractas (SOLUCIÓN)
 */

abstract class PersonaSol {
    protected String nombre;
    protected int edad;

    public PersonaSol(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void trabajar();

    public void presentarse() {
        System.out.println("Hola, soy " + nombre);
    }
}

class IngenierSol extends PersonaSol {
    public IngenierSol(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void trabajar() {
        System.out.println("Escribo código");
    }
}

class ProfesorSol extends PersonaSol {
    public ProfesorSol(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void trabajar() {
        System.out.println("Enseño");
    }
}

class MedicoSol extends PersonaSol {
    public MedicoSol(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void trabajar() {
        System.out.println("Diagnostico");
    }
}

public class PersonaAbstractaSol {
    public static void main(String[] args) {
        PersonaSol[] personas = {
            new IngenierSol("Juan", 30),
            new ProfesorSol("María", 40),
            new MedicoSol("Carlos", 35)
        };

        System.out.println("=== CLASES ABSTRACTAS ===");
        for (PersonaSol p : personas) {
            p.presentarse();
            p.trabajar();
            System.out.println();
        }

        System.out.println("✅ Clase abstracta fuerza implementación");
        // PersonaSol p = new PersonaSol("Test", 20);  // ❌ ERROR - no se puede instanciar
    }
}
