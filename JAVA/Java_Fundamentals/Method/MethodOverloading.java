import java.util.Scanner;
public class MethodOverloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int result1 = square(num);
        System.out.println("The square of " + num + " is: " + result1);

        System.out.print("Enter a decimal number: ");
        double decimalNum = scanner.nextDouble();
        double result2 = square(decimalNum);
        System.out.println("The square of " + decimalNum + " is: " + result2);
    }

    public static int square(int n) {
        return n * n;
    }

    public static double square(double n) {
        return n * n;
    }
}
