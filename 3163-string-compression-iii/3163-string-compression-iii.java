class Solution {
    public String compressedString(String s) {
        int n = s.length();
        
        StringBuilder ans = new StringBuilder();
        char prev = s.charAt(0);
        int cnt = 1;
        for(int i=1; i<n; i++){
            char ch = s.charAt(i);
            if(ch==prev){
                cnt++;
                if(cnt==9){
                    ans.append("9"+ch);
                    cnt=0;
                }
            }else{
                if(cnt!=0) ans = ans.append((String.valueOf(cnt)+prev));
                cnt = 1;
                prev = ch;
            }
        }
        
        if(cnt!=0) ans = ans.append((String.valueOf(cnt)+prev));
        return ans.toString();
    }
}