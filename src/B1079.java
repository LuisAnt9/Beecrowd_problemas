import java.util.Locale;
import java.util.Scanner;

public class B1079 {
public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);


    int N = scanner.nextInt();

    for (int i = 0; i < N; i++) {
        double valor1 = scanner.nextDouble();
        double valor2 = scanner.nextDouble();
        double valor3 = scanner.nextDouble();

        double media = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10.0;

        System.out.printf("%.1f\n", media);
    }

        scanner.close();
    }
}
