import java.util.*;
public class Jurnal02 {

    public static void main(final String[] args) { 
        // Kerjakan soalnya di sini
        Scanner input = new Scanner (System.in);
        String kata = input.nextLine();

        String[] hapus = kata.split("\\s+");
        String hasil = String.join(" ", hapus);

        System.out.println(hasil);

    }
}
