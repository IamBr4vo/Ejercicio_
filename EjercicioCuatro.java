import java.util.Scanner;
public class EjercicioCuatro{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double num1 = input.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double num2 = input.nextDouble();
        double Suma = num1 + num2;
        double Resta = num1 - num2;
        double Div = num1 / num2;
        double Mult = num1 * num2; 
        System.out.println("el resultado de la suma es: "+ Suma);
        System.out.println("el resultado de la Resta es: "+ Resta);
        System.out.println("el resultado de la Divición es: "+ Div);
        System.out.println("el resultado de la Multiplicación es: "+ Mult);
    }
}
