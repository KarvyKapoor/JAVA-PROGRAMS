package DSA;
import java.util.*;
public class MaximumSubarray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size: ");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter elements:");
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
            }
            System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));
        }
    }
    public static int maxSubArray(int[] nums){
        int currentSum = nums[0];
        int maxSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}