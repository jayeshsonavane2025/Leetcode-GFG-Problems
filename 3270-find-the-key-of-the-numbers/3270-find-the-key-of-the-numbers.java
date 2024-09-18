class Solution {
    public int generateKey(int n1, int n2, int n3) {
        var res = 0; 
        for (int i=0;i<4;i++){
            var min = min(n1%10,n2%10,n3%10);
            min*=Math.pow(10,i);
            res+=min;
            n1/=10;n2/=10;n3/=10;
        }
        return res; 
    }
    
    public int min(int... mins){
        var res = mins[0];
        for (var num:mins)
            res = Math.min(res,num);
        return res; 
    }
}
