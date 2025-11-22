import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int batas = input.nextInt();

        for (int i = 1; i <= batas; i++) {
            for (int a = 1; a <= batas; a++) {
            System.out.print((a * i) + " ");
        }
            System.out.println();
        }
    }
}

