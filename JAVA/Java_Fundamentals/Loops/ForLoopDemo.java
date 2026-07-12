
public class ForLoopDemo {
    public static void main(String[] args) {
        // Example 1: Print numbers from 1 to 5
        System.out.println("Example 1: Print numbers from 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Example 2: Print even numbers from 2 to 10
        System.out.println("\nExample 2: Print even numbers from 2 to 10");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }

        // Example 3: Calculate the sum of first n natural numbers
        int n = 5;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("\nExample 3: Sum of first " + n + " natural numbers is: " + sum);
    }
}
