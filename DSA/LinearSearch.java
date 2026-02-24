package DSA;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array :");
            int n = sc.nextInt();
            int a[]=new int[n];
            System.out.println("Enter the elements of array :");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Enter the element to be searched :");
            int key = sc.nextInt();
            int flag=-1;
            for(int i=0;i<n;i++){
                if(a[i]==key){
                    System.out.println("Element found at index "+i);
                    flag=i;
                    break;
                }
            }
            if(flag==-1){
                System.out.println(flag);
            }
        }
    }
}
