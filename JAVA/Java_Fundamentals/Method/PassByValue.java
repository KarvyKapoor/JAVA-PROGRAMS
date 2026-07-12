import java.util.Scanner;
public class PassByValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Before method call: " + num);
        modifyValue(num);
        System.out.println("After method call: " + num);
    }

    public static void modifyValue(int n) {
        n = n * 2;
        System.out.println("Inside method: " + n);
    }
}
