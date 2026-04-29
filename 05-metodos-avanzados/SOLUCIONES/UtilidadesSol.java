/**
 * EJERCICIO 5: Utilidades (SOLUCIÓN)
 *
 * MÉTODOS ESTÁTICOS - NO necesitan instancia
 */
public class UtilidadesSol {

    // Método estático: verifica si alguien es adulto
    public static boolean esAdulto(int edad) {
        return edad >= 18;
    }

    // Método estático: convierte Celsius a Fahrenheit
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Método estático: valida que email contenga @
    public static boolean emailValido(String email) {
        return email.contains("@");
    }

    public static void main(String[] args) {
        // Llamar métodos estáticos SIN crear instancia
        // Formato: ClassName.metodoStatico()

        System.out.println("=== VERIFICAR ADULTOS ===");
        System.out.println("¿25 es adulto? " + UtilidadesSol.esAdulto(25));
        System.out.println("¿15 es adulto? " + UtilidadesSol.esAdulto(15));
        System.out.println("¿18 es adulto? " + UtilidadesSol.esAdulto(18));

        System.out.println("\n=== CONVERSIÓN TEMPERATURAS ===");
        System.out.println("0°C = " + UtilidadesSol.celsiusAFahrenheit(0) + "°F");
        System.out.println("10°C = " + UtilidadesSol.celsiusAFahrenheit(10) + "°F");
        System.out.println("100°C = " + UtilidadesSol.celsiusAFahrenheit(100) + "°F");

        System.out.println("\n=== VALIDAR EMAILS ===");
        System.out.println("¿juan@mail.com es válido? " + UtilidadesSol.emailValido("juan@mail.com"));
        System.out.println("¿juanmail.com es válido? " + UtilidadesSol.emailValido("juanmail.com"));
        System.out.println("¿maria@ejemplo.es es válido? " + UtilidadesSol.emailValido("maria@ejemplo.es"));

        System.out.println("\n✅ Métodos estáticos: útiles para funciones que NO necesitan estado");
    }
}
