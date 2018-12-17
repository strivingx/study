package p0020;

import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().isValid("([)]"));
        System.out.println(new Solution().isValid("{[]}"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && ((c == ')' && stack.peek() == '(') || (c == ']' && stack.peek() == '[') || (c == '}' && stack.peek() == '{')))
                stack.pop();
            else stack.push(c);
        }
        return stack.isEmpty();
    }

}