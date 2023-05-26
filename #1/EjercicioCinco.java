import java.util.Scanner;
public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = input.nextInt();
        while(numero<=0){
            System.out.print("numero incorrecto, digite un numero entero ");
            numero = input.nextInt();
        }
        int acum = 1;
        for (int i = 1; i <= numero; i++) {
            acum = acum * i;
            System.out.println("Factorial " +i+ " de " +numero+ " es " +acum);
        };
    }
}