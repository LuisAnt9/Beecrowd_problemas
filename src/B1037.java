import java.util.Locale;
import java.util.Scanner;

public class B1037 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        double N = leitura.nextDouble();

        if (N < 0 || N > 100.00) {
            System.out.println("Fora de intervalo");
        } else {
            if (N >= 0 && N <= 25.000) {
                System.out.println("Intervalo [0,25]");
            } else if (N <= 50.000) {
                System.out.println("Intervalo (25,50]");
            } else if (N <= 75.000) {
                System.out.println("Intervalo (50,75]");
            } else {
                System.out.println("Intervalo (75,100]");
            }
        }
    }
}