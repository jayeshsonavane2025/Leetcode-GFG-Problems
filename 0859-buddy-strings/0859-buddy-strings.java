class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!= goal.length()){
            return false;
        }
        HashSet<Character> set=new HashSet<>();
        if(s.equals(goal)){
           for(char c:s.toCharArray()){
               set.add(c);
           }
           if(set.size()<s.length()){
               return true;
           }
           return false;
        }
        ArrayList<Integer> diff=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=goal.charAt(i)) {
                diff.add(i);
            }
        }
        if(diff.size()==2 && s.charAt(diff.get(0))==goal.charAt(diff.get(1)) &&  s.charAt(diff.get(1))==goal.charAt(diff.get(0)) ){
            return true;
        }
        return false;

    }
}