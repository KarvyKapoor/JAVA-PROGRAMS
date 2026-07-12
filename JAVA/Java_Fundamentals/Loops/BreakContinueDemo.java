
import java.util.Scanner;
public class BreakContinueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of iterations: ");
        int n = scanner.nextInt();

        System.out.println("Using break:");
        for (int i = 1; i <= n; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Using continue:");
        for (int i = 1; i <= n; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
