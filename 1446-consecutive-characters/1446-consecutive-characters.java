class Solution {
    public int maxPower(String s) {
        int count=1;
        int res=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
                res=Math.max(count,res);
            }
            else count=1;
        }
        return res;
        
    }
}