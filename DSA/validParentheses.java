package DSA;

import java.util.*;

public class validParentheses {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string of parentheses :");
            String s = sc.nextLine();
            if (isValid(s)) {
                System.out.println("The parentheses are valid.");
   } else {
            System.out.println("The parentheses are not valid.");
   }
        }
}

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            return stack.isEmpty();
    }
}
