import java.util.Scanner;

public class B1159 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x = entrada.nextInt();

        if (x % 2 == 0) {
            for (int i = x; i < x + 5 ; i++) {
                System.out.println(i);
            }
        }

        entrada.close();
    }
}
