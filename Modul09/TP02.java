import java.util.*;
public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        String kata = input.nextLine();

        System.out.println(itung(kata, 0));
    }

    public static int itung(String a, int i) {
        int totalKata = a.length();
        if (i == totalKata) 
        return 0;

        char c = a.charAt(i);
        int vokal = 0;
        if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') {
            vokal = 1;
        }
        return vokal + itung(a, i + 1);
    }
    
}
