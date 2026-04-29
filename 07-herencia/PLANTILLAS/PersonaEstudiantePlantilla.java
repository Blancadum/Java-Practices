/**
 * EJERCICIO 2: Persona y Estudiante - Super en Constructor (PLANTILLA)
 *
 * Usa super() para inicializar el padre
 */

// PASO 1: Crear clase PADRE Persona
// PISTA: atributos: nombre (String), edad (int)
// PISTA: constructor que reciba nombre y edad
// PISTA: getter getInfo() que retorna "Persona: {nombre}, {edad} años"
// TODO: public class PersonaPlantilla {
// TODO:     protected String nombre;
// TODO:     protected int edad;
// TODO:
// TODO:     public PersonaPlantilla(String nombre, int edad) {
// TODO:         this.nombre = nombre;
// TODO:         this.edad = edad;
// TODO:     }
// TODO:
// TODO:     public String getInfo() {
// TODO:         return "Persona: " + nombre + ", " + edad + " años";
// TODO:     }
// TODO: }

// PASO 2: Crear clase HIJA Estudiante
// PISTA: extends Persona
// PISTA: atributo propio: matricula (String)
// PISTA: constructor que reciba nombre, edad, matricula
// PISTA: llama super(nombre, edad)
// PISTA: asigna this.matricula = matricula
// PISTA: método getInfo() OVERRIDE que retorna info completa con matrícula
// TODO: public class EstudiantePlantilla extends PersonaPlantilla {
// TODO:     private String matricula;
// TODO:
// TODO:     public EstudiantePlantilla(String nombre, int edad, String matricula) {
// TODO:         super(nombre, edad);
// TODO:         this.matricula = matricula;
// TODO:     }
// TODO:
// TODO:     @Override
// TODO:     public String getInfo() {
// TODO:         return "Estudiante: " + nombre + ", " + edad + " años, Matrícula: " + matricula;
// TODO:     }
// TODO: }

// PASO 3: Main - prueba super
// PISTA: crea Estudiante("Juan", 20, "12345")
// PISTA: imprime getInfo()
// TODO: public static void main(String[] args) {
// TODO:     EstudiantePlantilla est = new EstudiantePlantilla("Juan", 20, "12345");
// TODO:     System.out.println(est.getInfo());
// TODO: }
