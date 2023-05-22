import java.util.Scanner;
public class EjercicioDos{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un numero en celsius");
        double celsius = input.nextDouble();
        double fahrenheit =(9.0/5)*celsius + 32;
        System.out.println("el resultado en fahrenheit es:"+ fahrenheit);
    }
}