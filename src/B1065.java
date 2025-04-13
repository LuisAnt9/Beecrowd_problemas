import java.util.Scanner;

public class B1065 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        for (int i = 1; i <= 5; i++) {
            int valor = entrada.nextInt();

            if (valor % 2 == 0) {
                soma++;
            }
        }
        System.out.printf("%d valores pares%n", soma);


        entrada.close();
    }
}
