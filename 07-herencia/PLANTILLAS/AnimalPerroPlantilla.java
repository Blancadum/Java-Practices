/**
 * EJERCICIO 1: Animal y Perro - Herencia Básica (PLANTILLA)
 *
 * Crea clase padre (Animal) e hijo (Perro)
 */

// PASO 1: Crear clase PADRE Animal
// PISTA: atributos: nombre (String), edad (int)
// PISTA: ambos protected para que hijas accedan
// PISTA: constructor que reciba nombre y edad
// PISTA: método dormir() que imprime "{nombre} está durmiendo"
// TODO: public class AnimalPlantilla {
// TODO:     protected String nombre;
// TODO:     protected int edad;
// TODO:
// TODO:     public AnimalPlantilla(String nombre, int edad) {
// TODO:         this.nombre = nombre;
// TODO:         this.edad = edad;
// TODO:     }
// TODO:
// TODO:     public void dormir() {
// TODO:         System.out.println(nombre + " está durmiendo");
// TODO:     }
// TODO: }

// PASO 2: Crear clase HIJA Perro
// PISTA: extends Animal
// PISTA: constructor que reciba nombre y edad
// PISTA: llama super(nombre, edad) en el constructor
// PISTA: método traerPelota() que imprime "{nombre} trae la pelota"
// TODO: public class PerroPlantilla extends AnimalPlantilla {
// TODO:     public PerroPlantilla(String nombre, int edad) {
// TODO:         super(nombre, edad);
// TODO:     }
// TODO:
// TODO:     public void traerPelota() {
// TODO:         System.out.println(nombre + " trae la pelota");
// TODO:     }
// TODO: }

// PASO 3: Main - prueba herencia
// PISTA: crea Perro("Rex", 3)
// PISTA: llama dormir() (heredado)
// PISTA: llama traerPelota() (propio)
// TODO: public static void main(String[] args) {
// TODO:     PerroPlantilla perro = new PerroPlantilla("Rex", 3);
// TODO:     perro.dormir();
// TODO:     perro.traerPelota();
// TODO: }
