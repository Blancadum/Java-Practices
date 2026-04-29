/**
 * EJERCICIO 3: Animal, Perro, Gato - Override (SOLUCIÓN)
 */

class AnimalSol {
    protected String nombre;

    public AnimalSol(String nombre) {
        this.nombre = nombre;
    }

    public void sonido() {
        System.out.println("Sonido genérico");
    }
}

class PerroSol extends AnimalSol {
    public PerroSol(String nombre) {
        super(nombre);
    }

    @Override
    public void sonido() {
        System.out.println("¡Guau guau!");
    }
}

class GatoSol extends AnimalSol {
    public GatoSol(String nombre) {
        super(nombre);
    }

    @Override
    public void sonido() {
        System.out.println("¡Miau miau!");
    }
}

public class AnimalSonidoSol {
    public static void main(String[] args) {
        PerroSol perro = new PerroSol("Rex");
        GatoSol gato = new GatoSol("Whiskers");

        System.out.println("Perro:");
        perro.sonido();

        System.out.println("\nGato:");
        gato.sonido();

        System.out.println("\n✅ Cada clase tiene su propia implementación");
    }
}
