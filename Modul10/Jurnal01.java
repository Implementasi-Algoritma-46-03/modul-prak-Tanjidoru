public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        
        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0){
            System.out.print(" ");
            }
            for (int a = 1; a <= 5; a++) {
                if (i % 2 != 0)
                System.out.print(i + " ");
                if (i % 2 == 0 && a <= 4)
                System.out.print(i + " ");
                if (i % 2 == 0 && a == 5)
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

