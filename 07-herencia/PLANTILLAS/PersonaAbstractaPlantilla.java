/**
 * EJERCICIO 5: Persona (abstracta), Ingeniero, Profesor, Medico - Clases Abstractas (PLANTILLA)
 *
 * Crea clase abstracta que fuerza implementación en hijas
 */

// PASO 1: Crear clase ABSTRACTA Persona
// PISTA: public abstract class Persona
// PISTA: atributos: nombre, edad (protected)
// PISTA: constructor que reciba nombre y edad
// PISTA: método ABSTRACTO: trabajar() (sin implementación)
// PISTA: método normal: presentarse() que imprime "Hola, soy {nombre}"
// TODO: public abstract class PersonaPlantilla {
// TODO:     protected String nombre;
// TODO:     protected int edad;
// TODO:
// TODO:     public PersonaPlantilla(String nombre, int edad) {
// TODO:         this.nombre = nombre;
// TODO:         this.edad = edad;
// TODO:     }
// TODO:
// TODO:     public abstract void trabajar();
// TODO:
// TODO:     public void presentarse() {
// TODO:         System.out.println("Hola, soy " + nombre);
// TODO:     }
// TODO: }

// PASO 2: Crear clase HIJA Ingeniero
// PISTA: extends Persona
// PISTA: constructor que llame super
// PISTA: IMPLEMENTA (no abstracto) trabajar() = "Escribo código"
// TODO: public class IngenieroplantillaPlantilla extends PersonaPlantilla {
// TODO:     public IngenieroplantillaPlantilla(String nombre, int edad) {
// TODO:         super(nombre, edad);
// TODO:     }
// TODO:
// TODO:     @Override
// TODO:     public void trabajar() {
// TODO:         System.out.println("Escribo código");
// TODO:     }
// TODO: }

// PASO 3: Crear clase HIJA Profesor
// PISTA: extends Persona
// PISTA: IMPLEMENTA trabajar() = "Enseño"
// TODO: public class ProfesorPlantilla extends PersonaPlantilla { ... }

// PASO 4: Crear clase HIJA Medico
// PISTA: extends Persona
// PISTA: IMPLEMENTA trabajar() = "Diagnostico"
// TODO: public class MedicoPlantilla extends PersonaPlantilla { ... }

// PASO 5: Main - uso de clase abstracta
// PISTA: NO puedes hacer: Persona p = new Persona();  ❌ ERROR
// PISTA: SÍ puedes hacer: Persona p = new Ingeniero();  ✅ OK
// PISTA: array de Persona: Persona[] personas
// PISTA: inicializa con 3 objetos diferentes
// PISTA: recorre y llama presentarse() y trabajar()
// TODO: public static void main(String[] args) {
// TODO:     PersonaPlantilla[] personas = {
// TODO:         new IngenieroplantillaPlantilla("Juan", 30),
// TODO:         new ProfesorPlantilla("María", 40),
// TODO:         new MedicoPlantilla("Carlos", 35)
// TODO:     };
// TODO:
// TODO:     for (PersonaPlantilla p : personas) {
// TODO:         p.presentarse();
// TODO:         p.trabajar();
// TODO:         System.out.println();
// TODO:     }
// TODO: }
