import java.util.*;
public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        int isi = input.nextInt();
        String[] kata = new String[isi];
        int n = kata.length;

        for (int i = 0; i < n; i++){
            kata[i] = input.next();
        }

        for (int i = 1; i < n; i++){
            String temp = kata[i];
            int j = i - 1;

            while (j >= 0 && kata[j].compareTo(temp) > 0) {
                kata[j + 1] = kata[j];
                j--; 
            }
            kata[j + 1] = temp;

        }

        for (int i = 0; i < n; i++) {
            if (i > 0)
            System.out.print(" " + kata[i]);
            else
            System.out.print(kata[i]);
        }
    }
}

