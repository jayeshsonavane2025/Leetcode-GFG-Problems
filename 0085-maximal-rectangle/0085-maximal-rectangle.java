class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] heights = new int[n];
           
        int ans = Integer.MIN_VALUE;
        
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
               heights[j] = matrix[i][j] == '1' ? heights[j] + 1: 0;
            }
            ans = Math.max(ans, largestRectangleArea(heights));
        }
        
        return ans;
        }
       
       // from here -> Largest Rectangle Histogram code start
        public int largestRectangleArea(int[] heights) {
        int n= heights.length;
        int [] nsrArr = findNSR(heights);
        int [] nslArr = findNSL(heights);
        int maxArea = 0;
       
        for(int i=0;i<n;i++){
           int width = nsrArr[i] - nslArr[i] - 1;
        //    System.out.print(width);
           int area = width * heights[i];
           maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
    //find next smaller element on right 
    public int[] findNSR(int [] arr){
        int [] nsr = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[i] <= arr[s.peek()] ){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] =arr.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        return nsr;

    }
        //find next smaller element on left 

    public int[] findNSL(int [] arr){
        int [] nsl = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[i] <= arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] =-1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        return nsl;

    }

}