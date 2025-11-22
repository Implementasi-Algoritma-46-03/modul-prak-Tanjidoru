import java.util.*;
public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();

        for (int i = 1; i <= angka; i++) {
            for (int a = 1; a < i; a++ ) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
         
        for (int i = angka - 1; i >= 1; i--) {
            for (int b = 1; b < i; b++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}