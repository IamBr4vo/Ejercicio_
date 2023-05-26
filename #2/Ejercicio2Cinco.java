import java.util.Scanner;
public class Ejercicio2Cinco {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Ingresa el número entre el 1 y 9999 ");
        int numero = scanner.nextInt();
        while(numero<=0){
            System.out.print("numero incorrecto, digite un numero entero ");
            numero = scanner.nextInt();
        }
        int cantidad = 0;
        int contador = numero;
        while (contador>0){
          contador = contador/10;
          cantidad++;
        }
        System.out.println(numero + " tiene " + cantidad + " dígitos");
    }
}