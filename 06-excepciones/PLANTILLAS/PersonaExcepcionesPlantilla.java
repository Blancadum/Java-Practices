/**
 * EJERCICIO 4: Persona - Excepciones Personalizadas (PLANTILLA)
 *
 * Usa tu propia excepción (Step 2/2)
 */
public class PersonaExcepcionesPlantilla {
    private String nombre;
    private int edad;

    // PASO 1: Constructor
    // TODO: public PersonaExcepcionesPlantilla(String nombre) {
    // TODO:     this.nombre = nombre;
    // TODO:     this.edad = 0;
    // TODO: }

    // PASO 2: Método setEdad que lanza excepción
    // PISTA: recibe edad (int)
    // PISTA: declara throws EdadInvalidaException
    // PISTA: si edad < 0 o > 150, throw new EdadInvalidaException(...)
    // PISTA: si es válida, guardar y mostrar "✅ Edad establecida"
    // TODO: public void setEdad(int edad) throws EdadInvalidaExceptionPlantilla {
    // TODO:     if (edad < 0 || edad > 150) {
    // TODO:         throw new EdadInvalidaExceptionPlantilla("Edad debe estar entre 0 y 150");
    // TODO:     }
    // TODO:     this.edad = edad;
    // TODO:     System.out.println("✅ Edad establecida");
    // TODO: }

    // PASO 3: Getter
    // TODO: public int getEdad() {
    // TODO:     return edad;
    // TODO: }

    // PASO 4: Main - usa try-catch
    // PISTA: crea Persona("Juan")
    // PISTA: en try, setEdad(25)
    // PISTA: en otro try, setEdad(-5)
    // PISTA: catch EdadInvalidaException en cada uno
    // TODO: public static void main(String[] args) {
    // TODO:     PersonaExcepcionesPlantilla p = new PersonaExcepcionesPlantilla("Juan");
    // TODO:
    // TODO:     try {
    // TODO:         System.out.println("Establecer edad 25:");
    // TODO:         p.setEdad(25);
    // TODO:     } catch (EdadInvalidaExceptionPlantilla e) {
    // TODO:         System.out.println("❌ " + e.getMessage());
    // TODO:     }
    // TODO:
    // TODO:     try {
    // TODO:         System.out.println("Establecer edad -5:");
    // TODO:         p.setEdad(-5);
    // TODO:     } catch (EdadInvalidaExceptionPlantilla e) {
    // TODO:         System.out.println("❌ " + e.getMessage());
    // TODO:     }
    // TODO: }
}
