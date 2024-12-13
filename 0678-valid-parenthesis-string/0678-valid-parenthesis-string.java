import java.util.Stack;

class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> openStack = new Stack<>(); // To store indices of '('
        Stack<Integer> starStack = new Stack<>(); // To store indices of '*'
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                openStack.push(i); // Store index of '('
            } else if (ch == '*') {
                starStack.push(i); // Store index of '*'
            } else { // ch == ')'
                if (!openStack.isEmpty()) {
                    openStack.pop(); // Match ')' with '('
                } else if (!starStack.isEmpty()) {
                    starStack.pop(); // Match ')' with '*'
                } else {
                    return false; // No match for ')'
                }
            }
        }

        // Handle remaining '(' using available '*' (from right to left)
        while (!openStack.isEmpty()) {
            if (starStack.isEmpty() || starStack.peek() < openStack.peek()) {
                return false; // No '*' available or '*' is before '('
            }
            openStack.pop();
            starStack.pop();
        }

        return true; // All matched
    }
}
