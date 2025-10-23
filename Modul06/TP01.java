import java.util.Scanner;
public class TP01 {
    public static void f2C(double a) {
		double hitungCel = (a - 32) * 5/9;
		System.out.printf("%.1f ", hitungCel);
		}
		
	  public static void f2R(double b){
		double hitungRear = (b - 32) * 4/9;
		System.out.printf("%.2f ", hitungRear);
		}

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        double r1 = input.nextDouble(); //suhuRendah
        double r2 = input.nextDouble(); //suhuRata-rata
        double r3 = input.nextDouble(); //suhuTinggi

        System.out.print("Celcius: ");
        f2C(r1);
        f2C(r2);
        f2C(r3);
        System.out.print("\nReamur: ");

        f2R(r1);
        f2R(r2);
        f2R(r3);

    }
}
