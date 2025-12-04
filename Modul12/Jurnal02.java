import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputan = sc.nextInt();
        int[][] papan = new int[inputan][inputan];

        // input papan
        for (int i = 0; i < inputan; i++) {
            for (int j = 0; j < inputan; j++) {
                papan[i][j] = sc.nextInt();
                }
            }

        // cek baris
        for (int i = 0; i < inputan; i++){
            int baris = papan[i][0];
            if (baris != 0) {
                boolean sama = true;
                for (int j = 1; j < inputan; j++){
                    if (papan[i][j] != baris){
                        sama = false;
                        break;
                    }
                }
                if (sama) {
                    System.out.println(baris == 1 ?  "O" : "X");
                    return;
                }
            }
        }

        // cek kolom
        for (int j = 0; j < inputan; j++) {
            int kolom = papan[0][j];
            if (kolom != 0) {
                boolean sama = true;
                for (int i = 1; i < inputan; i++){
                    if (papan[i][j] != kolom){
                        sama = false;
                        break;
                    } 
                }
                if (sama) {
                    System.out.println(kolom == 1 ? "O" : "X");
                    return;
                }
            }
        }

        // diagonal utama
        int diag = papan[0][0];
        if (diag != 0){
            boolean sama = true;
            for (int i = 1; i < inputan; i++){
                if (papan[i][i] != diag) {
                    sama = false;
                    break;
                }
            }
            if (sama) {
                System.out.println(diag == 1 ? "O" : "X");
                return;
            }
        }

        // diagonal kedua
        diag = papan[0][inputan - 1];
        if (diag != 0) {
            boolean sama = true;
            for (int i = 1; i < inputan; i++) {
                if (papan[i][inputan - 1 - i] != diag){
                    sama = false;
                    break;
                }
            }
            if (sama) {
                System.out.println(diag == 1 ? "O" : "X");
                return;
            }
        }

        // tidak ada pemenang
        System.out.println("?");
    }
}