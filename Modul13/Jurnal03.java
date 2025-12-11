import java.util.*;
public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int gede = input.nextInt();
        String[] data = new String[gede];

        int n = data.length;
        for (int i = 0; i < n; i++) {
            data[i] = input.next();
        }

        input.nextLine();
        for (int i = 1; i < n; i++){
            String temp = data[i];
            int j = i - 1;

            while (j >= 0 && data[j].compareTo(temp) > 0) {
                data[j + 1] = data[j];
                j--; 
            }
            data[j + 1] = temp;
        }

        String angkaDicari = input.next();
        int nyari = searchAngka(data, angkaDicari);

        if (nyari !=-1) {
            System.out.print("Ditemukan di indeks ke-" + nyari);
        } else {
            System.out.print("Data tidak ditemukan");
        }

    }

    private static int searchAngka(String[] arraynya, String ygdicari) {
        int kanan  = arraynya.length -1;
        int kiri = 0;

        while (kiri <= kanan) {
        int mid = kiri + (kanan - kiri) / 2;
        int result = ygdicari.compareTo(arraynya[mid]);

        if (arraynya[mid].equals(ygdicari)) {
            return mid;
        }
        
        //disuruh nyari ke kiri, soalnya angka yang dicari lebih kecil dari mid(angka di tengah array)
        if (result > 0) {
            //kanan mid dikurang 1 supaya mid nya berkurang atau ngeceknya jadi ke index sebelum mid 
            kanan = mid -1; 
        }else
            kiri = mid + 1;
        }
    return -1;
    }
}
    

