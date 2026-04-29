/**
 * EJERCICIO 2: Estudiante (PLANTILLA)
 *
 * Crea un método con múltiples parámetros y validación
 */
public class EstudiantePlantilla {

    // PASO 1: Método calcularMedia con validación
    // PISTA: recibe nombre (String), n1, n2, n3 (double)
    // PISTA: validar que cada nota sea >= 0 y <= 10
    // PISTA: si hay error, throw new IllegalArgumentException("Nota inválida")
    // PISTA: calcular media: (n1 + n2 + n3) / 3
    // TODO: public double calcularMedia(String nombre, double n1, double n2, double n3) {
    // TODO:     // Validar
    // TODO:     // Calcular
    // TODO:     // Return
    // TODO: }

    // PASO 2: Método auxiliar para imprimir (opcional)
    // PISTA: recibe nombre y media
    // PISTA: System.out.println("Media de " + nombre + ": " + media);
    // TODO: private void mostrarMedia(String nombre, double media) {
    // TODO:     System.out.println("Media de " + nombre + ": " + media);
    // TODO: }

    // PASO 3: Main - prueba con ejemplos
    // PISTA: prueba con Juan: 7.5, 8.0, 9.0
    // PISTA: prueba con María: 6.0, 7.5, 8.0
    // PISTA: intenta con nota inválida (15) para probar validación
    // TODO: public static void main(String[] args) {
    // TODO:     EstudiantePlantilla est = new EstudiantePlantilla();
    // TODO:     double media1 = est.calcularMedia("Juan", 7.5, 8.0, 9.0);
    // TODO:     est.mostrarMedia("Juan", media1);
    // TODO:     // Más pruebas...
    // TODO: }
}
