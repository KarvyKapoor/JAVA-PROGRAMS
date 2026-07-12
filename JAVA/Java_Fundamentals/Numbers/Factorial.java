
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        long factorial = 1; // Variable to store the factorial result

        // Loop to calculate factorial
        for(int i = 1; i <= num; ++i) {
            factorial *= i; // Multiply factorial by the current number
        }

        // Print the result
        System.out.println("Factorial of " + num + " = " + factorial);
    }
}
