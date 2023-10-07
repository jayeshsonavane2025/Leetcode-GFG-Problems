class Solution {
      public int[] maxSlidingWindow(int[] arr, int k) {
        
        // For Finding Next Greater Element
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);
        nge[arr.length - 1] = arr.length;
        for (int i = arr.length - 2; i >= 0; --i) {
            while (!st.isEmpty() && arr[i] >= arr[st.peek()]) 
                st.pop();
            if (st.isEmpty()) nge[i] = arr.length; 
            else nge[i] = st.peek();
            st.push(i);
        }

        int[] ans = new int[arr.length - k + 1];
        int j = 0; // To travel in nge
        for (int i = 0; i <= arr.length - k; ++i) {
            if (j < i) j = i;
            while (nge[j] < i + k) j = nge[j];
            ans[i] = arr[j];
        }
        
        return ans;
    }
} 