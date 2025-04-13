import java.util.Locale;
import java.util.Scanner;

public class B1019 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        int N, resto, horas, minutos, segundos;

        N = leitura.nextInt();
        horas = N / 3600;
        resto = N % 3600;
        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println(horas+":"+minutos+":"+segundos);

    }
}
