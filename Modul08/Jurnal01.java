import java.util.*;
public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
		Scanner sc = new Scanner(System.in);

		double zat = sc.nextDouble();
		int hari = sc.nextInt();
		
		while (hari != 0) {
			zat /= 2;
			hari -= 10;
			}
			
			System.out.printf("%.3f", zat);
    }
}
    
