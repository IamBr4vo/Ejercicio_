import java.util.Scanner;
public class Ejercicio4Dos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int numero;
        do {
            System.out.print("Introduce un numero (negativo para salir): ");
            numero = sc.nextInt();
            if (numero >= 0) {
                contador++;
            }
        } while (numero >= 0);
        System.out.println("Se han introducido " + contador + " numeros.");
    }
}
