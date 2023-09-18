class Solution {
    public int[][] generateMatrix(int n) {
        int[][] a=new int[n][n];
        int top=0;
        int bottom=a.length-1;
        int left=0;
        int right=a.length-1; 
        int count=1;
        while(true){
            for(int i=left;i<=right;i++){
                a[left][i]=count++;
            }
            top++;
            if(left>right || top>bottom)
                break;
            for(int i=top;i<=bottom;i++){
                a[i][right]=count++;
            }
            right--;
            if(left>right || top>bottom)
                break;
            for(int i=right;i>=left;i--){
                a[bottom][i]=count++;
            }
            bottom--;
            if(left>right || top>bottom)
                break;
            for(int i=bottom;i>=top;i--){
                a[i][left]=count++;
            }
            left++;
             
            if(left>right || top>bottom)
                break;
            
        }
        return a;
        }
}