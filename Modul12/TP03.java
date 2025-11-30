import java.util.*;
public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int barisKolom = input.nextInt();
        int[][]matrix = new int[barisKolom][barisKolom];
        int[][]matrix1 = new int[barisKolom][barisKolom];
        int[][]matrix2 = new int[barisKolom][barisKolom];

        for (int i = 0; i < barisKolom; i++) {
            for (int j = 0; j < barisKolom; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < barisKolom; i++) {
            for (int j = 0; j < barisKolom; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < barisKolom; i++) {
            for (int j = 0; j < barisKolom; j++) { 
                int sementara = 0;

                for (int a = 0; a < barisKolom; a++) {
                sementara += matrix[i][a] * matrix1[a][j];   
                }
            matrix2[i][j] = sementara;
            }
        }

        for (int i = 0; i < barisKolom; i++){
            for (int j = 0; j < barisKolom; j++) {
            System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < barisKolom; i++) {
            for (int j = 0; j < barisKolom; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(matrix2[i][j]);
            }
            System.out.println();
        }
    }
}
    
