import java.util.Scanner;
public class Ejercicio2Dos {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el multiplo: ");
        int num2 = scanner.nextInt();
        while(num1<=0){
            System.out.print("numero incorrecto, digite un numero entero ");
            num1 = scanner.nextInt();
        }
        while(num2<=0){
            System.out.print("numero incorrecto, digite un numero entero ");
            num2 = scanner.nextInt();
        }
        if (num1 % num2 == 0) {
            System.out.print("El numero " + num1 + " si es multiplo de "+ num2);
        } else {
            System.out.print("El numero " + num1 + " no es multiplo de " + num2);
        }
    }
}
