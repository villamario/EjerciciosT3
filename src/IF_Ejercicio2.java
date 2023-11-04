import javax.swing.*;
import java.util.Scanner;

public class IF_Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame el número 1");
        int numero1 = teclado.nextInt();
        System.out.println("El número 1 es " + numero1);

        System.out.println("Dame el número 2");
        int numero2 = teclado.nextInt();
        System.out.println("El número 2 es " + numero2);

        System.out.println("Dame el número 3");
        int numero3 = teclado.nextInt();
        System.out.println("El número 3 es " + numero3);

        if ((numero3+numero2)==numero1) {
            System.out.println(numero3+ " + " +numero2+ " = " +numero1);
        }
        else if ((numero2+numero1)==numero3) {
            System.out.println(numero2+ " + " +numero1+ " = " +numero3);

        }else if ((numero3+numero1)==numero2) {
            System.out.println(numero3+ " + " +numero1+ " = " +numero2);
        }else {
            System.out.println(" Ninguno es suma de los otros dos");
            }
        }
    }

