import java.util.Scanner;

public class B1074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String par = "EVEN", impar = "ODD", positivo = "POSITIVE";
        String negative = "NEGATIVE";


        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();

            if (X == 0) {
                System.out.println("NULL");


            } else if (X % 2 == 0) {
                if (X > 0) {
                    System.out.println(par + " " + positivo);
                } else {
                    System.out.println( par + " " + negative);
                }
            } else {
                if (X < 0) {
                    System.out.println(impar +" "+ negative);
                } else {
                    System.out.println(impar +" "+ positivo);
                }
            }

        }

        scanner.close();
    }
}
