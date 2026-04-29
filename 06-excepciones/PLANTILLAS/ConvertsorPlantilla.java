import java.util.Random;

/**
 * EJERCICIO 2: Conversor - Multiple Catch (PLANTILLA)
 *
 * Atrapa diferentes tipos de excepciones
 */
public class ConvertsorPlantilla {

    // PASO 1: Método convertirNumero con multiple catch
    // PISTA: recibe un String
    // PISTA: en try, convierte con Integer.parseInt()
    // PISTA: luego intenta dividir por un número aleatorio (0-4, restando 2)
    // PISTA: catch NumberFormatException si texto no es número
    // PISTA: catch ArithmeticException si divide por 0
    // PISTA: muestra mensaje de error en cada caso
    // PISTA: return el resultado (o -1 si hay error)
    // TODO: public int convertirNumero(String texto) {
    // TODO:     try {
    // TODO:         int numero = Integer.parseInt(texto);
    // TODO:         int resultado = numero / (new Random().nextInt(5) - 2);
    // TODO:         return resultado;
    // TODO:     } catch (NumberFormatException e) {
    // TODO:         System.out.println("❌ No es un número válido");
    // TODO:         return -1;
    // TODO:     } catch (ArithmeticException e) {
    // TODO:         System.out.println("❌ División por 0");
    // TODO:         return -1;
    // TODO:     }
    // TODO: }

    // PASO 2: Main - prueba
    // PISTA: prueba con "25"
    // PISTA: prueba con "abc"
    // TODO: public static void main(String[] args) {
    // TODO:     ConvertsorPlantilla conv = new ConvertsorPlantilla();
    // TODO:
    // TODO:     System.out.println("Convertir \"25\":");
    // TODO:     int r1 = conv.convertirNumero("25");
    // TODO:
    // TODO:     System.out.println("\nConvertir \"abc\":");
    // TODO:     int r2 = conv.convertirNumero("abc");
    // TODO: }
}
