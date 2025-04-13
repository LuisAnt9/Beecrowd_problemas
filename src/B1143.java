import java.util.Scanner;

public class B1143 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int N = leitura.nextInt();
        for (int i = 1; i <=N ; i++) {
            System.out.println(i + " " + i*i + " " + i*i*i);
        }

        leitura.close();
    }
}
