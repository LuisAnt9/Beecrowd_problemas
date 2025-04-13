import java.util.Scanner;

public class B1114 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int senha = leitura.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = leitura.nextInt();
        }
        System.out.println("Acesso Permitido");

        leitura.close();
    }
}
