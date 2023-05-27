import java.util.Scanner;
public class Ejercicio3Uno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();
        while(numero1<=0){
            System.out.println("numero incorrecto, ingrese un numero mayor a 0: ");
            numero1 = scanner.nextInt();
        }
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();
        while(numero2<=0){
            System.out.println("numero incorrecto, ingrese un numero mayor a 0");
            numero2 = scanner.nextInt();
        }
        if (numero1 == numero2) {
            System.out.println("Los numeros son iguales.");
        } else {
            System.out.println("Los numeros no son iguales.");
        }
    }
}
