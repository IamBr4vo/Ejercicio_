import java.util.Scanner;
public class Ejercicio2Seis {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Ingrese el dia: ");
        int dia = scanner.nextInt();
        while(dia<=0 || dia>31){
            System.out.print("dia incorrecto,ingrese otro: ");
            dia = scanner.nextInt();
        }
        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();
        while(mes<=0 || mes>12){
            System.out.print("mes incorrecto, ingrese otro: ");
            mes = scanner.nextInt();
        }
        System.out.print("Ingrese el año: ");
        int year = scanner.nextInt();
        while(year<=0 || year>3000){
            System.out.print("Año incorrecto, ingrese otro: ");
            year = scanner.nextInt();
        }
        System.out.print("La fecha "+dia+"/"+mes+"/"+year+ " es correcta");
    }
}
