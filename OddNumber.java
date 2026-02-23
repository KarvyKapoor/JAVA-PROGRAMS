
import java.util.Scanner;

public class OddNumber {
    public static void main(String args[]) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter an integer :");
            int number = scanner.nextInt();
            for(int i=1;i<=number;i++) {
                if(i%2!=0){
                    System.out.println(i+" ");
                }
            }
        }
    }
    
}
