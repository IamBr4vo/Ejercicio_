import java.util.Scanner;
public class Ejercicio3Seis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la hora: ");
        int h = scanner.nextInt();
        System.out.print("Ingresa los minutos: ");
        int m = scanner.nextInt();
        System.out.print("Ingresa los segundos: ");
        int s = scanner.nextInt();
        if (horaValida(h, m, s)) {
            System.out.println("La hora ingresada " +h+":"+m+":"+s+ " es válida.");
        } else {
            System.out.println("La hora ingresada no es válida.");
        }
    }
    public static boolean horaValida(int h, int m, int s) {
        boolean esValida = true;
        if (h < 0 || h > 23) {
            esValida = false;
        }
        if (m < 0 || m > 59) {
            esValida = false;
        }
        if (s < 0 || s > 59) {
            esValida = false;
        }
        return esValida;
    }
}


