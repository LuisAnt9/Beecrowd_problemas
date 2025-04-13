import java.util.Scanner;

public class B1042 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        if (a < b && a < c && b < c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if (a < b && a < c && c < b) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
            System.out.println();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if (b < a && b < c && a < c) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
            System.out.println();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if (b < a && b < c && c < a) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
            System.out.println();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if (c < b && c < a && a < b) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
            System.out.println();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
            System.out.println();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        entrada.close();
    }
}
