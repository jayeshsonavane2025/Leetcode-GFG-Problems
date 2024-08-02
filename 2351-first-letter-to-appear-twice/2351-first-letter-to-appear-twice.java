class Solution {
    public char repeatedCharacter(String s) {
        int appear = 0;
        
        int mask = 0;
        for (int i = 0; i < s.length(); i++) {
            mask = 1 << (s.charAt(i) - 'a');
            if ((appear & mask) != 0) {
                return s.charAt(i);
            }
            appear |= mask;
        }
        return '-';
    }
}