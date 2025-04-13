import java.util.Scanner;

public class B1134 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x = entrada.nextInt();
        int alcool = 0, gasolina = 0, diesel = 0;

        while (x != 4) {

            switch (x) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;

            }
            x = entrada.nextInt();


        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d%n", alcool, gasolina, diesel);


        entrada.close();
    }
}
