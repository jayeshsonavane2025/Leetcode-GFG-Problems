class Solution {
    public int maxChunksToSorted(int[] arr) {
        if (arr.length == 0) return 0; // If the array is empty, return 0 chunks.

        int[] maxFromStart = new int[arr.length]; // Stores the maximum value encountered from the start.
        int[] minFromEnd = new int[arr.length];   // Stores the minimum value encountered from the end.

        maxFromStart[0] = arr[0]; // Initialize the first element of maxFromStart.
        for (int i = 1; i < arr.length; i++) {
            maxFromStart[i] = Math.max(maxFromStart[i - 1], arr[i]); // Calculate max values from the start.
        }

        minFromEnd[arr.length - 1] = arr[arr.length - 1]; // Initialize the last element of minFromEnd.
        for (int i = arr.length - 2; i >= 0; i--) {
            minFromEnd[i] = Math.min(minFromEnd[i + 1], arr[i]); // Calculate min values from the end.
        }

        int chunks = 1; // Initialize the chunk count to 1.
        for (int i = 0; i < arr.length - 1; i++) {
            if (maxFromStart[i] <= minFromEnd[i + 1]) {
                chunks++; // If max from start is less than or equal to min from end, we can form a new chunk.
            }
        }

        return chunks; // Return the maximum number of chunks.
    }
}
