import java.util.Scanner;
public class Ejercicio2Uno {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        while(numero==0){
            System.out.print("numero incorrecto, digite un numero entero ");
            numero = scanner.nextInt();
        }
        if (numero >= 0) {
            System.out.print("El numero es positivo");
        } else {
            System.out.print("El numero es negativo");
        }
    }
}