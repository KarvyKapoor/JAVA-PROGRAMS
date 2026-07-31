
import java.util.Scanner;

public class StingOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println("Length : " + str.length());
        System.out.println("Uppercase : " + str.toUpperCase());
        System.out.println("Lowercase : " + str.toLowerCase());
        System.out.println("Substring : " + str.substring(5));
        System.out.println("Contains Java : " + str.contains("Java"));
        System.out.println("Replace : " + str.replace("Java", "Python"));
    }
}