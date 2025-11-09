import java.util.*;
public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int jumlahAwal = 30;
        int waktu = 0;

        while (jumlahAwal < n && jumlahAwal < 10_000_000) {
            jumlahAwal *= 2;
            waktu += 15;
        }

        System.out.println(waktu);
    }
}
