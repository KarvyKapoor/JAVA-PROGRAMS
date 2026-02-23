
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]){
        int arg , sum=0 ,r;
        int n;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter an number :");
            n = scanner.nextInt();
            arg = n;
        }
        for(int i =1;i<n;i++){
            while(n>0){
                r =n%10;
                sum = sum +(r*r*r);
                n =n / 10 ;
            }
        }
        if(arg==sum){
            System.out.println("Armstrong");
        }
        else{
           System.out.println(" Not Armstrong"); 
        }
    }
}
