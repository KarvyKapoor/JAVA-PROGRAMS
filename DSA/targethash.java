package DSA;

import java.util.*;

public class targethash {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 }; // Return an array indicating no solution found
    }
    public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter the size of array :");
                int n = sc.nextInt();
                int a[]=new int[n];
                System.out.println("Enter the elements of array :"); 
                for(int i=0;i<n;i++){
                    a[i]=sc.nextInt();
                }
                System.out.println("Enter the target value :");
                int target=sc.nextInt();
                targethash obj=new targethash();
                int[] result=obj.twoSum(a,target);
                System.out.println("Indices of the two numbers that sum to target are : "+result[0]+" and "+result[1]);
            }
    }
}
