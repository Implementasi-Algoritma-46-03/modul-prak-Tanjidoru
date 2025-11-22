import java.util.Scanner;
public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int batas = input.nextInt();
        int nilai = -1;

        for(int i = 1; i <= batas; i++){
            for(int a = batas; a >= i; a--){
                nilai++;
                int nilai1 = nilai % 10;
                System.out.print(nilai1);
            }
            System.out.println();
        }
    }
}
