import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String args[]){
        int n , sum,r;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter an number :");
            int range = scanner.nextInt();
            for(int i =1;i<=range;i++){
                n=i;
                sum =0;
                while(n>0){
                    r =n % 10;
                    sum =sum +(r*r*r);
                    n =n / 10 ;
                }
                if (sum == i){
                    System.out.println(i+" ");
                }
            }
            scanner.close();
        }
    }
}