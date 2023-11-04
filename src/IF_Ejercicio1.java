import javax.swing.*;
import java.net.PortUnreachableException;
import java.util.Scanner;

public class IF_Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame el número 1");
        int numero1 = teclado.nextInt();
        System.out.println("Número 1: "+numero1);
        System.out.println("Dame el número 2");
        int numero2 = teclado.nextInt();
        System.out.println("Número 2: "+numero2);

       if (numero1>numero2) {
        System.out.println("El primero es mayor que el segundo");

    } else{
            System.out.println("El segundo es mayor que el primero");
       }
    }
}
