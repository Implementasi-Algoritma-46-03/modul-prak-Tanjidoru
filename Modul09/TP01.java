import java.util.*;
public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();

        for (int i = 1; i <= angka; i++) {
            if (i % 2 == 0)
            System.out.println(i + " Genap");
            else 
            System.out.println(i + " Ganjil");
        }

    }
}
