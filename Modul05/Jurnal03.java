import java.util.Scanner;
public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        double a = input.nextInt();
        char c = input.next().charAt(0);
        double o = input.nextInt();

        switch (c) {
            case '+':
                System.out.println((int)a + o);
                break;
            case '-':
                System.out.println((int)a - o); 
                break;
            case '/':
                double hitungBagi = a / o;
                System.out.printf("%.7f", hitungBagi);
                break;
            case '*':
                System.out.println((int)a * o);
                break;
            default:
                break;
        }
    }
}
