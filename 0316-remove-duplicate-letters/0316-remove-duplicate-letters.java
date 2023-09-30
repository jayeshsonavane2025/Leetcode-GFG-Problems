class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26]; // Count of each character in the string
        boolean[] inStack = new boolean[26]; // Tracks if a character is already in  the stack
        Stack<Character> stack = new Stack<>(); // Stack to build the result

        // Count the frequency of each character in the string
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Process each character in the string
        for (char c : s.toCharArray()) {
            count[c - 'a']--; // Decrease the count of the current character

            // Skip characters that are already in the stack
            if (inStack[c - 'a']) {
                continue;
            }

            // Remove characters from the stack if they are greater and still have  occurrences remaining
            while (!stack.isEmpty() && c < stack.peek() && count[stack.peek() - 'a'] > 0) {
                inStack[stack.pop() - 'a'] = false;
            }

            // Add the current character to the stack
            stack.push(c);
            inStack[c - 'a'] = true;
        }

        // Build the result string from the stack
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}
