import java.util.Scanner;

public class B1142 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int N = entrada.nextInt();
        int soma = 1;

        for (int i = 1; i < N ; i++) {
            soma = soma + 4;
            System.out.println(soma);
        }


        entrada.close();
    }
}
