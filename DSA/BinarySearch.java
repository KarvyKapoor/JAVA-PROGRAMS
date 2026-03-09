package DSA;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array :");
            int n = sc.nextInt();
            int a[]=new int[n];
            System.out.println("Enter the elements of array :");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Enter element to search");
            int elm =sc.nextInt();
            BinarySearch bs = new BinarySearch();
            bs.Search(a, elm);
        }
    }
    public void Search(int a[],int target){
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==target){
                System.out.println("Found");
                return;
            }
            else if(a[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("Not Found");
    }
}