import java.util.Locale;
import java.util.Scanner;

public class B1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        float n1 = entrada.nextFloat();
        float n2 = entrada.nextFloat();
        float n3 = entrada.nextFloat();
        float n4 = entrada.nextFloat();

        float soma = (n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1);
        float peso = 10;

        float resultado = soma / peso;
        System.out.printf("Media: %.1f\n",resultado);

        if (resultado >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (resultado >= 5.0 && resultado < 6.9) {
            System.out.println("Aluno em exame.");
            double exame = entrada.nextDouble();
            System.out.printf("Nota do exame: %.1f\n",exame);
            double mediaExame = (exame + resultado) / 2.0;
            if(mediaExame >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n",mediaExame);
            } else {
                System.out.println("Aluno Reprovado.");
                System.out.printf("Media final: %.1f\n",mediaExame);
            }
        } else {
            System.out.println("Aluno reprovado.");
        }


        entrada.close();
    }
}
