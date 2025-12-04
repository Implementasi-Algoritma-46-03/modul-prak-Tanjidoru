import java.util.*;
public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        int barisKolom = in.nextInt();
        
        int[][] array = new int[barisKolom][barisKolom];
        
        for (int i = 0; i < barisKolom; i++) {
            for (int j = 0; j < barisKolom; j++) {
                array[i][j] = in.nextInt();
            }
        }
        
        for (int i = 0; i < barisKolom / 2; i++) {
            int[] ali = array[i];
            array[i] = array[barisKolom - 1 - i];
            array[barisKolom - 1 - i] = ali;
        }
        
        for (int i = 0; i < barisKolom; i++) {
            for (int j = 0; j < barisKolom; j++) {
                System.out.print(array[i][j]);
                if (j < barisKolom - 1)
                System.out.print(" ");   
            }
            System.out.println();
        }
    }
}