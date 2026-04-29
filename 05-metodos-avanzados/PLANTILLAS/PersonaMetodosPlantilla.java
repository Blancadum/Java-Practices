/**
 * EJERCICIO 3: Persona - Void vs Retorno (PLANTILLA)
 *
 * Crea 2 métodos: uno que imprime (void) y otro que retorna (String)
 */
public class PersonaMetodosPlantilla {

    // PASO 1: Método VOID que imprime
    // PISTA: recibe nombre (String) y edad (int)
    // PISTA: imprime: "Hola, " + nombre + ", " + edad + " años"
    // PISTA: NO retorna nada (void)
    // TODO: public void mostrarInfo(String nombre, int edad) {
    // TODO:     System.out.println("Hola, " + nombre + ", " + edad + " años");
    // TODO: }

    // PASO 2: Método CON RETORNO que devuelve String
    // PISTA: recibe nombre (String) y edad (int)
    // PISTA: return nombre + " (" + edad + " años)"
    // PISTA: retorna String para que lo use quien quiera
    // TODO: public String getInfo(String nombre, int edad) {
    // TODO:     return nombre + " (" + edad + " años)";
    // TODO: }

    // PASO 3: Main - prueba ambos
    // PISTA: llama mostrarInfo (void) - no guardas resultado
    // PISTA: llama getInfo (retorno) - guardas en variable String
    // PISTA: imprime el resultado de getInfo
    // PISTA: nota la diferencia: void vs retorno
    // TODO: public static void main(String[] args) {
    // TODO:     PersonaMetodosPlantilla p = new PersonaMetodosPlantilla();
    // TODO:
    // TODO:     // Void - imprime directamente
    // TODO:     System.out.println("[VOID]");
    // TODO:     p.mostrarInfo("Juan", 25);
    // TODO:
    // TODO:     // Con retorno - captura el valor
    // TODO:     System.out.println("[RETORNO]");
    // TODO:     String info = p.getInfo("Juan", 25);
    // TODO:     System.out.println("La información es: " + info);
    // TODO: }
}
