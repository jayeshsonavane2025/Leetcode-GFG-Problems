class Solution {
    private Map<String, Boolean> memo = new HashMap<>();

    public boolean helper(String s,Set<String> wordSet){
        if (memo.containsKey(s)) {
            return memo.get(s);
        }
        if(s.length()==0)return true;
        
        for(int j = 1;j<=s.length();j++){
             String substring = s.substring(0, j);
             if(wordSet.contains(substring)){
                memo.put(substring, true);
                String rSubstring = s.substring(j);
                 if (helper(rSubstring, wordSet)) {
                    return true;
                }
             }
        }
        memo.put(s, false);
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        return helper(s,wordSet);
        
    }
}