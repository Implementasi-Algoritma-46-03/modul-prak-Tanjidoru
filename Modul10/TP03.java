public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        for (int i = 2; i <= 100; i++) {
            int angka = 0;
            for (int a = 2; a < i; a++) {
                if (i % a == 0)
                angka++;
            }
            if (angka == 0)
            System.out.print(i + " ");
        }
    }
}
