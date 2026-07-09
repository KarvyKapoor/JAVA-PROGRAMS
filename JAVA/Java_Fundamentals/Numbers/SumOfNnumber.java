
import java.util.Scanner;

public class SumOfNnumber {
        public static void main(String args[]) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter an integer :");
            int number = scanner.nextInt();
            int sum = 0;
            for(int i=1;i<=number;i++) {
                sum = sum + i;
            }
            System.out.println("Sum Of All Numbers : "+ sum);
        }
    }
}
