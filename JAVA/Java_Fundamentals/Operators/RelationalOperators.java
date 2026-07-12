import java.util.Scanner;
public class RelationalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // Relational Operators
        boolean equal = a == b;
        boolean notEqual = a != b;
        boolean lessThan = a < b;
        boolean greaterThan = a > b;
        boolean lessThanOrEqual = a <= b;
        boolean greaterThanOrEqual = a >= b;

        System.out.println("Equal: " + equal);
        System.out.println("Not Equal: " + notEqual);
        System.out.println("Less Than: " + lessThan);
        System.out.println("Greater Than: " + greaterThan);
        System.out.println("Less Than or Equal: " + lessThanOrEqual);
        System.out.println("Greater Than or Equal: " + greaterThanOrEqual);
    }
}
