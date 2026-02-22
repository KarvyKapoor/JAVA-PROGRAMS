package BASICS;
import java.util.Scanner;

public class NumOfOdd {
        public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer :");
        int number = scanner.nextInt();
        int count = 0;
        for(int i=1;i<=number;i++) {
            if(i%2!=0){
               count++;
            }
        }
        System.out.println("Count :"+ count);
    }
}
