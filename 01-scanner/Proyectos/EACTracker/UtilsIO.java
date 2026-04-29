package Scanner.Proyectos.EACTracker;
import java.util.Scanner;

public class UtilsIO {
    private Scanner sc = new Scanner(System.in);

    /**
     * Pide una cadena al usuario (puede estar vacía)
     */
    public String askString(String msg) {
        System.out.print(msg);
        return sc.nextLine().trim();
    }

    /**
     * Pide una cadena que NO puede estar vacía
     */
    public String askNotEmpty(String msg) {
        while (true) {
            String s = askString(msg);
            if (!s.isEmpty()) {
                return s;
            }
            System.out.println(Constants.ERROR_EMPTY);
        }
    }

    /**
     * Pide un número entero (valida hasta que sea número)
     */
    public int askInt(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(Constants.ERROR_INT);
            }
        }
    }

    /**
     * Muestra un mensaje normal
     */
    public void show(String msg) {
        System.out.println(msg);
    }

    /**
     * Muestra un mensaje de error
     */
    public void showError(String msg) {
        System.out.println(msg);
    }
}
