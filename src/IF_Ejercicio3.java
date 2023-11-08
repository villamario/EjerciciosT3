import java.util.Scanner;

public class IF_Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un número");
        int numero = teclado.nextInt();
        if (((numero % 20) == 0) && ((numero > -100) && (numero < 100))){
            System.out.println("Es múltiplo de 20 y está entre -100 y 100");
        } else if (((numero % 20) != 0) && ((numero < -100) || (numero > 100))){
            System.out.println("No múltiplo de 20 y no está entre -100 y 100");
        } else if (((numero % 20) == 0) && ((numero < -100) || (numero > 100))){
            System.out.println("Es múltiplo de 20 y no está entre -100 y 100");
        }else {
            System.out.println("No es múltiplo de 20 y está entre -100 y 100");
            }
        }
    }
