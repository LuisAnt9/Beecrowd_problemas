import java.util.Scanner;

public class B1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int anos = n / 365;
        n = n % 365;

        int meses = n / 30;
        n = n % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(n + " dia(s)");

        sc.close();
    }
}
