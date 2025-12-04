import java.util.Scanner;
public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner s = new Scanner(System.in);

        int banyakArr = s.nextInt();
        int[][] arr = new int[banyakArr][banyakArr];

        int atas = 0;
        int bawah = banyakArr-1;
        int kiri = 0;
        int kanan = banyakArr-1;

        int counter = 1;
        while (counter <= banyakArr*banyakArr) {
            for (int i = atas; i <= bawah; i++) {       // Atas - bawah
                arr[i][kiri] = counter++;
            }
            kiri++;
            for (int i = kiri; i <= kanan; i++) {        // Kiri - kanan
                arr[bawah][i] = counter++;
            }
            bawah--;
            for (int i = bawah; i >= atas; i--) {              // Bawah - atas
                arr[i][kanan] = counter++;
            }
            kanan--;
            for (int i = kanan; i >= kiri; i--) {                 // Kanan - kiri
                arr[atas][i] = counter++;
            }
            atas++;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j>=1)
                    System.out.print(" ");
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
}