package exercicio_4;

import java.util.Locale;
import java.util.Scanner;

public class funcionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;
        int y;
        double z;

        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.print("NUMBER = ");
        System.out.println(x);
        System.out.print("SALARY = U$ ");
        System.out.println(y * z);

        sc.close();
    }
}
