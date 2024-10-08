class Solution {
    public int minSwaps(String s) {
        int balance = 0;
        int swaps = 0;
        int unbalanced = 0;  // Tracks the number of unbalanced ']'
        
        // Traverse through the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                balance++;  // Increase balance for '['
            } else {
                balance--;  // Decrease balance for ']'
            }
            
            // If balance goes negative, we have unbalanced ']' 
            if (balance < 0) {
                unbalanced++;  // We need to fix this unbalanced part
                balance = 0;  // Reset balance for the next segment
            }
        }
        
        // Calculate the minimum number of swaps needed
        // We need to swap half of the remaining unmatched brackets
        // Use integer division and add 1 to round up for odd numbers
        swaps = (unbalanced + 1) / 2;
        
        return swaps;
    }
}