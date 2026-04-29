import java.util.Scanner;

/**
 * EJERCICIO 6: Pizzería - Menú interactivo (SOLUCIÓN)
 *
 * Menú repetitivo:
 * 1. Ver menú
 * 2. Pedir pizza (tamaño y cantidad)
 * 3. Ver total
 * 4. Salir
 *
 * Concepto: while + switch + cálculos acumulativos
 */
public class MenuPizzeriaSol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Precios por tamaño
        final double PRECIO_PEQUEÑA = 8.50;
        final double PRECIO_MEDIANA = 12.00;
        final double PRECIO_GRANDE = 15.50;

        double total = 0;
        int pizzas = 0;

        boolean salir = false;

        while (!salir) {
            // Menú principal
            System.out.println("\n=== PIZZERÍA ITALIA ===");
            System.out.println("1. Ver menú");
            System.out.println("2. Pedir pizza");
            System.out.println("3. Ver total");
            System.out.println("4. Salir");
            System.out.println("Elige opción:");

            if (scanner.hasNextInt()) {
                int opcion = scanner.nextInt();
                scanner.nextLine();  // Limpiar buffer

                switch (opcion) {
                    case 1:
                        mostrarMenu(PRECIO_PEQUEÑA, PRECIO_MEDIANA, PRECIO_GRANDE);
                        break;

                    case 2:
                        double preciopizza = pedirPizza(scanner, PRECIO_PEQUEÑA, PRECIO_MEDIANA, PRECIO_GRANDE);
                        if (preciopizza > 0) {
                            System.out.println("¿Cuántas pizzas quieres?");
                            if (scanner.hasNextInt()) {
                                int cantidad = scanner.nextInt();
                                scanner.nextLine();
                                if (cantidad > 0) {
                                    total += preciopizza * cantidad;
                                    pizzas += cantidad;
                                    System.out.println("✅ Agregadas " + cantidad + " pizza(s)");
                                } else {
                                    System.out.println("❌ La cantidad debe ser mayor a 0");
                                }
                            } else {
                                scanner.nextLine();
                                System.out.println("❌ Error: Debes introducir un número");
                            }
                        }
                        break;

                    case 3:
                        mostrarTotal(pizzas, total);
                        break;

                    case 4:
                        salir = true;
                        System.out.println("👋 ¡Gracias por tu compra!");
                        if (total > 0) {
                            System.out.println("Total a pagar: €" + String.format("%.2f", total));
                        }
                        break;

                    default:
                        System.out.println("❌ Opción no válida");
                        break;
                }
            } else {
                scanner.nextLine();
                System.out.println("❌ Error: Debes introducir un número");
            }
        }

        scanner.close();
    }

    /**
     * Mostrar el menú de pizzas disponibles
     */
    private static void mostrarMenu(double p, double m, double g) {
        System.out.println("\n=== MENÚ ===");
        System.out.println("Pequeña (25cm): €" + String.format("%.2f", p));
        System.out.println("Mediana (30cm): €" + String.format("%.2f", m));
        System.out.println("Grande (35cm): €" + String.format("%.2f", g));
    }

    /**
     * Pedir una pizza y retornar su precio
     */
    private static double pedirPizza(Scanner scanner, double p, double m, double g) {
        System.out.println("\n¿Qué tamaño quieres?");
        System.out.println("1. Pequeña (€" + String.format("%.2f", p) + ")");
        System.out.println("2. Mediana (€" + String.format("%.2f", m) + ")");
        System.out.println("3. Grande (€" + String.format("%.2f", g) + ")");
        System.out.println("Elige:");

        if (scanner.hasNextInt()) {
            int tamaño = scanner.nextInt();
            scanner.nextLine();

            switch (tamaño) {
                case 1:
                    return p;
                case 2:
                    return m;
                case 3:
                    return g;
                default:
                    System.out.println("❌ Opción no válida");
                    return -1;
            }
        } else {
            scanner.nextLine();
            System.out.println("❌ Error: Debes introducir un número");
            return -1;
        }
    }

    /**
     * Mostrar el total actual
     */
    private static void mostrarTotal(int pizzas, double total) {
        if (pizzas == 0) {
            System.out.println("📭 No has pedido ninguna pizza");
        } else {
            System.out.println("\n=== TOTAL ===");
            System.out.println("Pizzas: " + pizzas);
            System.out.println("Total: €" + String.format("%.2f", total));
        }
    }
}
