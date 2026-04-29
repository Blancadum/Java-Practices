import java.util.Scanner;

public class Suma{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
    // 1. Pedir número 1
    System.out.println("Introduce número 1:");
    int numero1 = scanner.nextInt();

    // 2. Pedir número 2
    System.out.println("Introduce número 2:");
    int numero2 = scanner.nextInt();
    // 3. Pedir número 3

    System.out.println("Introduce número 3:");
    int numero3 = scanner.nextInt();
    // 4. Sumar
    int suma = numero1 + numero2 + numero3;
    // 5. Mostrar resultado
    System.out.println("La suma es: " + suma);
    scanner.close();
    }
}