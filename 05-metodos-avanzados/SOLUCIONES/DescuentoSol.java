/**
 * EJERCICIO 4: Descuento (SOLUCIÓN)
 *
 * SOBRECARGA: 3 métodos con mismo nombre pero diferente parámetros
 */
public class DescuentoSol {

    // Versión 1: solo precio (sin descuento)
    public double calcular(double precio) {
        return precio;
    }

    // Versión 2: precio + porcentaje descuento
    public double calcular(double precio, double porcentaje) {
        double descuento = precio * porcentaje / 100;
        return precio - descuento;
    }

    // Versión 3: cantidad × precio unitario - 10%
    public double calcular(int cantidad, double precioUnitario) {
        double total = cantidad * precioUnitario;
        return total - (total * 0.10);
    }

    public static void main(String[] args) {
        DescuentoSol desc = new DescuentoSol();

        // Versión 1: sin descuento
        double v1 = desc.calcular(100.0);
        System.out.println("Precio sin descuento: " + v1);

        // Versión 2: con 20% descuento
        double v2 = desc.calcular(100.0, 20.0);
        System.out.println("Precio con 20% descuento: " + v2);

        // Versión 3: 5 unidades × 20€ con 10% descuento
        double v3 = desc.calcular(5, 20.0);
        System.out.println("Total 5 × 20€ con 10% = " + v3);

        // Java elige automáticamente la versión correcta
        System.out.println("\n✅ Java elige automáticamente la versión correcta:");
        System.out.println("- calcular(100.0) → versión 1");
        System.out.println("- calcular(100.0, 20.0) → versión 2");
        System.out.println("- calcular(5, 20.0) → versión 3");
    }
}
