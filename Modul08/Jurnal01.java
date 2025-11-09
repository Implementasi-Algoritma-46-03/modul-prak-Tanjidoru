import java.util.*;
public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
		Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int n = sc.nextInt();

        double sisaMassa = (double) r;
        int hari = 0;

        while (hari < n) {
            sisaMassa = sisaMassa / 2.0;
            hari = hari + 10;
        }

        System.out.printf("%.3f\n", sisaMassa);
    }
}
    
