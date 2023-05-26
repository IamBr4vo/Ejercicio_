import java.util.Scanner;
public class Ejercicio2Once {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sueldos;
        int mayor=0;
        System.out.println("Ingrese los sueldps (ingrese 0 para finalizar):");
        do {
            sueldos = scanner.nextInt();
            if (sueldos<0){
                System.out.print("sueldo incorrecto, digite uno valido");
                sueldos = scanner.nextInt();
            }
            if (sueldos>=mayor){
                mayor=sueldos; 
            }
        } while(sueldos != 0);
        System.out.print("El sueldo mayor es " + mayor);
    }
}
