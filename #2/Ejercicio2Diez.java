import java.util.Scanner;
public class Ejercicio2Diez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros;
        int suma = 0;
        int cont = 0;
        System.out.println("Ingrese los 15 números: ");
        do {
            numeros = scanner.nextInt();
            if (numeros<=0){
                System.out.print("numero incorrecto, digite un numero entero ");
                numeros = scanner.nextInt();
            }
            suma += numeros;
            cont++;
        } while (cont != 15);
        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
