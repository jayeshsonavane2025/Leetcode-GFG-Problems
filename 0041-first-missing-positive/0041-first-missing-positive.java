public class Solution {
	public int firstMissingPositive(int[] a) {
    	//You can code here
      HashSet<Integer> set=new HashSet<>();
      int n=a.length;
      for(int i=0;i<n;i++){
        set.add(a[i]);
      }
      for(int i=1;i<=n;i++){
        if(!set.contains(i)){
             return i;
        } 
      }

      return n+1;
 
	}
}
