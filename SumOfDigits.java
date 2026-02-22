package BASICS;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String args[]) {
        int rem; 
        int temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer :");
        int number = scanner.nextInt();
        temp = number;
        int sum = 0;
        while (number>0) {
            rem= number% 10;
            sum= sum + rem;
            number=number/10;
        }
        System.out.println("sum of digits : "+ temp + " is "+ sum);
    }
}
