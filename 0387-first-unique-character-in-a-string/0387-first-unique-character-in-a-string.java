class Solution {
    public int firstUniqChar(String S) {
   HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        // Count frequency of each character
        for (char c : S.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Find the first non-repeating character
        for (char c : S.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                return S.indexOf(c);
            }
        }
        
        return -1;  
    }
}