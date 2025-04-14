import java.util.Scanner;

public class B1146 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();

        while(x != 0) {
            for (int i = 1; i <= x ; i++) {
                if (i == x) {
                    System.out.println(i);
                } else {
                System.out.print(i + " ");
                }
            }
            x = entrada.nextInt();
        }
        entrada.close();
    }
}
