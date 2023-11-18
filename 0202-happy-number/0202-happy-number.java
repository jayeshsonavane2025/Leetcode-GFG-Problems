class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> track = new HashSet<>();
        while (n!=1 && !track.contains(n)){
            track.add(n);
            int sum = 0;
            while (n!=0){
                int remainder = n%10;
                sum += (remainder*remainder);
                n /= 10;
            }
            n = sum;
        }
        return n==1 ? true : false;
    }
}