import java.util.Scanner;

public class B1035 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int a, b, c, d;
        a = leitura.nextInt();
        b = leitura.nextInt();
        c = leitura.nextInt();
        d = leitura.nextInt();

        if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

    }
}
