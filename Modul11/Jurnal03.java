import java.util.*;
public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> hasilangka = new ArrayList<Integer>();
        int angka = 0;
        while (angka != -1) {
            angka = input.nextInt();
            hasilangka.add(angka);
        }

        int hasil = 0;
        int hasilAwal = 0;
        for (int i = 0; i < hasilangka.size(); i++) {
            int banding = 0;
            for (int a = i; a < hasilangka.size(); a++) {
                if (hasilangka.get(i) == hasilangka.get(a)) {
                banding++;
                }
            }
            if (banding > hasilAwal) {
                hasil = hasilangka.get(i);
                hasilAwal = banding;
            }else if (banding == hasilAwal && hasilangka.get(i) > hasil) {
                hasil = hasilangka.get(i);
            }
        }
        System.out.println(hasil);
    }
}