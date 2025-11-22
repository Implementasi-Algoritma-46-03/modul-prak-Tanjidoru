import java.util.*;
public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner sc = new Scanner(System.in);

        int jumlahBeli = sc.nextInt();
        int totalRisoles = 0;
        int jumlahTransaksi = 0;

        while (jumlahBeli != 0) {
            totalRisoles += jumlahBeli;
            jumlahTransaksi++;
            
            jumlahBeli = sc.nextInt();
        }

        if (jumlahTransaksi > 0) {
            double rataRata = (double) totalRisoles / jumlahTransaksi;
            System.out.printf("%.2f\n", rataRata);
        } else {
            System.out.printf("%.2f\n", 0.0);
        }
    }
}
    
