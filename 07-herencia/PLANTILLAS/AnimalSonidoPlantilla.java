/**
 * EJERCICIO 3: Animal, Perro, Gato - Override (PLANTILLA)
 *
 * Cada hija sobrescribe el método sonido() de forma diferente
 */

// PASO 1: Crear clase PADRE Animal
// PISTA: atributo: nombre (String)
// PISTA: constructor que reciba nombre
// PISTA: método sonido() que imprime "Sonido genérico"
// TODO: public class AnimalPlantilla {
// TODO:     protected String nombre;
// TODO:
// TODO:     public AnimalPlantilla(String nombre) {
// TODO:         this.nombre = nombre;
// TODO:     }
// TODO:
// TODO:     public void sonido() {
// TODO:         System.out.println("Sonido genérico");
// TODO:     }
// TODO: }

// PASO 2: Crear clase HIJA Perro
// PISTA: extends Animal
// PISTA: constructor que llame super
// PISTA: OVERRIDE sonido() con "¡Guau guau!"
// TODO: public class PerroPlantilla extends AnimalPlantilla {
// TODO:     public PerroPlantilla(String nombre) {
// TODO:         super(nombre);
// TODO:     }
// TODO:
// TODO:     @Override
// TODO:     public void sonido() {
// TODO:         System.out.println("¡Guau guau!");
// TODO:     }
// TODO: }

// PASO 3: Crear clase HIJA Gato
// PISTA: extends Animal
// PISTA: constructor que llame super
// PISTA: OVERRIDE sonido() con "¡Miau miau!"
// TODO: public class GatoPlantilla extends AnimalPlantilla {
// TODO:     public GatoPlantilla(String nombre) {
// TODO:         super(nombre);
// TODO:     }
// TODO:
// TODO:     @Override
// TODO:     public void sonido() {
// TODO:         System.out.println("¡Miau miau!");
// TODO:     }
// TODO: }

// PASO 4: Main - compara sobrescritura
// PISTA: crea Perro("Rex")
// PISTA: crea Gato("Whiskers")
// PISTA: llama sonido() en ambos
// PISTA: nota cómo cada uno hace su sonido diferente
// TODO: public static void main(String[] args) {
// TODO:     PerroPlantilla perro = new PerroPlantilla("Rex");
// TODO:     GatoPlantilla gato = new GatoPlantilla("Whiskers");
// TODO:
// TODO:     System.out.println("Perro:");
// TODO:     perro.sonido();
// TODO:
// TODO:     System.out.println("\nGato:");
// TODO:     gato.sonido();
// TODO: }
