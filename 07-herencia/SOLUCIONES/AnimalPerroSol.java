/**
 * EJERCICIO 1: Animal y Perro - Herencia Básica (SOLUCIÓN)
 */

class AnimalSol {
    protected String nombre;
    protected int edad;

    public AnimalSol(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo");
    }
}

class PerroSol extends AnimalSol {
    public PerroSol(String nombre, int edad) {
        super(nombre, edad);
    }

    public void traerPelota() {
        System.out.println(nombre + " trae la pelota");
    }
}

public class AnimalPerroSol {
    public static void main(String[] args) {
        PerroSol perro = new PerroSol("Rex", 3);
        perro.dormir();
        perro.traerPelota();
    }
}
