import java.util.Scanner;
public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // Bitwise AND
        int andResult = a & b;
        System.out.println("Bitwise AND: " + andResult);

        // Bitwise OR
        int orResult = a | b;
        System.out.println("Bitwise OR: " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b;
        System.out.println("Bitwise XOR: " + xorResult);
    }
}
