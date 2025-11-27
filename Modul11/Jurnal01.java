import java.util.*;
public class Jurnal01 {

    public static void main(final String[] args) { 
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        ArrayList<String> nama = new ArrayList<>();
        String namaOrang;

        do{
            namaOrang = input.nextLine();
            nama.add(namaOrang);
        } while (!namaOrang.equals("-"));

        nama.remove(nama.size() - 1);

        for (int i = 0; i < nama.size(); i++) {
            System.out.println("Bulan " + (i + 1) + ": " + nama.get(i));
        }
    }
}
