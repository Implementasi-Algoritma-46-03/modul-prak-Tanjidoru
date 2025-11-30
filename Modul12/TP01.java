import java.util.*;
public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int barisKolom = input.nextInt();
        int[][]matrix = new int[barisKolom][barisKolom];
        
        int jumlah = 0;

        for (int i = 0; i < barisKolom; i++) {
            for (int j = 0; j < barisKolom; j++) {
                matrix[i][j] = input.nextInt();
                jumlah += matrix[i][j];
            }
        }
        System.out.println(jumlah);
    }
}