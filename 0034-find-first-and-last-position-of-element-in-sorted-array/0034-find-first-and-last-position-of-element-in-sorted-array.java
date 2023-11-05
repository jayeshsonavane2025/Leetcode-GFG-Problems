class Solution {
    public int[] searchRange(int[] a, int k) {
        int[] ans=new int[2];
        ans[0]=firstOcc(a,k);
        ans[1]=lastOcc(a,k);
        return ans;
    }
    public static int firstOcc(int[] a,int k){
        int l=0,r=a.length-1;
        int ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(k<a[m]){
                r=m-1;
                
            }
            else if(k>a[m]){
                l=m+1;
            }
            else{
                r=m-1;
                ans=m;
            }
        }
        return ans;
    }
    public static int lastOcc(int[] a,int k){
        int l=0,r=a.length-1;
        int ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(k<a[m]){
                r=m-1;
            }
            else if(k>a[m]){
                l=m+1;
            }
            else{
                l=m+1;
                ans=m;
            }
        }
        return ans;
    }
}