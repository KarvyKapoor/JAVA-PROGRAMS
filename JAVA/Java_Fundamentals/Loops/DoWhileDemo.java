import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a positive number (or a negative number to exit): ");
            number = scanner.nextInt();
            if (number >= 0) {
                System.out.println("You entered: " + number);
            }
        } while (number >= 0);
        System.out.println("Exited the loop.");
        scanner.close();
    }
}
