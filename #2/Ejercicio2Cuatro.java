import java.util.Scanner;
public class Ejercicio2Cuatro {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();
        while(numero1<=0){
            System.out.print("Numero incorrecto ingrese otro: ");
            numero1 = scanner.nextInt();
        }
        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();
        while(numero2<= 0){
            System.out.print("Numero incorrecto ingrese otro: ");
            numero2= scanner.nextInt();
        }
        System.out.print("Ingresa el tercer número: ");
        int numero3 = scanner.nextInt();
        while(numero3<=0){
            System.out.print("Numero incorrecto ingrese otro: ");
            numero3= scanner.nextInt();
        }
    if (numero1>numero2 && numero1>numero3){
        if (numero2>numero3) {
            System.out.print(numero1+ " " +numero2+ " " +numero3);
        }else{
            System.out.print(numero1+ " " +numero3+ " " +numero2);
        }
    }else if (numero2>numero1 && numero2>numero3){
        if (numero1>numero3){
            System.out.print(numero2+ " " +numero1+ " " +numero3);    
        }else{
            System.out.print(numero2+ " " +numero3+ " " +numero1);
        }
    }else if (numero3>numero1 && numero3>numero2){
        if (numero1 > numero2)
            System.out.print(numero3+ " " +numero1+ " " +numero2);
        }else{
            System.out.print(numero3+ " " +numero2+ " " +numero1);
        }
    }
}
    