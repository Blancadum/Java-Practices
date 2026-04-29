import java.util.Scanner;

/**
 * EJERCICIO 7: Pizzería - Menú interactivo (PLANTILLA)
 *
 * Menú repetitivo con:
 * 1. Ver menú
 * 2. Pedir pizza (tamaño + cantidad)
 * 3. Ver total
 * 4. Salir
 *
 * IMPORTANTE: Total y cantidad se mantienen (acumulan)
 */
public class MenuPizzeriaPlantilla {
    public static void main(String[] args) {
        // PASO 1: Crea Scanner
        // TODO: Scanner scanner = ...

        // PASO 2: Constantes con precios
        // TODO: final double PRECIO_PEQUEÑA = 8.50;
        // TODO: final double PRECIO_MEDIANA = 12.00;
        // TODO: final double PRECIO_GRANDE = 15.50;

        // PASO 3: Variables para acumular
        // TODO: double total = 0;
        // TODO: int pizzas = 0;
        // TODO: boolean salir = false;

        // PASO 4: BUCLE WHILE para menú principal
        // PISTA: while (!salir) { ... }
        // TODO: while (!salir) {
        // TODO:     System.out.println("\n=== PIZZERÍA ITALIA ===");
        // TODO:     System.out.println("1. Ver menú");
        // TODO:     System.out.println("2. Pedir pizza");
        // TODO:     System.out.println("3. Ver total");
        // TODO:     System.out.println("4. Salir");
        // TODO:     System.out.println("Elige opción:");

        // PASO 5: Lee opción CON VALIDACIÓN (hasNextInt)
        // TODO:     if (scanner.hasNextInt()) {
        // TODO:         int opcion = scanner.nextInt();
        // TODO:         scanner.nextLine();

        // PASO 6: SWITCH para cada opción
        // TODO:         switch (opcion) {

        // CASO 1: Ver menú
        // TODO:             case 1:
        // TODO:                 System.out.println("\n=== MENÚ ===");
        // TODO:                 System.out.println("Pequeña (25cm): €" + String.format("%.2f", PRECIO_PEQUEÑA));
        // TODO:                 System.out.println("Mediana (30cm): €" + String.format("%.2f", PRECIO_MEDIANA));
        // TODO:                 System.out.println("Grande (35cm): €" + String.format("%.2f", PRECIO_GRANDE));
        // TODO:                 break;

        // CASO 2: Pedir pizza
        // PISTA: Submenu para elegir tamaño (1/2/3)
        // PISTA: Luego pedir cantidad
        // PISTA: Acumula: total += precio * cantidad; pizzas += cantidad;
        // TODO:             case 2:
        // TODO:                 System.out.println("\n¿Qué tamaño quieres?");
        // TODO:                 System.out.println("1. Pequeña (€" + String.format("%.2f", PRECIO_PEQUEÑA) + ")");
        // TODO:                 System.out.println("2. Mediana (€" + String.format("%.2f", PRECIO_MEDIANA) + ")");
        // TODO:                 System.out.println("3. Grande (€" + String.format("%.2f", PRECIO_GRANDE) + ")");
        // TODO:                 System.out.println("Elige:");
        // TODO:                 if (scanner.hasNextInt()) {
        // TODO:                     int tamaño = scanner.nextInt();
        // TODO:                     scanner.nextLine();
        // TODO:                     double precioPizza = -1;
        // TODO:                     if (tamaño == 1) { precioPizza = PRECIO_PEQUEÑA; }
        // TODO:                     else if (tamaño == 2) { precioPizza = PRECIO_MEDIANA; }
        // TODO:                     else if (tamaño == 3) { precioPizza = PRECIO_GRANDE; }
        // TODO:                     else { System.out.println("❌ Opción no válida"); }
        // TODO:                     if (precioPizza > 0) {
        // TODO:                         System.out.println("¿Cuántas pizzas quieres?");
        // TODO:                         if (scanner.hasNextInt()) {
        // TODO:                             int cantidad = scanner.nextInt();
        // TODO:                             scanner.nextLine();
        // TODO:                             if (cantidad > 0) {
        // TODO:                                 total += precioPizza * cantidad;
        // TODO:                                 pizzas += cantidad;
        // TODO:                                 System.out.println("✅ Agregadas " + cantidad + " pizza(s)");
        // TODO:                             } else {
        // TODO:                                 System.out.println("❌ Cantidad debe ser > 0");
        // TODO:                             }
        // TODO:                         } else {
        // TODO:                             scanner.nextLine();
        // TODO:                             System.out.println("❌ Error: Número inválido");
        // TODO:                         }
        // TODO:                     }
        // TODO:                 } else {
        // TODO:                     scanner.nextLine();
        // TODO:                     System.out.println("❌ Error: Número inválido");
        // TODO:                 }
        // TODO:                 break;

        // CASO 3: Ver total
        // TODO:             case 3:
        // TODO:                 if (pizzas == 0) {
        // TODO:                     System.out.println("📭 No has pedido ninguna pizza");
        // TODO:                 } else {
        // TODO:                     System.out.println("\n=== TOTAL ===");
        // TODO:                     System.out.println("Pizzas: " + pizzas);
        // TODO:                     System.out.println("Total: €" + String.format("%.2f", total));
        // TODO:                 }
        // TODO:                 break;

        // CASO 4: Salir
        // TODO:             case 4:
        // TODO:                 salir = true;
        // TODO:                 System.out.println("👋 ¡Gracias por tu compra!");
        // TODO:                 if (total > 0) {
        // TODO:                     System.out.println("Total a pagar: €" + String.format("%.2f", total));
        // TODO:                 }
        // TODO:                 break;

        // CASO default
        // TODO:             default:
        // TODO:                 System.out.println("❌ Opción no válida");
        // TODO:         }
        // TODO:     } else {
        // TODO:         scanner.nextLine();
        // TODO:         System.out.println("❌ Error: Debes introducir un número");
        // TODO:     }
        // TODO: }

        // PASO 7: Cierra Scanner
        // TODO: scanner.close();
    }
}
