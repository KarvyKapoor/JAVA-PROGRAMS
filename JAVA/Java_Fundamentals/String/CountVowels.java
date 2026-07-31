
import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str = scanner.nextLine();

        int count = 0;

        for (char ch : str.toLowerCase().toCharArray()) {

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Vowels = " + count);
    }
}