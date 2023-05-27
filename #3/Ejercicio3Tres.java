import java.util.Scanner;
public class Ejercicio3Tres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero entero: ");
        int numero = scanner.nextInt();
        while(numero<=0){
            System.out.println("numero incorrecto, ingrese un numero mayor a 0: ");
            numero = scanner.nextInt();
        }
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println(numero + " es multiplo de tres y de cinco.");
        } else {
            System.out.println(numero + " no es multiplo de tres y de cinco.");
        }
    }
}
