package exercicio_2;

import java.util.Locale;
import java.util.Scanner;

public class area_circulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double R;
        double pi;

        R = sc.nextDouble();
        pi = 3.14159;

        System.out.print("A = ");
        System.out.printf("A = %.4f", pi * Math.pow(R, 2));

        sc.close();
    }
}
