import java.util.Locale;
import java.util.Scanner;

public class B1016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        int distancia = leitura.nextInt();
        int minutos = distancia * 2;

        System.out.println(minutos + " minutos");
    }
}
