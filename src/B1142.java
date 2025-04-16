import java.util.Scanner;

public class B1142 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int numero = 1;

        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d PUM\n", numero, numero + 1, numero + 2);
            numero += 4;
        }

        entrada.close();
    }
}
