import java.util.Scanner;

public class BinarySearchRecursion {
    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; // Target not found
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid; // Target found
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, low, mid - 1); // Search in the left half
        } else {
            return binarySearch(arr, target, mid + 1, high); // Search in the right half
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = scanner.nextInt();
        int result = binarySearch(arr, target, 0, n - 1);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
        scanner.close();
    }
}
