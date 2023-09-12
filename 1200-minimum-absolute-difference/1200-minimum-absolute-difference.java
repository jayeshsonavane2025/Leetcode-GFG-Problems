class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] a) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(a);
        int minDiff=Integer.MAX_VALUE;
        for(int i=1;i<a.length;i++){
            //minDiff=Math.min(minDiff,Math.abs(a[i]-a[i-1]));
            if(minDiff>Math.abs(a[i]-a[i-1])){
                minDiff=Math.abs(a[i]-a[i-1]);
            }
        }
        for(int i=1;i<a.length;i++){
            if(Math.abs(a[i]-a[i-1])==minDiff){
                List<Integer> temp=new ArrayList<>();
                temp.add(a[i-1]);
                temp.add(a[i]);
                list.add(temp);
                
            }
        }
       return list;
    }
}