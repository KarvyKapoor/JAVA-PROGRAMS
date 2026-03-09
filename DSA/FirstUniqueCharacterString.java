package DSA;

import java.util.Scanner;

public class FirstUniqueCharacterString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            int index = firstUniqChar(s);
            if (index != -1) {
                System.out.println("First unique character: " + s.charAt(index));
            } else {
                System.out.println("No unique character found.");
            }
        }
    }
    public static int firstUniqChar(String s) {
        int[] charCount = new int[26]; // Assuming only lowercase letters
        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        // Find the index of the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1; // No unique character found
    }
}