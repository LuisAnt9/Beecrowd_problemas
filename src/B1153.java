import java.util.Scanner;

public class B1153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int resultado = 1;
        int N = scanner.nextInt();

        for (int i = 2; i <= N; i++) {
            resultado = resultado * i;

        }
        scanner.close();
        System.out.println(resultado);

    }
}
