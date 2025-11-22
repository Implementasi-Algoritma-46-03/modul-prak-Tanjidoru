public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int aja = input.nextInt();
        input.nextLine();

        String[] nama = new String[aja];

        for (int i = 0; i < aja; i++) { 
            nama[i] = input.nextLine();
        }

        for (int i = 0; i < aja; i++) {
            System.out.println("Bulan " + (i + 1) + ": " + nama[i]);
        } 
    }
}

