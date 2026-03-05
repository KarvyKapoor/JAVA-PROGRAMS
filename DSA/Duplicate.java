package DSA;

import java.util.HashSet;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size: ");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter elements:");
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
            }           
            System.out.println(containsDuplicate(nums));
        }
    }

    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
