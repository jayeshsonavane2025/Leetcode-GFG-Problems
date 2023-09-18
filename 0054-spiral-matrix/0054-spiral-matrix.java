class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        int top=0;
        int bottom=a.length-1;
        int left=0;
        int right=a[0].length-1;
        List<Integer> list=new ArrayList<>();
        while(true){
            for(int i=left;i<=right;i++){
                list.add(a[top][i]);
            }
            top++;
            if(left>right || top>bottom)
                break;
            for(int i=top;i<=bottom;i++){
                list.add(a[i][right]);
            }
            right--;
            if(left>right || top>bottom)
                break;
            for(int i=right;i>=left;i--){
                list.add(a[bottom][i]);
               
            }
            bottom--;
            if(left>right || top>bottom)
                break;
            for(int i=bottom;i>=top;i--){
                list.add(a[i][left]);
            }
            left++;
            if(left>right || top>bottom)
                break;
            
            
            }
        return list;
        
        
    }
}