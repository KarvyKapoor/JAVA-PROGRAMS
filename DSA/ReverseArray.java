package DSA;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array :");
            int n = sc.nextInt();
            int a[]=new int[n];
            System.out.println("Enter the elements of array :");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Reverse of array is :");
            for(int i=0;i<a.length/2;i++){
                int temp = a[i];
                a[i] = a[a.length-1-i];
                a[a.length-1-i] = temp;
            }
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
        }
    }
}
