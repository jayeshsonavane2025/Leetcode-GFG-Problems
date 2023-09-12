class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int result=0;
        for(int i=low;i<=high;i++){
            String s=Integer.toString(i);
            int t=0,n=s.length();
            for(int j=0;j<n/2;j++){
                t+=s.charAt(j)-s.charAt(n-1-j); 
            }
            if(n%2==0 && t==0)result++;
        }
        return result;
    }
}