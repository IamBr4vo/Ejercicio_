import java.util.Scanner;
public class Ejercicio4Cinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        while(numero<=0){
            System.out.print("Numero incorrecto, ingrese otro: ");
            numero = sc.nextInt();
        }
        System.out.println("Numeros del 1 al " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
}
