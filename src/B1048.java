import java.util.Locale;
import java.util.Scanner;

public class B1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double salario = entrada.nextDouble();
        double novoSalario, reajusteGanho;
        int percentual;

        if (salario <= 400.00) {
            percentual = 15;
        } else if (salario <= 800.00) {
            percentual = 12;
        } else if (salario <=1200.00) {
            percentual = 10;
        } else if (salario <= 2000.00) {
            percentual = 7;
        } else {
            percentual = 4;
        }

        reajusteGanho = (salario * percentual) / 100;
        novoSalario = salario + reajusteGanho;

        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
        System.out.println("Em percentual: " + percentual + " %");



        entrada.close();
    }
}
