import java.util.Scanner;
public class DiamondPattern {
    public static void main(String args[]) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();
            int i, j;
            for (i = 1; i <= rows; i++) {
                for (j = i; j < rows; j++) {
                    System.out.print(" ");
                }
                for (j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (i = rows - 1; i >= 1; i--) {
                for (j = rows; j > i; j--) {
                    System.out.print(" ");
                }
                for (j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
