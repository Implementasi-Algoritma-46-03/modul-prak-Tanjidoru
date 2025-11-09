import java.util.Scanner;
public class TP03 {
    public static void persegi(double a) {
        double luas = a * a;
        double keliling = 4 * a; 
        System.out.printf("%.0f %.0f", luas, keliling);
    }

    public static void persegiPanjang(double a, double b) {
        double luas = a * b;
        double keliling = 2 * (a + b);
        System.out.printf("%.0f %.0f", luas, keliling);
    }

    public static void segitiga (double b, double c) {
        double luas = (b * c) / 2;
        // Hitung sisi miring dengan Teorema Pythagoras
        double miring = Math.sqrt((b * b) + (c * c));
        double keliling = b + c + miring;
        System.out.printf("%.0f %.0f", luas, keliling);
    }

    public static void lingkaran (double d) {
        double jari2 = d / 2.0;
        double luas = 3.14 * (jari2 * jari2);
        double keliling = 2 * 3.14 * jari2;
        System.out.printf("%.2f %.2f", luas, keliling);
    }

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        String bangunDatar = input.nextLine();

        switch (bangunDatar) {
            case "Persegi":
                int sisi = input.nextInt();
                persegi(sisi);
                break;
            case "Persegi Panjang":
                int panjang = input.nextInt();
                int lebar = input.nextInt();
                persegiPanjang(panjang, lebar);
                break;
            case "Segitiga":
                int alas = input.nextInt();
                int tinggi = input.nextInt();
                segitiga(alas,tinggi);
                break;
            case "Lingkaran":
                int diameter = input.nextInt();
                lingkaran(diameter);
                break;
            default:
                break;
        }
    }
}
