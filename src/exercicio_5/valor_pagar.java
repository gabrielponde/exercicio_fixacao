package exercicio_5;

import java.util.Locale;
import java.util.Scanner;

public class valor_pagar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1 = sc.nextInt();
        int quantidade1 = sc.nextInt();
        double valorUnitario1 = sc.nextDouble();

        int codigo2 = sc.nextInt();
        int quantidade2 = sc.nextInt();
        double valorUnitario2 = sc.nextDouble();

        double total = (quantidade1 * valorUnitario1) + (quantidade2 * valorUnitario2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}
