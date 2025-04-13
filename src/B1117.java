import java.util.Locale;
import java.util.Scanner;

public class B1117 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

       double nota1 = entrada.nextDouble();

       while (nota1 < 0 || nota1 > 10) {
           System.out.println("nota invalida");
           nota1 = entrada.nextDouble();
       }

       double nota2 = entrada.nextDouble();

       while (nota2 < 0 || nota2 > 10) {
           System.out.println("nota invalida");
           nota2 = entrada.nextDouble();
       }

       double media = (nota1 + nota2) / 2;
        System.out.printf("media = %.2f%n", media);



        entrada.close();
    }
}
