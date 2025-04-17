import java.util.Scanner;

public class B1159 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x = entrada.nextInt();

        while (x != 0) {
            int soma = 0;
            int contador = 0;

            if (x % 2 != 0) {
                x++;
            }

            for (int i = x; contador < 5; i += 2) {
                soma += i;
                contador++;
            }

            System.out.println(soma);
            x = entrada.nextInt();
        }
        entrada.close();
    }
}
