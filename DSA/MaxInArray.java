package DSA;

import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array :");
            int n = sc.nextInt();
            int a[]=new int[n];
            System.out.println("Enter the elements of array :");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int max=a[0];
            for(int i=1;i<n;i++){
                if(a[i]>max){
                    max=a[i];
                }
            }
            System.out.println("Maximum element in array is : "+max);
        }
    }
}
