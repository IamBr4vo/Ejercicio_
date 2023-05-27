import java.util.Scanner;
public class Ejercicio3Cinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double conversion = 1.6093;
        double millas;
        do {
            System.out.print("Ingresa una cantidad de millas (0 para salir): ");
            millas = scanner.nextDouble();
            while (millas < 0) {
                System.out.println("Millas incorrectas, ingreselas nuevamente: ");
                millas = scanner.nextDouble();
            }
            if (millas != 0) {
                double kilometros = millas * conversion;
                System.out.println(millas + " millas equivalen a " + kilometros + " kilometros.");
            }
        } while (millas != 0);
        System.out.println("Hasta luego!");
    }
}
