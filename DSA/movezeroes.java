package DSA;

import java.util.Scanner;

public class movezeroes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size: ");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter elements:");
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
            }
            moveZeroes(nums);
            System.out.print("Array after moving zeroes: ");
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
    }
    public static void moveZeroes(int[] nums){
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        while(index < nums.length){
            nums[index] = 0;
            index++;
        }
    }
}
