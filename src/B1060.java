import java.util.Locale;
import java.util.Scanner;

public class B1060 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[6];
        int contador = 0;

        for (int i = 0; i < valores.length; i++) {
            valores[i] = scanner.nextDouble();
        }

        for (double num : valores) {
            if (num > 0) {
                contador++;
            }
        }
        System.out.println(contador + " valores positivos");
    }
}
