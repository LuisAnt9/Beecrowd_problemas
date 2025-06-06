import java.util.Locale;
import java.util.Scanner;

public class B1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();
        int n = (int) Math.round(valor * 100);

        int resultado100 = n / 10000;
        n %= 10000;

        int resultado50 = n / 5000;
        n %= 5000;

        int resultado20 = n / 2000;
        n %= 2000;

        int resultado10 = n / 1000;
        n %= 1000;

        int resultado5 = n / 500;
        n %= 500;

        int resultado2 = n / 200;
        n %= 200;

        int resultadoUmReal = n / 100;
        n %= 100;

        int resultadoMoeda50 = n / 50;
        n %= 50;

        int resultadoMoeda25 = n / 25;
        n %= 25;

        int resultadoMoeda10 = n / 10;
        n %= 10;

        int resultadoMoeda5 = n / 5;
        n %= 5;

        int resultadoMoeda1centavo = n;

        System.out.println("NOTAS:");
        System.out.println(resultado100 + " nota(s) de R$ 100.00");
        System.out.println(resultado50 + " nota(s) de R$ 50.00");
        System.out.println(resultado20 + " nota(s) de R$ 20.00");
        System.out.println(resultado10 + " nota(s) de R$ 10.00");
        System.out.println(resultado5 + " nota(s) de R$ 5.00");
        System.out.println(resultado2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(resultadoUmReal + " moeda(s) de R$ 1.00");
        System.out.println(resultadoMoeda50 + " moeda(s) de R$ 0.50");
        System.out.println(resultadoMoeda25 + " moeda(s) de R$ 0.25");
        System.out.println(resultadoMoeda10 + " moeda(s) de R$ 0.10");
        System.out.println(resultadoMoeda5 + " moeda(s) de R$ 0.05");
        System.out.println(resultadoMoeda1centavo + " moeda(s) de R$ 0.01");

        sc.close();
    }
}
