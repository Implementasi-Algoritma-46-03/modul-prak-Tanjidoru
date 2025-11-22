import java.util.*;
public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int batas = input.nextInt();
        
        int[] angka = new int[batas];

        for (int i = 0; i < angka.length ; i++) {
            angka[i] = input.nextInt();
        }
        Arrays.sort(angka);

        for (int i = angka.length - 1; i >= 0; i--) {
            System.out.print(angka[i] + " ");
        }
    }
}
