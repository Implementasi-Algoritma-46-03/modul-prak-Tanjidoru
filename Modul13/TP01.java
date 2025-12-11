import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        double[] data1 = new double[10];
        double[] data2 = new double[10];

        for (int i = 0; i < data1.length; i++) {
            data1[i] = input.nextDouble();
        }
        for (int i = 0; i < data1.length; i++) {
            data2[i] = input.nextDouble();
        }

        double[] hasil1 = urutin(data1);
        System.out.println();
        double[] hasil2 = urutin(data2);
        }

    private static double[] urutin(double[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j< data.length - 1 - i; j++) {
                if (data[j + 1] < data[j]) {
                    double temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.printf("%.2f", data[i]);
  
        }
        return data;
       
    }
}

