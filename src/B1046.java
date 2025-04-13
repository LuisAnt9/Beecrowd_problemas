import java.util.Scanner;

public class B1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inicio = scanner.nextInt();
        int fim = scanner.nextInt();

        if (inicio >= fim) {
            int duracao = 24 - inicio + fim;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        } else {
            int duracao = fim - inicio;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
        scanner.close();
    }
}
