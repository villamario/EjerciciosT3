import java.util.Scanner;

public class For_Ejercicio1 {
    /*
    Se leerá el número de temperaturas a introducir (de ser 0 o negativo se establecerá a 10).
    Obténgase la media con dos decimales de las temperaturas introducidas por consola. (TemperaturasIntroducidas)
     */


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double media= 0;
        double TemperaturasIntroducidas= 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("introduce un número");
            TemperaturasIntroducidas = teclado.nextDouble();
            if (TemperaturasIntroducidas <= 0) {

              TemperaturasIntroducidas = 10;
              System.out.println("la temeperatura es: " +TemperaturasIntroducidas);

            } else {
                System.out.println("la temeperatura es: " + TemperaturasIntroducidas);

          }
            media = (TemperaturasIntroducidas + media);
        }
        media=media/4;
        System.out.println("La media de temperaturas es: " + media);
    }
}
