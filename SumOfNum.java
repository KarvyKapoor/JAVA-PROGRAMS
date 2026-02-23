
import java.util.Scanner;

public class SumOfNum {
    public static void main(String args[]) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter an number :");
            int sum = 0;
            int number = scanner.nextInt();
            for(int i=1;i<=number;i++) {
                if(i%2!=0){
                    sum = sum + i;
                }
            }
            System.out.println("Sum :"+sum);
        }
    }
}
