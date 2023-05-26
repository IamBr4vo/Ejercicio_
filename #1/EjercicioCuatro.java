import java.util.Scanner;
public class EjercicioCuatro{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = scanner.nextInt();
        while(num1<=0){
            System.out.println("el numero no puede ser menor a 0, digite otros numeros");
            num1 = scanner.nextInt();
        }
        while(num2<=0){
            System.out.println("el numero no puede ser menor a 0, digite otros numeros");
            num2 = scanner.nextInt();
        }
        int Suma = num1 + num2;
        int Resta = num1 - num2;
        double Div = (double) num1 / num2;
        int Mult = num1 * num2; 
        System.out.println("el resultado de la suma es: "+ Suma);
        System.out.println("el resultado de la Resta es: "+ Resta);
        System.out.println("el resultado de la Divición es: "+ Div);
        System.out.println("el resultado de la Multiplicación es: "+ Mult);
    }
}
