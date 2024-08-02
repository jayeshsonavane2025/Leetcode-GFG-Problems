class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet();
        for (char c : s.toCharArray())  
            if (!set.add(c)) 
                return c;
				
        return 'a';// can't reach to this line, because there must be a letter appearing TWICE
    }
}