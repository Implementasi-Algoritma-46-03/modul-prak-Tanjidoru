import java.util.Scanner;
public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int hari = input.nextInt();
        int kumulatif = hari + 5;
        int sisa = kumulatif % 7;

        if (sisa == 0)
        sisa = 7;

        String namaHari;
        switch (sisa) {
            case 1:
                namaHari = "lundi";
                break;
            case 2:
                namaHari = "mardi";
                break;
            case 3:
                namaHari = "mercredi";
                break;
            case 4:
                namaHari = "jeudi";
                break;
            case 5:
                namaHari = "vendredi";
                break;
            case 6:
                namaHari = "samedi";
                break;
            case 7:
                namaHari = "dimanche";
                break;
            default:
                namaHari = "Hari tidak ditemukan";
        }

        System.out.println(namaHari);
    }
}
