class Solution {
    public int[] singleNumber(int[] a) {
        int res=0;
        for(int item:a){
            res^=item;
        }
        int fnum=0;
        int mask=res& (-res);
        for(int item:a){
            if((mask&item)==0){
                fnum^=item;
            }
        }
        int secnum=res^fnum;
        int[] ans=new int[2];
        ans[1]=fnum;
        ans[0]=secnum;
        Arrays.sort(ans);
        return ans;
    }
}