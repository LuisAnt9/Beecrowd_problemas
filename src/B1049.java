import java.util.Scanner;

public class B1049 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String animal1 = entrada.nextLine();
        String animal2 = entrada.nextLine();
        String animal3 = entrada.nextLine();

        if (animal1.equalsIgnoreCase("vertebrado")) {
            if (animal2.equalsIgnoreCase("ave")) {
                if (animal3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }

            } else if (animal2.equalsIgnoreCase("mamifero")) {
                if (animal3.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }


        } else if (animal1.equalsIgnoreCase("invertebrado")) {
            if (animal2.equalsIgnoreCase("inseto")) {
                if (animal3.equalsIgnoreCase("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }

            } else if (animal2.equalsIgnoreCase("anelideo")) {
                if (animal3.equalsIgnoreCase("onivoro")) {
                    System.out.println("minhoca");
                } else {
                    System.out.println("sanguessuga");
                }
            }

            entrada.close();
        }
    }
}
