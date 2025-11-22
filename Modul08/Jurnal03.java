import java.util.*;
public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner s = new Scanner(System.in);

        int angka = s.nextInt();
        int angka2 = angka;
        System.out.println(digit(angka, angka2));
    }

    private static String digit(int a, int b) {
        int hasil = 0;
        int bilFaktorial;
        while (a > 0) { 
            bilFaktorial = a % 10;
            int faktorial = faktor(bilFaktorial);

            hasil += faktorial;
            a /= 10;
        }
        if (hasil == b) {
            return ("YA");
        } else 
            return ("BUKAN");
    }

    private static int faktor(int i) {
        int hasil = 1;
        while (i >= 1) {
            hasil *= i;
            i--;
        }
        return hasil;
    }
}
