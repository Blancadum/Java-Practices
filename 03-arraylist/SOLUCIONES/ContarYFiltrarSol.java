import java.util.ArrayList;

/**
 * EJERCICIO 5: Contar y Filtrar (SOLUCIÓN)
 *
 * Contar mayores y menores de edad, mostrar separados
 */
public class ContarYFiltrarSol {
    public static void main(String[] args) {
        // ArrayList de edades
        ArrayList<Integer> edades = new ArrayList<>();
        edades.add(15);
        edades.add(25);
        edades.add(17);
        edades.add(30);
        edades.add(16);
        edades.add(22);
        edades.add(18);

        // Contadores
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;

        // Contar
        for (int edad : edades) {
            if (edad >= 18) {
                mayoresDeEdad++;
            } else {
                menoresDeEdad++;
            }
        }

        // ArrayLists filtrados
        ArrayList<Integer> mayores = new ArrayList<>();
        ArrayList<Integer> menores = new ArrayList<>();

        // Llenar
        for (int edad : edades) {
            if (edad >= 18) {
                mayores.add(edad);
            } else {
                menores.add(edad);
            }
        }

        // Mostrar
        System.out.println("Total de edades: " + edades.size());
        System.out.println("Mayores de edad (>= 18): " + mayoresDeEdad);
        System.out.println("Menores de edad (< 18): " + menoresDeEdad);

        System.out.println("\nMayores de edad: ");
        for (int i = 0; i < mayores.size(); i++) {
            System.out.print(mayores.get(i));
            if (i < mayores.size() - 1) System.out.print(", ");
        }

        System.out.println("\nMenores de edad: ");
        for (int i = 0; i < menores.size(); i++) {
            System.out.print(menores.get(i));
            if (i < menores.size() - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
