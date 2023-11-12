import java.util.Scanner;

public class For_Ejercicio2 {
    /*
    Leer un número entre 0 y 10. Se mostrará la tabla de multiplicar de dicho número
    con el formato: 5 x 3 = 15 (desde 0 hasta 10 en líneas distintas). (TablaDeMultiplicar)
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero = teclado.nextInt();
        for (int i = 0; i < 11; i++) {
        System.out.printf("%dx%d=%d \n",numero, i, i*numero);
        }
    }
}
