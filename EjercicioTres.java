import java.util.Scanner;
import java.lang.Math;
public class EjercicioTres{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el radio del circulo");
        double radio = input.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;
        System.out.println("el resultado del area del circulo es: "+ area);
        System.out.println("el resultado del perimetro circulo es: "+ perimetro);
    }
}