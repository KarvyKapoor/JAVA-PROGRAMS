
import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first boolean value (true/false): ");
        boolean a = scanner.nextBoolean();
        System.out.print("Enter second boolean value (true/false): ");
        boolean b = scanner.nextBoolean();

        // Logical AND
        boolean andResult = a && b;
        System.out.println("Logical AND: " + andResult);

        // Logical OR
        boolean orResult = a || b;
        System.out.println("Logical OR: " + orResult);

        // Logical NOT
        boolean notResult = !a;
        System.out.println("Logical NOT: " + notResult);
    }
}
