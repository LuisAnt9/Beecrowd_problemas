import java.util.Locale;
import java.util.Scanner;

public class B1154 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int idade = entrada.nextInt();
        int contador = 0;
        int somaIdade = 0;

        while (idade > 0) {
            somaIdade = somaIdade + idade;
            idade = entrada.nextInt();
            contador++;
        }

        double media = (double) somaIdade / contador;

        System.out.printf("%.2f%n", media);
        entrada.close();
    }
}
