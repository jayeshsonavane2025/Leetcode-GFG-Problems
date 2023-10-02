class Solution {
    public boolean winnerOfGame(String s) {
        int n=s.length();
        int a=0,b=0;
        for(int i=1;i<n-1;i++){
           if(s.charAt(i-1)=='A' && s.charAt(i)=='A' && s.charAt(i+1)=='A')
               a++;
           if(s.charAt(i-1)=='B' && s.charAt(i)=='B' && s.charAt(i+1)=='B')
               b++; 
        }
        return a>b;
    }
}