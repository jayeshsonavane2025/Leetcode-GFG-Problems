class Solution {
    public int firstUniqChar(String s) {
    Queue<Character> q=new LinkedList<>();
    int[] freq=new int[26];
     
    for(int i=0;i<s.length();i++){
      char c=s.charAt(i);
      q.offer(c);
      freq[c-'a']++;

      while(!q.isEmpty() && freq[q.peek()-'a']>1){
        q.poll();
      }
      
    } 
     return q.isEmpty()?-1:s.indexOf(q.peek());
    }
}