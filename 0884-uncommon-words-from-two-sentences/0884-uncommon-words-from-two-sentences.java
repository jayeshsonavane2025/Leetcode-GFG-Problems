class Solution
{
    public String[] uncommonFromSentences(String s1, String s2)
    {
        HashMap<String,Integer> h = new HashMap<>();
        
        String[] a1 = s1.split(" ");
        String[] a2 = s2.split(" ");
        
        for(String s : a1)
            h.put(s, h.getOrDefault(s,0)+1);
        
        for(String s : a2)
            h.put(s, h.getOrDefault(s,0)+1);
        
        ArrayList<String> a = new ArrayList<>();
        
        for(HashMap.Entry<String,Integer> e : h.entrySet())
            if(e.getValue()==1)
                a.add(e.getKey());
        
        String[] r = new String[a.size()];
        
        for(int i=0, l=r.length; i<l; i++)
            r[i] = a.get(i);
        
        return r;
    }
}