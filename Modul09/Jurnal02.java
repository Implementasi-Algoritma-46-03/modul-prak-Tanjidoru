import java.util.*;
public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int batas = input.nextInt();

        int hasil = 0;
        for (int i =1; i <= batas; i += 2) {
            hasil += i; 
        }
        System.out.println(hasil);
    } 
}
