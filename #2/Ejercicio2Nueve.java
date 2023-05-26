import java.util.Scanner;
public class Ejercicio2Nueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);          
        int numero;
        int suma = 0;
        System.out.println("Ingrese números (ingrese 0 para finalizar):");
        do {
            numero = scanner.nextInt();
            if (numero<=0){
                System.out.print("numero incorrecto, digite un numero entero ");
                numero = scanner.nextInt();
            }
            suma += numero;
        } while (numero != 0);
        System.out.println("La suma de los números ingresados es: " + suma);
    }
} 
