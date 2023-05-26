import java.util.Scanner;
public class Ejercicio2Ocho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Introduce un número (0 para salir): ");
            numero = scanner.nextInt();
            if (numero > 0) {
                System.out.println("El numero: " + numero + " es positivo");
            }else if (numero < 0) {
                System.out.println("El numero: " + numero + " es negativo");
            } 
        } while(numero != 0);
        System.out.println("¡Hasta luego!");
    }
}
