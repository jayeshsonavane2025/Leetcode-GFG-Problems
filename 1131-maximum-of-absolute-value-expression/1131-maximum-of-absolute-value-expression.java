class Solution {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int maxa1 = Integer.MIN_VALUE;  
        int maxa2 = Integer.MIN_VALUE;  
        int maxa3 = Integer.MIN_VALUE;  
        int maxa4 = Integer.MIN_VALUE;  
        int mini1 = Integer.MAX_VALUE;  
        int mini2 = Integer.MAX_VALUE;  
        int mini3 = Integer.MAX_VALUE; 
        int mini4 = Integer.MAX_VALUE;  
        for(int i = 0; i < arr1.length; i++){ 
            maxa1 = Math.max(maxa1, arr1[i] + arr2[i] + i);  
            maxa2 = Math.max(maxa2, arr1[i] + arr2[i] - i);  
            maxa3 = Math.max(maxa3, arr1[i] - arr2[i] + i);  
            maxa4 = Math.max(maxa4, arr1[i] - arr2[i] - i);  
            mini1 = Math.min(mini1, arr1[i] + arr2[i] + i);  
            mini2 = Math.min(mini2, arr1[i] + arr2[i] - i);  
            mini3 = Math.min(mini3, arr1[i] - arr2[i] + i);  
            mini4 = Math.min(mini4, arr1[i] - arr2[i] - i);  
        }
        int ret = maxa1 - mini1;
        ret = Math.max(ret, maxa2 - mini2); 
        ret = Math.max(ret, maxa3 - mini3);  
        ret = Math.max(ret, maxa4 - mini4);  
        return ret;
    }
}