import java.util.Scanner;

public class Switch_Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String caracter = teclado.next();
        switch (caracter) {
            case "a":
            case "A":
                System.out.println("Es una vocal");
                break;
            case "e":
            case "E":
                System.out.println("Es una vocal");
                break;
            case "i":
            case "I":
                System.out.println("Es una vocal");
                break;
            case "o":
            case "O":
                System.out.println("Es una vocal");
                break;
            case "u":
            case "U":
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("Es una consonante");
                break;
        }
    }
}
