import java.util.*;
public class TP03 {
    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        int nomor = 0;
        int angka = input.nextInt(); 
        
        while(angka != 0) {
            nomor += angka;
            angka = input.nextInt();
        }
        System.out.println(nomor);
    }
}
