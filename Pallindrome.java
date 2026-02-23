
import java.util.Scanner;

public class Pallindrome{
   public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter an integer :");
            int number = scanner.nextInt();
            int pal,r,rev=0;
            pal = number;
            while(number>0){
                r=number%10;
                rev=rev*10+r;
                number = number/10;
            }
            if(rev==pal){
                System.out.println("Pallindrome");
            }
            else{
                System.out.println("Not Pallindrome");
            }
        }
   } 
}
