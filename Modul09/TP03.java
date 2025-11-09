import java.util.*;
public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        System.out.println(faktorial(angka));

    }
    public static int faktorial(int n) {
        if (n == 1) return 1;
        return n* faktorial(n - 1);
    }

}
