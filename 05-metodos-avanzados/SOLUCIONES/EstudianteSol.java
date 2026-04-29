/**
 * EJERCICIO 2: Estudiante (SOLUCIÓN)
 *
 * Método con múltiples parámetros y validación
 */
public class EstudianteSol {

    public double calcularMedia(String nombre, double n1, double n2, double n3) {
        // Validar notas
        if (n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10 || n3 < 0 || n3 > 10) {
            throw new IllegalArgumentException("Nota inválida (debe estar entre 0 y 10)");
        }

        // Calcular media
        double media = (n1 + n2 + n3) / 3;
        return media;
    }

    private void mostrarMedia(String nombre, double media) {
        System.out.println("Media de " + nombre + ": " + media);
    }

    public static void main(String[] args) {
        EstudianteSol est = new EstudianteSol();

        // Caso 1: Juan con notas válidas
        try {
            double media1 = est.calcularMedia("Juan", 7.5, 8.0, 9.0);
            est.mostrarMedia("Juan", media1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Caso 2: María con notas válidas
        try {
            double media2 = est.calcularMedia("María", 6.0, 7.5, 8.0);
            est.mostrarMedia("María", media2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Caso 3: Pedro con nota inválida (intenta con 15)
        try {
            double media3 = est.calcularMedia("Pedro", 8.0, 9.0, 15.0);
            est.mostrarMedia("Pedro", media3);
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Error para Pedro: " + e.getMessage());
        }
    }
}
