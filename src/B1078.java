import java.util.Scanner;

public class B1078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int soma = i * N;
            System.out.println(i + " x " + N + " = " + soma);
        }

    }
}
