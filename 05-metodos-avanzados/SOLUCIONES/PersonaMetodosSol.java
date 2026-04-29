/**
 * EJERCICIO 3: Persona - Void vs Retorno (SOLUCIÓN)
 *
 * Compara método void (imprime) vs método con retorno (devuelve)
 */
public class PersonaMetodosSol {

    // Método VOID - imprime directamente
    public void mostrarInfo(String nombre, int edad) {
        System.out.println("Hola, " + nombre + ", " + edad + " años");
    }

    // Método CON RETORNO - devuelve String
    public String getInfo(String nombre, int edad) {
        return nombre + " (" + edad + " años)";
    }

    public static void main(String[] args) {
        PersonaMetodosSol p = new PersonaMetodosSol();

        // Void - imprime directamente
        System.out.println("[VOID]");
        p.mostrarInfo("Juan", 25);

        // Con retorno - captura el valor
        System.out.println("\n[RETORNO]");
        String info = p.getInfo("Juan", 25);
        System.out.println("La información es: " + info);

        // Comparación
        System.out.println("\n[COMPARACIÓN]");
        System.out.println("- Void: no puedo reutilizar el valor");
        System.out.println("- Con retorno: puedo usar el valor donde quiera");
    }
}
