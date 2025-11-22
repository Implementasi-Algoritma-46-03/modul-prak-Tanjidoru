import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        String lirikLagu = input.nextLine();
        String hasil = buanga(lirikLagu);
        String hasilKw = buangA(hasil);

        System.out.println(hasilKw);
    }

    private static String buanga(String nama) {
        int a = nama.length();
        int nomor = a % 5;

        String ajiz = null;
        switch (nomor) {
            case 0:
                ajiz = nama.replaceAll("[iueo]", "a");
                break;
            case 1:
                ajiz = nama.replaceAll("[aiuo]", "e");
                break;
            case 2:
                ajiz = nama.replaceAll("[aueo]", "i");
                break;
            case 3:
                ajiz = nama.replaceAll("[aiue]", "o");
                break;
            case 4:
                ajiz = nama.replaceAll("[aieo]", "u");
                break;
            default:
        }
        return ajiz;
    }
        private static String buangA(String nama) {
        int a = nama.length();
        int nomor = a % 5;

        String ajiz = null;
        switch (nomor) {
            case 0:
                ajiz = nama.replaceAll("[IUEO]", "A");
                break;
            case 1:
                ajiz = nama.replaceAll("[AIUO]", "E");
                break;
            case 2:
                ajiz = nama.replaceAll("[AUEO]", "I");
                break;
            case 3:
                ajiz = nama.replaceAll("[AIUE]", "O");
                break;
            case 4:
                ajiz = nama.replaceAll("[AIEO]", "U");
                break;
            default:
        }
        return ajiz;
    }
}
