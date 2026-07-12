import java.util.Scanner;

public class MethodBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int result = square(num);
        System.out.println("The square of " + num + " is: " + result);
    }

    public static int square(int n) {
        return n * n;
    }   
}
