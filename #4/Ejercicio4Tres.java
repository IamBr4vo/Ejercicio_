import java.util.Scanner;
public class Ejercicio4Tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero para adivinar: ");
        int numeroAdivinar = sc.nextInt();
        while(numeroAdivinar<=0){
            System.out.print("Numero incorrecto, ingrese otro: ");
            numeroAdivinar = sc.nextInt();
        }
        boolean adivinado = false;
        while (!adivinado) {
        System.out.print("Introduce tu intento: ");
        int intento = sc.nextInt();
        if (intento == numeroAdivinar) {
            adivinado = true;
            System.out.println("Adivinaste! El numero era " + numeroAdivinar);
            } else if (intento < numeroAdivinar) {
                System.out.println("Mayor");
            } else {
                System.out.println("Menor");
            }
        }
    }
}
        
    
