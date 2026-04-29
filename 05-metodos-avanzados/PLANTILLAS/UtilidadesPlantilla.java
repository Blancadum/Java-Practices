/**
 * EJERCICIO 5: Utilidades (PLANTILLA)
 *
 * Crea métodos ESTÁTICOS que NO necesitan instancia
 */
public class UtilidadesPlantilla {

    // PASO 1: Método estático esAdulto
    // PISTA: recibe edad (int)
    // PISTA: return true si edad >= 18, false si no
    // PISTA: NO necesita this (es static)
    // TODO: public static boolean esAdulto(int edad) {
    // TODO:     return edad >= 18;
    // TODO: }

    // PASO 2: Método estático celsiusAFahrenheit
    // PISTA: recibe celsius (double)
    // PISTA: fórmula: (celsius * 9/5) + 32
    // PISTA: return el resultado en Fahrenheit
    // TODO: public static double celsiusAFahrenheit(double celsius) {
    // TODO:     return (celsius * 9 / 5) + 32;
    // TODO: }

    // PASO 3: Método estático emailValido
    // PISTA: recibe email (String)
    // PISTA: return true si contiene "@", false si no
    // PISTA: pista: email.contains("@")
    // TODO: public static boolean emailValido(String email) {
    // TODO:     return email.contains("@");
    // TODO: }

    // PASO 4: Main - llama métodos SIN crear instancia
    // PISTA: usa Utilidades.esAdulto(25) directamente
    // PISTA: NO necesitas: Utilidades util = new Utilidades();
    // PISTA: prueba esAdulto con 25 y 15
    // PISTA: prueba celsiusAFahrenheit con 10
    // PISTA: prueba emailValido con emails válidos e inválidos
    // TODO: public static void main(String[] args) {
    // TODO:     System.out.println("¿25 es adulto? " + UtilidadesPlantilla.esAdulto(25));
    // TODO:     System.out.println("¿15 es adulto? " + UtilidadesPlantilla.esAdulto(15));
    // TODO:
    // TODO:     System.out.println("10°C = " + UtilidadesPlantilla.celsiusAFahrenheit(10) + "°F");
    // TODO:
    // TODO:     System.out.println("¿juan@mail.com es válido? " + UtilidadesPlantilla.emailValido("juan@mail.com"));
    // TODO:     System.out.println("¿juanmail.com es válido? " + UtilidadesPlantilla.emailValido("juanmail.com"));
    // TODO: }
}
