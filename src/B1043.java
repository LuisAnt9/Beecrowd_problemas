import java.util.Locale;
import java.util.Scanner;

public class B1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        if(a + b > c && a + c > b && b + c > a) {
            double perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            double area = (a + b) * c / 2;
            System.out.printf("Area = %.1f\n", area);
        }

        entrada.close();
    }
}
