import java.util.Scanner;
public class Ejercicio3Cuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un año: ");
        int año = scanner.nextInt();
        while(año<=0){
            System.out.println("año incorrecto, ingreselo nuevamente: ");
            año = scanner.nextInt();
        }
        boolean esBisiesto = false;
        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
            esBisiesto = true;
        }
        if (esBisiesto) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
    }
}