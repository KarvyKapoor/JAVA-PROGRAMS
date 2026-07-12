import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();
        int first = 0, second = 1; // First two Fibonacci numbers

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(first + " "); // Print the current Fibonacci number

            // Calculate the next Fibonacci number
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
