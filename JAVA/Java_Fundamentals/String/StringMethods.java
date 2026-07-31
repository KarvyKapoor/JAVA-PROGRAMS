
import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.charAt(1));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.startsWith(" "));
        System.out.println(str.endsWith(" "));
        System.out.println(str.equals("Hello"));
        System.out.println(str.equalsIgnoreCase(" hello java "));
    }
}