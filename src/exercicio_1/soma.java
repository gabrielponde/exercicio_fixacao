package exercicio_1;
import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        int y;

        x = sc.nextInt();
        y = sc.nextInt();

        System.out.print("SOMA = ");
        System.out.print(x + y);

        sc.close();
    }
}
