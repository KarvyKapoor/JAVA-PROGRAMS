import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String s1, String s2) {

        s1 = s1.toLowerCase().replaceAll("\\s", "");
        s2 = s2.toLowerCase().replaceAll("\\s", "");

        if (s1.length() != s2.length())
            return false;

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        if (isAnagram(str1, str2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}