import java.util.Random;

/**
 * EJERCICIO 2: Conversor - Multiple Catch (SOLUCIÓN)
 */
public class ConvertsorSol {

    public int convertirNumero(String texto) {
        try {
            int numero = Integer.parseInt(texto);
            int resultado = numero / (new Random().nextInt(5) - 2);
            return resultado;
        } catch (NumberFormatException e) {
            System.out.println("❌ No es un número válido");
            return -1;
        } catch (ArithmeticException e) {
            System.out.println("❌ División por 0");
            return -1;
        }
    }

    public static void main(String[] args) {
        ConvertsorSol conv = new ConvertsorSol();

        System.out.println("Convertir \"25\":");
        int r1 = conv.convertirNumero("25");

        System.out.println("\nConvertir \"abc\":");
        int r2 = conv.convertirNumero("abc");

        System.out.println("\n✅ El programa continúa sin fallar");
    }
}
