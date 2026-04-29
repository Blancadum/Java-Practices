/**
 * EJERCICIO 4: Descuento (PLANTILLA)
 *
 * Crea 3 métodos con el mismo nombre pero diferente parámetros (SOBRECARGA)
 */
public class DescuentoPlantilla {

    // PASO 1: Método calcular - Versión 1
    // PISTA: recibe precio (double)
    // PISTA: return precio sin cambios
    // TODO: public double calcular(double precio) {
    // TODO:     return precio;
    // TODO: }

    // PASO 2: Método calcular - Versión 2
    // PISTA: recibe precio (double) y porcentaje (double)
    // PISTA: calcula: precio - (precio * porcentaje / 100)
    // PISTA: return el resultado
    // TODO: public double calcular(double precio, double porcentaje) {
    // TODO:     double descuento = precio * porcentaje / 100;
    // TODO:     return precio - descuento;
    // TODO: }

    // PASO 3: Método calcular - Versión 3
    // PISTA: recibe cantidad (int) y precioUnitario (double)
    // PISTA: calcula total: cantidad * precioUnitario
    // PISTA: aplica 10% descuento: total - (total * 0.10)
    // PISTA: return el resultado
    // TODO: public double calcular(int cantidad, double precioUnitario) {
    // TODO:     double total = cantidad * precioUnitario;
    // TODO:     return total - (total * 0.10);
    // TODO: }

    // PASO 4: Main - llama cada versión
    // PISTA: desc1 = calcular(100.0)  [1 parámetro]
    // PISTA: desc2 = calcular(100.0, 20.0)  [2 parámetros]
    // PISTA: desc3 = calcular(5, 20.0)  [int y double]
    // PISTA: imprime cada resultado con etiqueta
    // TODO: public static void main(String[] args) {
    // TODO:     DescuentoPlantilla desc = new DescuentoPlantilla();
    // TODO:
    // TODO:     // Versión 1
    // TODO:     double v1 = desc.calcular(100.0);
    // TODO:     System.out.println("Precio sin descuento: " + v1);
    // TODO:
    // TODO:     // Versión 2
    // TODO:     double v2 = desc.calcular(100.0, 20.0);
    // TODO:     System.out.println("Precio con 20% descuento: " + v2);
    // TODO:
    // TODO:     // Versión 3
    // TODO:     double v3 = desc.calcular(5, 20.0);
    // TODO:     System.out.println("Total 5 × 20€ con 10% = " + v3);
    // TODO: }
}
