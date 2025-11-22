import java.util.Scanner;

public class TP02 {
    private static String hapus(String teks) {
        return teks.replaceAll("[AaIiUuEeOo]", ""); 
    }

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        // Input
        Scanner input = new Scanner(System.in);
        String kalimat = input.nextLine(); 

        String hasil = hapus(kalimat);
        System.out.println(hasil);
    }

}