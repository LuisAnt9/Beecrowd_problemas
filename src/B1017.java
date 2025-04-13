import java.util.Locale;
import java.util.Scanner;

public class B1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        int consumoMedioDoVeiculo = 12;
        int horasGastas = leitura.nextInt();
        int velocidadeMedia = leitura.nextInt();

        int distancia = velocidadeMedia * horasGastas;

        double litrosGastos = (double) distancia/consumoMedioDoVeiculo;

        System.out.printf("%.3f%n", litrosGastos);

    }
}
