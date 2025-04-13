import java.util.Scanner;

public class B1132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        scanner.close();

        // Garantir que x seja o menor e y o maior
        if (X > Y) {
            int temp = X;
            X = Y;
            Y = temp;
        }

        int soma = 0;

        for (int i = X; i <= Y; i++) {
            if (i % 13 != 0) {
                soma = soma + i;
            }
        }
        System.out.println(soma);
    }
}
