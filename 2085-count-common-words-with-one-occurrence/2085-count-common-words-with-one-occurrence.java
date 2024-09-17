class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> hm1 = new HashMap<>();
        HashMap<String,Integer> hm2 = new HashMap<>();
        int numOfWords = 0;

        for(int i=0;i<words1.length;i++) {
                hm1.put(words1[i],hm1.getOrDefault(words1[i],0)+1);
        }

        for(int i=0;i<words2.length;i++) {
            hm2.put(words2[i],hm2.getOrDefault(words2[i],0)+1);
        }

        for(String s : hm1.keySet()) {
            if(hm2.containsKey(s) && hm2.get(s) == 1 && hm1.get(s) == 1) {
                numOfWords++;
            }
        }

        return numOfWords;
    }
}
