import java.util.Scanner;
public class Ejercicio2Doce {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);
        int contadorNegativos = 0;
        System.out.println("Por favor, introduce 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            if (numero < 0) {
                contadorNegativos++;
            }
            while (numero == 0) {
                System.out.println("El numero no puede ser cero ingresalo nuevamente: ");
                numero = scanner.nextInt();
            }

            numeros[i] = numero;
        }
        System.out.println("Se ha introducido " + contadorNegativos + " numeros negativos.");
    }
}
