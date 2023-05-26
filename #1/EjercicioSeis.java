import java.util.Scanner;
public class EjercicioSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        while(num<=0){
            System.out.print("numero incorrecto, digite un numero entero ");
            num = input.nextInt();
        }
        Multiplicacion(num);
    }
    public static void Multiplicacion(int num) {
        for (int i = 1; i <= 10; i++) {
            int mult = num * i;
            System.out.println("El numero " + num + " multiplicado por " + i + " es: " + mult);
        }
    }
}
