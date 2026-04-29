import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {
    //1. Crear el scanner
    Scanner scanner = new Scanner(System.in);
    // Se inicializa
    // Scanner Es una clase de Java que te da acceso a cosas del sistema operativo (como la pantalla, teclado, etc.)

    System.out.println("¿Cuál es tu nombre?");
    // out   Significa "salida" (output). Es la pantalla/consola.
    // println: Significa "print line" = "imprimir una línea". Muestra texto y luego baja de línea.
    // ("¿Cuál es tu nombre?") --> lo que se quiere mostrar El paréntesis indica que es parámetro de la función.
    // Conclusión: "En la pantalla (System.out), imprime una línea (println) con el texto: ¿Cuál es tu nombre?"

    // 2. Lee lo que escribes
    String nombre = scanner.nextLine();

    // 3. Cómo devuelve en consola
    System.out.println("Hola, " + nombre);
    
    scanner.close();

    }
}
