package exercicio_3;

import java.util.Scanner;

public class diferenca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A;
        int B;
        int C;
        int D;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        System.out.print("DIFERENCA = ");
        System.out.print(A * B - C * D);

        sc.close();
    }
}
