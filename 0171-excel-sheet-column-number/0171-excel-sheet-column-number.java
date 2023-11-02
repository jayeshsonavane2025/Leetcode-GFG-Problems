class Solution {
    public int titleToNumber(String s) {
        // if(s==null){
        //     return -1;
        // }
        int sum=0;
        // s.toUpperCase();
        for(char c:s.toCharArray()){
            sum*=26;
            sum+=c-'A'+1;
        }
        return sum;
    }
}