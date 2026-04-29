/**
 * EJERCICIO 1: Calculadora - Try-Catch Básico (SOLUCIÓN)
 */
public class CalculadoraSol {

    public int dividir(int a, int b) {
        try {
            int resultado = a / b;
            return resultado;
        } catch (ArithmeticException e) {
            System.out.println("❌ No se puede dividir entre 0");
            return -1;
        }
    }

    public static void main(String[] args) {
        CalculadoraSol calc = new CalculadoraSol();

        int r1 = calc.dividir(10, 2);
        System.out.println("Dividir 10 / 2 = " + r1);

        int r2 = calc.dividir(10, 0);
        System.out.println("Dividir 10 / 0 = " + r2);
    }
}
