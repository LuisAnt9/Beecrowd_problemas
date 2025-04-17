import java.util.Scanner;

public class B1158 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            int x = entrada.nextInt();
            int y = entrada.nextInt();

            if (x % 2 == 0) {
                x++;
            }

            int soma = 0;
            for (int j = 0; j < y; j++) {
                soma += x + (j * 2);
            }
            System.out.println(soma);
        }
        entrada.close();
    }
}
