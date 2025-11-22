import java.util.*;
public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();

        int kebalikan = 0;
        while (angka > 0) {
            int depan = angka % 10;
            kebalikan = kebalikan * 10 + depan;

            angka /= 10;
        }
        System.out.println(kebalikan);
    }
}
