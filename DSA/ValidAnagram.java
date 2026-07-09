package DSA;

import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first string: ");
            String s = sc.nextLine();
            System.out.print("Enter second string: ");
            String t = sc.nextLine();
            System.out.println(isAnagram(s, t));
        }
    }

    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.toLowerCase().charAt(i) - 'a']++;
            count[t.toLowerCase().charAt(i) - 'a']--;
        }
        for(int c : count){
            if(c != 0){
                return false;
            }
        }
        return true;
    }
}