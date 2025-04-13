import java.util.Locale;
import java.util.Scanner;

public class B1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        double hotDog = 4.00;
        double xSalada = 4.50;
        double xBacon = 5.00;
        double torrada = 2.00;
        double refri = 1.50;

        int codigo = leitura.nextInt();
        int quantidade = leitura.nextInt();

        switch (codigo) {
            case 1:
                double total = hotDog * quantidade;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 2:
                total = xSalada * quantidade;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 3:
                total = xBacon * quantidade;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 4:
                total = torrada * quantidade;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 5:
                total = refri * quantidade;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            default:
                System.out.println("Faça nada");
        }

    }
}
