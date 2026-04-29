/**
 * EJERCICIO 1: Calculadora Básica (SOLUCIÓN)
 *
 * Método que calcula y retorna un valor
 */
public class CalculadoraBasicaSol {

    public int sumar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public static void main(String[] args) {
        CalculadoraBasicaSol calc = new CalculadoraBasicaSol();
        int resultado = calc.sumar(5, 3);
        System.out.println("suma de 5 + 3 = " + resultado);
    }
}
