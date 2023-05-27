import java.util.Scanner;
public class Ejercicio3Dos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero entero: ");
        int numero = scanner.nextInt();
        while(numero<=0){
            System.out.println("numero incorrecto, ingrese un numero mayor a 0: ");
            numero = scanner.nextInt();
        }
        int doble = numero * 2;
        int triple = numero * 3;
        System.out.println("El doble del numero es: " + doble);
        System.out.println("El triple del numero es: " + triple);
    }
}