import java.util.Scanner;
public class Ejercicio4Seis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sumaSalarios = 0;
        int contadorMayores = 0;
        System.out.println("Introduce 10 salarios:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Salario " + i + ": ");
            double salario = sc.nextDouble();
            while(salario<=0){
                System.out.print("Salario incorrecto, ingrese otro: ");
                salario = sc.nextInt();
            }
            sumaSalarios += salario;
            if (salario > 10000) {
                contadorMayores++;
            }
        }
        System.out.println("La suma de los salarios es: " + sumaSalarios);
        System.out.println("Hay " + contadorMayores + " salarios mayores a 10000 colones.");
    }
}