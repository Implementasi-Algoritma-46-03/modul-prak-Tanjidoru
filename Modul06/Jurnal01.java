import java.util.Scanner;
public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        String nama1 = input.nextLine();
        String nama2 = input.nextLine();
        int jam = input.nextInt();
        
        waktu(nama1, jam);
        waktu(nama2, jam);
    }
    
    public static void waktu(String a, int b) {
        String sapaan = null;
        if (b>=6 && b<=11) {
            sapaan = "pagi";
        }else if (b>=12 && b<=14) {
            sapaan = "siang";
        }else if (b>=15 && b<=17) {
            sapaan = "sore";
        }else {
            sapaan = "malam";
        }
        System.out.println("Halo, " + a + "." + " Selamat " + sapaan + ".");
        }
}
