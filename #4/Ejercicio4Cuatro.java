import java.util.Scanner;
public class Ejercicio4Cuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numeros del 100 al 0 de 7 en 7:");
        for (int i = 100; i >= 0; i -= 7) {
            System.out.println(i);
            System.out.print("Presiona Enter para mostrar el siguiente número...");
            sc.nextLine();
        }
    }
}