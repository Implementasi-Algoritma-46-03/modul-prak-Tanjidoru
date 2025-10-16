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
                namaHari = "Lundi";
                break;
            case 2:
                namaHari = "Mardi";
                break;
            case 3:
                namaHari = "Mercredi";
                break;
            case 4:
                namaHari = "Jeudi";
                break;
            case 5:
                namaHari = "Vendredi";
                break;
            case 6:
                namaHari = "Samedi";
                break;
            case 7:
                namaHari = "Dimanche";
                break;
            default:
                namaHari = "Hari tidak ditemukan";
        }

        System.out.println(namaHari);
    }
}
