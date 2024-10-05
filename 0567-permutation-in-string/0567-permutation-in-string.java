class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        // corner case
        if (len1 > len2) return false;
        int[] count = new int[256];
        // initialize the count for each unique character
        for (char c : s1.toCharArray()) {
            count[c ] ++;
        }
        // initialize the sliding window with static size len1
        int i = 0, j = 0, counter = len1;
        while (j < len1) {
            if (count[s2.charAt(j++) ]-- > 0) {
                counter --;
            }
        }
        while (j < len2 && counter != 0) {
            if (count[s2.charAt(i++) ]++ >= 0) counter ++;
            if (count[s2.charAt(j++) ]-- > 0) counter --;
        } 
        return counter == 0;
    }
}