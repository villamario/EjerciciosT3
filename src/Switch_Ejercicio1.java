import java.util.Scanner;

public class Switch_Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un número del 1 al 7");
        int numero = teclado.nextInt();
        switch (numero){
            case 1:
            System.out.println("el dia es lunes");
            break;
            case 2:
                System.out.println("el dia es martes");
                break;
            case 3:
                System.out.println("el dia es miércoles");
                break;
            case 4:
                System.out.println("el dia es jueves");
                break;
            case 5:
                System.out.println("el dia es viernes");
                break;
            case 6:
                System.out.println("el dia es sabado");
                break;
            case 7:
                System.out.println("el dia es domingo");
                break;
            default:
                System.out.println("no contemplado");
                break;
        }

    }
}
