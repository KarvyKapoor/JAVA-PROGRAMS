import java.util.Scanner;
public class SquarePattern {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= rows; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
