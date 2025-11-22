import java.util.Scanner;
public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        String namaMakanan = null;
        double harga = 0;

        switch (n) {
            case 1:
                namaMakanan = "Nasi Goreng ";
                harga = 15.0;
                break;
            case 2:
                namaMakanan = "Mie Goreng / Nyemek ";
                harga = 18.0;
                break;
            case 3:
                namaMakanan = "Kwetiau Goreng / Nyemek " ;
                harga = 20.0;
                break;
            case 4:
                namaMakanan = "Capcay Goreng / Kuah ";
                harga = 23.0;
                break;
            default:
                namaMakanan = " ";
                harga = 0; 
        }

        double totalHarga= harga * m;
        System.out.printf( namaMakanan + m + " buah, total harga Rp. %.3f", totalHarga);   
    }
}
