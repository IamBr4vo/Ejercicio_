import java.util.Scanner;
public class Ejercicio4Uno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Introduce un número (negativo para salir): ");
            numero = sc.nextInt();
            if (numero >= 0) {
                int cuadrado = numero * numero;
                System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
            }
        } while (numero>=0);
        System.out.println("Has introducido un número negativo. Hasta luego!.");
    }
}
